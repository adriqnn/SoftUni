import { html, render } from "../node_modules/lit-html/lit-html.js";

function list_of_townsV1(){
    const htmlElements = {
        input: document.getElementById('towns'),
        btn: document.getElementById('btnLoadTowns'),
        root: document.getElementById('root')
    }

    htmlElements.btn.addEventListener('click', (e) => {
        e.preventDefault();

        let input = htmlElements.input.value;
        let townsList = input.split(', ');

        let cardTemplate = html `<ul>${townsList.map(t => html `<li>${t}</li>`)}</ul>`;

        render(cardTemplate, htmlElements.root);
    });
}

list_of_townsV1();
