import { html, render } from "../node_modules/lit-html/lit-html.js";
import { cats } from "./_02_CatsSeeder.js";
// import { LitElement } from "../node_modules/lit-element/lit-element.js";

function http_status_catsV1(){
    const htmlElements = {
        section: document.getElementById('allCats')
    }

    const catsList = cats;

    const ulEl = document.createElement('ul');
    catsList.forEach(e => {
        const liEl = document.createElement('li');
        liEl.id = `${e.id}${e.id}${e.id}`;

        const el = html `<img src="../images/cat${e.id}.jpg" width="250" height="250" alt="cat-img">
                         <div class="info">
                             <button class="showBtn" @click=${onClick}>Show status code</button>
                             <div class="status" style="display: none" id="100" on>
                                 <h4>Status Code: ${e.statusCode}</h4>
                                 <p>${e.statusMessage}</p>
                             </div>
                         </div>`;

        function onClick(e){
            e.preventDefault();

            if(e.target.nextElementSibling.style.display === 'none'){
                e.target.nextElementSibling.style.display = 'block';
            }else{
                e.target.nextElementSibling.style.display = 'none';
            }
        }

        render(el, liEl);
        ulEl.appendChild(liEl);
    });

    htmlElements.section.appendChild(ulEl);
}

http_status_catsV1();
