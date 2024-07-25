import { post } from "../src/api.js";
import { createSubmitHandler } from "../src/generalUtil.js";

const section = document.getElementById('form-sign-up');
const form = section.querySelector('form');

section.remove();
createSubmitHandler(form, onSubmit);

let ctx = null;

export function showRegister(incCtx){
    ctx = incCtx;
    ctx.render(section);
}

async function onSubmit({ email, password, repeatPassword }){
    if(email === '' || password === ''){
        return alert('All fields are required!');
    }

    if(password !== repeatPassword){
        return alert('Passwords don\'t match!');
    }

    const data = await post('/users/register', { email, password });

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
