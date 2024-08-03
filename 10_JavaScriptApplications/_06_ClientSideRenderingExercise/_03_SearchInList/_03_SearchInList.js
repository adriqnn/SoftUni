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

function search_in_listV2(){
    document.querySelector('body').innerHTML = '';

    const template = (towns) => html`<article>
                                         <div id="towns">
                                             <ul>${towns.map(x => html`
                                                 <li>${x}</li>`)}
                                             </ul>
                                         </div>
                                         <input type="text" id="searchText"/>
                                         <button>Search</button>
                                         <div id="result"></div>
                                     </article>`;


    render(template(towns), document.querySelector('body'));

    document.addEventListener('click', e => {
        if(e.target.tagName === 'BUTTON'){
            const value = document.getElementById(`searchText`).value;
            const towns = [...document.getElementsByTagName('li')];
            
            let counter = 0

            towns.forEach(x => {
                x.className = '';
                
                if(x.innerText.toLocaleLowerCase().includes(value.toLocaleLowerCase())){
                    x.className = 'active';
                    counter += 1;
                }
            });

            document.getElementById('result').innerText = counter !== 0 ? `${counter} matches found` : '';
        }
    });
}

function search_in_listV3(){
    let cardTemplate = html `<ul>${towns.map(item => html `<li id=${item}>${item}</li>`)}</ul>`;

    let card = document.getElementById('towns');
    render(cardTemplate, card);

    document.querySelector('button').addEventListener('click', search);

    function search(){
        let text = document.getElementById('searchText').value;

        let result = towns.filter(t => {
            if(t.toLowerCase().includes(text.toLowerCase())){
                let match = document.getElementById(`${t}`);
                match.setAttribute('class', 'active');

                return t;
            }
        });
        
        let resultHTML = document.getElementById('result');
        resultHTML.textContent = `${result.length} matches found`;
    }
}
