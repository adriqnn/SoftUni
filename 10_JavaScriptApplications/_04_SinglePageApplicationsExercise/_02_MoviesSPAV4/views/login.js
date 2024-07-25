import { post } from "../src/api.js";
import { createSubmitHandler } from "../src/generalUtil.js";

const section = document.getElementById('form-login');
const form = section.querySelector('form');

section.remove();
createSubmitHandler(form, onSubmit);

let ctx = null;

export function showLogin(incCtx){
    ctx = incCtx;
    ctx.render(section);
}

async function onSubmit({ email, password }){
    const data = await post('/users/login', { email, password });

    const userDetails = {
        email: data.email,
        id: data._id,
        token: data.accessToken
    }

    form.reset();
    sessionStorage.setItem('userDetails', JSON.stringify(userDetails));

    ctx.checkUserNav();
    ctx.goTo('homePage');
}
