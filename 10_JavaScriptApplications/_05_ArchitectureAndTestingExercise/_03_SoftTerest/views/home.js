import { homeHTML } from "../html/home.js";

const section = homeHTML;
const catalogBtn = section.querySelector('#go-to-catalog');

catalogBtn.addEventListener('click', showCatalog);

let ctx = null;

export function showHome(incCtx){
    ctx = incCtx;
    ctx.render(section);
}

function showCatalog(e){
    e.preventDefault();
    ctx.goTo('catalogPage');
}
