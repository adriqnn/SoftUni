import { get } from "../src/api.js";
import { catalog } from "../html/catalog.js";

export async function showCatalog(ctx){
    const data = await get('/data/catalog');
    ctx.render(catalog(data));
}
