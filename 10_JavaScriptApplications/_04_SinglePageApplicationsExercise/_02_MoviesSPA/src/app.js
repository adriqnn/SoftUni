import { displayPage } from "./display.js";
import { login, logout } from "./login.js";
import { register } from "./register.js";
import { addMovie } from "./movies.js";

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
html.addMovieBtn.addEventListener('click', addMovie);

function run(){
    home();
}

run();

function home(){
    displayPage('home');
}

function homeButton(e){
    e.preventDefault();
    home();
}
