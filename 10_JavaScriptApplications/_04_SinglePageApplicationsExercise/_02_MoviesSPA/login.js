import { displayPage } from "./display.js";

function login(e){
    e.preventDefault();

    displayPage('login');
}

function logout(){
    displayPage('home');
}

export { login, logout };