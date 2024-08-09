import { login } from "../html/login.js";
import { saveData } from "../src/util.js";

export function showLogin(ctx){
    ctx.render(login(onSubmit));

    async function onSubmit(ev){
        await saveData(ev, '/users/login', 'user');
        ctx.page.redirect('/');
    }
}
