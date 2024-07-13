import { userDetailsCheck } from "./helpers.js";

document.addEventListener('DOMContentLoaded', logout);
document.addEventListener('DOMContentLoaded', activeNav);

function logout(){
    const logoutButton = document.getElementById('logoutBtn');
    const userData = JSON.parse(sessionStorage.getItem('userData'));

    logoutButton.addEventListener('click', async () => {
        if(userData){
            await fetch('http://localhost:3030/users/logout', {
                method: 'get',
                headers: { 'X-Authorization': userData.token }
            });

            sessionStorage.removeItem('userData');
            window.location = './index.html';
        }
    });
}

async function commonLoadContent(tableEl, place){
    try{
        const data = await itemsRequest();
        data.forEach(el => createHTMlElements(el, tableEl, place));
    }catch(err){
        alert(err.message);
    }
}

function activeNav(){
    userDetailsCheck();
}

async function itemsRequest(){
    const res = await fetch('http://localhost:3030/data/furniture');

    if(!res.ok){
        const error = await res.json();
        throw new Error(error.message);
    }

    return await res.json();
}

function createHTMlElements(el, tableEl, place){
    const tr = document.createElement('tr');
    tr.innerHTML = `<td>
                        <img src="${el.img}">
                    </td>
                    <td>
                        <p>${el.name}</p>
                    </td>
                    <td>
                        <p>${el.price}</p>
                    </td>
                    <td>
                        <p>${el.factor}</p>
                    </td>${place === 'catalog' ? `<td><input type="checkbox"/></td>` : ""}`;

    tableEl.appendChild(tr);
}

export { itemsRequest, commonLoadContent };
