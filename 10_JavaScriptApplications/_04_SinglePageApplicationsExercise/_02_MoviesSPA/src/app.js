import { displayPage } from "./display.js";
import { login, logout } from "./login.js";
import { register } from "./register.js";

const html = {
    homeBtn: document.querySelector('a.navbar-brand'),
    loginBtn: document.getElementById('login'),
    registerBtn: document.getElementById('register'),
    logoutBtn: document.getElementById('logout'),
    addMovieBtn: document.getElementById('add-movie-button')
}

html.homeBtn.addEventListener('click', homeButton);
html.loginBtn.addEventListener('click', login);
html.registerBtn.addEventListener('click', register);
html.logoutBtn.addEventListener('click', logout);
html.addMovieBtn.addEventListener('click', (e) =>  displayPage('addMovie', e));

function run(){
    home();
}

function home(){
    displayPage('home');
}

function homeButton(e){
    e.preventDefault();
    home();
}

run();

