import { displayPage } from "./display.js";
import { sendData } from "./helper.js";
import { logoutReq } from "./requests.js";

const html = {
    loginForm: document.querySelector('#login-form')
}

html.loginForm.addEventListener('submit', loginSubmit);

async function login(e){
    e.preventDefault();
    await displayPage('login');
}

async function loginSubmit(e){
    e.preventDefault();
    await sendData(e, 'login');
}

async function logout(e){
    e.preventDefault();

    logoutReq();
    sessionStorage.clear();

    await displayPage('login');
}

export { login, logout };
