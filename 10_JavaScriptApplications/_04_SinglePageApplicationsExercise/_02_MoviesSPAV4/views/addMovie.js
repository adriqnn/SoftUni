import { post } from "../src/api.js";
import { createSubmitHandler } from "../src/generalUtil.js";

const section = document.getElementById('add-movie');
const form = section.querySelector('form');

section.remove();
createSubmitHandler(form, onSubmit);

let ctx = null;

export function showAddMovie(incCtx){
    ctx = incCtx;
    ctx.render(section);
}

async function onSubmit(data){
    await post('/data/movies', data);
    
    form.reset();

    ctx.goTo('homePage');
}
