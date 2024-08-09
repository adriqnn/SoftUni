import { get } from "../src/api.js";
import { home } from "../html/home.js";

export async function showHome(ctx){
    const data = await get('/data/catalog');
    ctx.render(home(data));
}