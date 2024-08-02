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

function http_status_catsV2(){
    class Cat extends LitElement{
        constructor(cat){
            super();
            this.id = cat.id;
            this.statusCode = cat.statusCode;
            this.statusMessage = cat.statusMessage;
            this.imageLocation = cat.imageLocation;
            this.state = { display: 'none' };
        }

        changeVisibility = () => {
            const oldValue = this.state.display;
            this.state.display === 'none' ? this.state.display = 'block' : this.state.display = 'none';

            this.requestUpdate(this.state.display, oldValue);
        }

        render(){
            return html `<img src="./images/${this.imageLocation}.jpg" width="250" height="250" alt="Card image cap">
                         <div class="info">
                             <button class="showBtn" @click=${this.changeVisibility}>
                                 Show status code
                             </button>
                             <div class="status" style="display: ${this.state.display}" id=${this.id}>
                                 <h4>Status Code: ${this.statusCode}</h4>
                                 <p>${this.statusMessage}</p>
                             </div>
                         </div>`;
        }
    }

    customElements.define('cat-comp', Cat);
    const catsHTML = cats => html `<ul>${cats.map(x => html `<li>${new Cat(x)}</li>`)}</ul>`;

    render(catsHTML(cats), document.getElementById('allCats'));
}
