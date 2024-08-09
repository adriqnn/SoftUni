import { get } from "../src/api.js";
import { details } from "../html/details.js";

export async function showDetails(ctx){
    const id = ctx.params.id;
    const item = await get(`/data/catalog/${id}`);

    ctx.render(details(item));
}
