import { register } from "../html/register.js";
import { saveData } from "../src/util.js";

export function showRegister(ctx){
    ctx.render(register(onSubmit));

    async function onSubmit(ev){
        await saveData(ev, '/users/register', 'user');
        ctx.page.redirect('/');
    }
}