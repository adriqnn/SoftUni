import { create } from "../html/create.js";
import { saveData } from "../src/util.js";

export function showCreate(ctx){
    ctx.render(create(onSubmit));

    async function onSubmit(ev){
        await saveData(ev, '/data/catalog');
        ctx.page.redirect('/catalog');
    }
}