import { showView, loggedUser } from "./helpers.js";
import { login, logout } from "./login.js";
import { register } from "./register.js";
import { loadCatches, addCatch } from "./home.js";

function loadApplication(){
    const url = `http://localhost:3030/data/catches`;
    const html = {
        homeBtn: document.getElementById('home'),
        loginBtn: document.getElementById('login'),
        registerBtn: document.getElementById('register'),
        loginForm: document.getElementById('loginForm'),
        registerForm: document.getElementById('registerForm'),
        loginFormBtn: document.querySelector('#loginForm button'),
        registerFormBtn: document.querySelector('#registerForm button'),
        logoutBtn: document.getElementById('logout'),
        loadBtn: document.querySelector('button.load'),
        addBtn: document.querySelector('#addForm button')
    }

    showView('home');
    loggedUser();

    html.homeBtn.addEventListener('click', () => { showView('home', html) });
    html.loginBtn.addEventListener('click', () => { showView('login', html) });
    html.registerBtn.addEventListener('click', () => { showView('register', html) });

    html.loginFormBtn.addEventListener('click', (e) => login(e));
    html.registerFormBtn.addEventListener('click', register);
    html.logoutBtn.addEventListener('click', logout);

    html.loadBtn.addEventListener('click', loadCatches);
    html.addBtn.addEventListener('click', addCatch);
}

loadApplication();
