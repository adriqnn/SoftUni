import { displayPage } from "./display.js";
import { sendData } from "./helper.js";

const html = {
    registerForm: document.querySelector('#register-form')
}

html.registerForm.addEventListener('submit', registerSubmit);

async function register(e){
    e.preventDefault();
    await displayPage('register');
}

async function registerSubmit(e){
    e.preventDefault();
    await sendData(e, 'register');
}

export { register };