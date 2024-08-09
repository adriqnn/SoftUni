import { get } from "../src/api.js";
import { account } from "../html/account.js";
import { getUserDetails } from "../src/util.js";

export async function showAccount(ctx){
    const userId = getUserDetails().id;
    const data = await get(`/data/catalog?where=_ownerId%3D%22${userId}%22`);

    ctx.render(account(data));
}
