import { register } from '../api/users.js';
import {html} from '../lib.js'
//create register template add submit handler in form that executes a function
const registerTemplate = (onSubmit) => html `
<section id="register">
    <form @submit=${onSubmit} id="register-form">
        <div class="container">
            <h1>Register</h1>
            <label for="username">Username</label>
            <input id="username" type="text" placeholder="Enter Username" name="username">
            <label for="email">Email</label>
            <input id="email" type="text" placeholder="Enter Email" name="email">
            <label for="password">Password</label>
            <input id="password" type="password" placeholder="Enter Password" name="password">
            <label for="repeatPass">Repeat Password</label>
            <input id="repeatPass" type="password" placeholder="Repeat Password" name="repeatPass">
            <div class="gender">
                <input type="radio" name="gender" id="female" value="female">
                <label for="female">Female</label>
                <input type="radio" name="gender" id="male" value="male" checked>
                <label for="male">Male</label>
            </div>
            <input type="submit" class="registerbtn button" value="Register">
            <div class="container signin">
                <p>Already have an account?<a href="/login">Sign in</a>.</p>
            </div>
        </div>
    </form>
</section>`;
//export function that loads the view by rendering it;
export function registerView(ctx){
    //giving the function to the template;
    ctx.render(registerTemplate(onSubmit));
    //function that uses the form data;
    async function onSubmit(event){
        //prvent default;
        event.preventDefault();
        //get the form data from the event.taret form;
        const formData = new FormData(event.target);
        //get fields;
        const username = formData.get('username').trim();
        const email = formData.get('email').trim();
        const password = formData.get('password').trim();
        const repas = formData.get('repeatPass').trim();
        const gender = formData.get('gender');
        //validate fields;
        if(username == '' || email == '' || password == '' || repas == ''){
            return alert('All fields are required!');
        }
        if(password != repas){
            return alert("Passwords dont\'t match");
        }
        //await async login;
        await register(username, email, password, gender);
        //update nav;
        ctx.updateNav();
        //redirect;
        ctx.page.redirect('/memes');
    }
}