import { post } from "../src/api.js";
import { registerHTML } from "../html/register.js";
import { createSubmitHandler } from "../src/util.js";

const section = registerHTML;
const form = section.querySelector('form');
const login = section.querySelector('#sign-in');

let ctx = null;
createSubmitHandler(form, onSubmit);

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
        id: data.id,
        token: data.accessToken
    }

    form.reset();
    sessionStorage.setItem('userDetails', JSON.stringify(userDetails));

    ctx.checkUserNav();
    ctx.goTo('homePage');
}

login.addEventListener('click', (e) => {
    e.preventDefault();
    ctx.goTo('loginPage');
    document.getElementById('loginPage').style.display = 'focus';
});
