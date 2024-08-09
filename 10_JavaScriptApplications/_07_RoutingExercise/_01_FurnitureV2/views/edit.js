import { get } from "../src/api.js";
import { edit } from "../html/edit.js";
import { saveData } from "../src/util.js";

export async function showEdit(ctx){
    const id = ctx.params.id;
    const item = await get(`/data/catalog/${id}`);

    ctx.render(edit(item, onSubmit));

    async function onSubmit(ev){
        await saveData(ev, `/data/catalog/${id}`);
        ctx.page.redirect('/catalog');
    }
}
