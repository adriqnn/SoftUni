import { login } from '../api/users.js';
import {html} from '../lib.js'
//create login template add submit handler in form that executes a function
const loginTemplate = (onSubmit) => html `
<section id="login">
    <form @submit=${onSubmit} id="login-form">
        <div class="container">
            <h1>Login</h1>
            <label for="email">Email</label>
            <input id="email" placeholder="Enter Email" name="email" type="text">
            <label for="password">Password</label>
            <input id="password" type="password" placeholder="Enter Password" name="password">
            <input type="submit" class="registerbtn button" value="Login">
            <div class="container signin">
                <p>Dont have an account?<a href="/register">Sign up</a>.</p>
            </div>
        </div>
    </form>
</section>`;
//export function that loads the view by rendering it;
export function loginView(ctx){
    //giving the function to the template;
    ctx.render(loginTemplate(onSubmit));
    //function that uses the form data;
    async function onSubmit(event){
        //prvent default;
        event.preventDefault();
        //get the form data from the event.taret form;
        const formData = new FormData(event.target);
        //get fields;
        const email = formData.get('email').trim();
        const password = formData.get('password').trim();
        //validate fields;
        if(email == '' || password == ''){
            return alert('All fields are required!');
        }
        //await async login;
        await login(email, password);
        //update nav;
        ctx.updateNav();
        //redirect;
        ctx.page.redirect('/memes');
    }
}