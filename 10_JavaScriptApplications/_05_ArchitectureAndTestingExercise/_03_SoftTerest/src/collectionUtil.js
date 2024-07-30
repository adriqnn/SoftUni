import { del } from "./api.js";

export async function onDelete(ctx, ideaId){
    await del(`/data/ideas/${ideaId}`);
    ctx.goTo('homePage');
}
