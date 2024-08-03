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
