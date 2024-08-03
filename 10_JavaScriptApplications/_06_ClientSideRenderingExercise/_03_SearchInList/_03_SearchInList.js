import { html, render } from "../node_modules/lit-html/lit-html.js";
import { towns } from "./_03_Towns.js";

function search_in_listV1(){
   const htmlElements = {
       towns: document.getElementById('towns'),
       input: document.getElementById('searchText'),
       btn: document.querySelector('button'),
       result: document.getElementById('result')
   }

   const ulEl = document.createElement('ul');
   const liEl = (e) => html `<li>${e}</li>`;

   render(towns.map(e => liEl(e)), ulEl);
   htmlElements.towns.appendChild(ulEl);

   htmlElements.btn.addEventListener('click', onClick);

   function onClick(){
       const search = htmlElements.input.value.toLowerCase();
       const liList = document.querySelectorAll('li');

       htmlElements.result.innerHTML = '';

       if(search === ''){
           return;
       }

       liList.forEach(e => {
           e.style.fontWeight = 'normal';
           e.style.textDecoration = 'none';
       });

       let filtered = [...liList].filter(e => e.textContent.toLowerCase().includes(search)).map(e => {
           e.style.fontWeight = 'bold';
           e.style.textDecoration = 'underline';
       });

       htmlElements.result.textContent = `${filtered.length} matches found.`;
   }
}

search_in_listV1();

