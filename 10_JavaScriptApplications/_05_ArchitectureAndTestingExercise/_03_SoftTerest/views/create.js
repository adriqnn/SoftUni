import { post } from "../src/api.js";
import { createHTML } from "../html/create.js";
import { createSubmitHandler } from "../src/util.js";

const section = createHTML;
const form = section.querySelector('form');

let ctx = null;
createSubmitHandler(form, onSubmit);

export function showCreate(incCtx){
    ctx = incCtx;
    ctx.render(section);
}

async function onSubmit(data){
    await post('/data/ideas', data);

    form.reset();

    ctx.goTo('catalogPage');
}
