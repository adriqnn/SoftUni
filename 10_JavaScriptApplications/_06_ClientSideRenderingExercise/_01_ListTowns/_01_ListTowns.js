import { html, render } from "../node_modules/lit-html/lit-html.js";

function list_townsV1(){
    const htmlElements = {
        input: document.getElementById('towns'),
        btn: document.getElementById('btnLoadTowns'),
        root: document.getElementById('root')
    }

    htmlElements.btn.addEventListener('click', (e) => {
        e.preventDefault();

        let input = htmlElements.input.value;
        let townsList = input.split(', ');

        let cardTemplate = html `<ul>${townsList.map(e => html `<li>${e}</li>`)}</ul>`;

        render(cardTemplate, htmlElements.root);
    });
}

list_townsV1();

function list_townsV2(){
    const townTemplate = (name) => html `<li>${name}</li>`;
    const townsTemplate = (townsNames) => html `<ul>${townsNames.map(x => townTemplate(x))}</ul>`;

    document.getElementsByTagName('form')[0].addEventListener('submit', e => {
        e.preventDefault();

        const formData = new FormData(e.target);
        const data = [...formData.values()][0].split(', ');

        render(townsTemplate(data), document.getElementById('root'));
    });
}

function list_townsV3(){
    document.getElementById('btnLoadTowns').addEventListener('click', (e) => {
        e.preventDefault();

        let input = document.querySelector("#towns").value;
        let townList = input.split(', ');
        let cardTemplate = html `<ul>${townList.map(t => html `<li>${t}</li>`)}</ul>`;

        let root = document.getElementById('root');
        render(cardTemplate, root);
    });
}
