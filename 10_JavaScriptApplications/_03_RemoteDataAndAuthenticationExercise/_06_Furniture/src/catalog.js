import { clearFields, getUserDetails } from "./helpers.js";
import { commonLoadContent } from "./common.js";

if(window.location.pathname.endsWith('/create.html')){
    document.addEventListener('DOMContentLoaded', () => {
        const html = {
            create: document.querySelector('form')
        }

        html.create.addEventListener('submit', createEntry);
    });
}

if(window.location.pathname.endsWith('/catalog.html')){
    const html = {
        buyBtn: document.querySelector('.table').nextElementSibling,
        allOrdersBtn: document.querySelector('.orders button')
    }

    document.addEventListener('DOMContentLoaded', loadContent);
    html.buyBtn.addEventListener('click', buyItems);
    html.allOrdersBtn.addEventListener('click', showAllOrders);
}

const url = `http://localhost:3030/data/furniture`;
const orders = `http://localhost:3030/data/orders`;

async function createEntry(e){
    e.preventDefault();

    const formData = new FormData(e.target);
    const data = Object.fromEntries([...formData.entries()]);

    const entry = {
        name: data.name,
        price: data.price,
        factor: data.factor,
        img: data.img
    }

    const hasEmptyStrings = Object.values(entry).some((e) => e === '');

    try{
        if(hasEmptyStrings){
            throw new Error('All fields required!');
        }

        const userDetails = getUserDetails();
        const res = await fetch(`${url}`, {
            method: 'post',
            headers: { 'Content-Type': 'application/json', 'X-Authorization': userDetails.token },
            body: JSON.stringify(entry)
        });

        if(!res.ok){
            const error = await res.json();
            throw new Error(error.message);
        }

        const data = await res.json();

        clearFields(document.querySelectorAll(`#addForm input`));
        window.location = './index.html';
    }catch(err){
        alert(err.message);
    }
}

async function loadContent(){
    const table = document.querySelector('.table tbody');
    await commonLoadContent(table, 'catalog');
}

async function buyItems(){
    const user = getUserDetails();

    if(user){
        const checkboxes = Array.from(document.querySelectorAll('[type="checkbox"]')).filter(e => e.checked);

        for (const e of checkboxes) {
            const parent = e.parentElement.parentElement;

            const item = {
                name: Array.from(parent.children)[1].firstElementChild.textContent,
                price: Array.from(parent.children)[2].firstElementChild.textContent
            }

            try{
                const res = await fetch(orders, {
                    method: 'post',
                    headers: { "Content-Type": "application/json", "X-Authorization": user.token },
                    body: JSON.stringify(item)
                });

                if(!res.ok){
                    const error = await res.json();
                    throw new Error(error.message);
                }
            }catch(err){
                alert(err.message);
            }
        }
    }
}

async function showAllOrders(){
    const user = getUserDetails();

    if(user){
        try{
            const fetchURL = `${orders}?where=_ownerId%3D${user.id}`;
            console.log(fetchURL);

            const res = await fetch(`${orders}?where=_ownerId%3D"${user.id}"`);
            // const res = await fetch(`http://localhost:3030/data/orders?where=_ownerId%3D"${user.id}"`);

            if(!res.ok){
                const error = await res.json();
                throw new Error(error.message);
            }

            const data = await res.json();
            let dataNameString = [];
            let price = 0;

            data.forEach(e => {
               dataNameString.push(e.name);
               price += Number(e.price);
            });


            const ordersContainer = document.querySelector('.orders');
            ordersContainer.firstElementChild.innerHTML = `Bought furniture: <span>${dataNameString.join(', ')}</span>`;
            ordersContainer.firstElementChild.nextElementSibling.innerHTML = `<p>Total price: <span>${price} $</span></p>`;
        }catch(err){
            alert(err.message);
        }
    }
}
