import { post } from "../src/api.js";
import { loginHTML } from "../html/login.js";
import { createSubmitHandler } from "../src/util.js";

const section = loginHTML;
const form = section.querySelector('form');
const register = section.querySelector('#sign-up');

let ctx = null;
createSubmitHandler(form, onSubmit);

export function showLogin(incCtx){
    ctx = incCtx;
    ctx.render(section);
}

async function onSubmit({ email, password}){
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

register.addEventListener('click', (e) => {
    e.preventDefault();
    ctx.goTo('registerPage');
    document.getElementById('registerPage').style.display = 'focus';
});
