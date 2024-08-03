import { html, render } from "../node_modules/lit-html/lit-html.js";

function fill_dropdownV1(){
    const htmlElements = {
        select: document.getElementById('menu'),
        item: document.getElementById('itemText'),
        submit: document.querySelector('input[type=submit]')
    }

    generateOptions();
    htmlElements.submit.addEventListener('click', onSubmit);

    async function generateOptions(){
        try{
            const res = await fetch('http://localhost:3030/jsonstore/advanced/dropdown');

            if(!res.ok){
                throw new Error('Try again later!');
            }

            const options = await res.json();
            const optionTemplate = (e) => html `<option value="${e._id}">${e.text}</option>`;

            render(Object.values(options).map(e => optionTemplate(e)), htmlElements.select);
        }catch(err){
            console.log(err.message);
        }
    }

    async function onSubmit(e){
        e.preventDefault();

        let text = htmlElements.item.value;

        await fetch('http://localhost:3030/jsonstore/advanced/dropdown', {
            method: 'post',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ text })
        });

        await generateOptions();
    }
}

fill_dropdownV1();

async function fill_dropdownV2(){
    document.querySelector('body').innerHTML = '';
    const option = ({ text, _id }) => html `<option value=${_id}>${text}</option>`;
    const dropdownTemp = (options) => html `<h1>Dropdown Menu</h1>
                                                <article>
                                                    <div>
                                                        <select id="menu">
                                                            ${options.map(x => option(x))}
                                                        </select>
                                                    </div>
                                                    <form>
                                                        <label for="itemText">Text:</label>
                                                        <input type="text" id="itemText"/>
                                                        <input type="submit" value="Add">
                                                    </form>
                                                </article>`;

    async function drawOptions (){
        const data = await getData();
        render(dropdownTemp(Object.values(data)), document.querySelector('body'));
    }

    await drawOptions();

    document.addEventListener('submit', async e => {
        e.preventDefault();
        const input = document.getElementById(`itemText`);

        await postEntry({ text: input.value});
        await drawOptions();
        input.value = '';
    });

    async function checkOkToJSON (response){
        if(!response.ok){
            throw new Error(response.status);
        }

        return await response.json();
    }

    async function getData (){
        const response = await fetch('http://localhost:3030/jsonstore/advanced/dropdown ');
        return await checkOkToJSON(response);
    }

    async function postEntry (entry) {
        const response = await fetch('http://localhost:3030/jsonstore/advanced/dropdown ', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(entry)
        });

        return await checkOkToJSON(response);
    }
}


async function fill_dropdownV3(){
    async function getAllItems(){
        const response = await fetch('http://localhost:3030/jsonstore/advanced/dropdown');
        let data = await response.json();

        return data;
    }

    let items = Object.values(await getAllItems());

    let cardTemplate = html `${items.map((item) => html `<option value=${item._id}>${item.text}</option>`)}`;
    let main = document.getElementById('menu');

    render(cardTemplate, main);

    document.querySelector('input[type="submit"]').addEventListener('click', addItem);

    async function addItem(e){
        e.preventDefault();

        let text = document.querySelector('#itemText').value;
        let response = await fetch('http://localhost:3030/jsonstore/advanced/dropdown', {
            method: 'post',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ text })
        });

        let data = await response.json();
        items.push(data);

        if(response.ok){
            cardTemplate = html `${items.map(item => html `<option value=${item._id}>${item.text}</option>`)}`;
            render(cardTemplate, main);
        }
    }
}
