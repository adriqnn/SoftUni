import { showView, loggedUser } from "./helpers.js";

function loadApplication(){
    const url = `http://localhost:3030/data/catches`;
    const html = {
        main: document.getElementById('html-main'),
        views: document.getElementById('views'),
        register: document.getElementById('register-view'),
        login: document.getElementById('login-view'),
        home: document.getElementById('home-view'),
        homeBtn: document.getElementById('home'),
        loginBtn: document.getElementById('login'),
        registerBtn: document.getElementById('register'),
    }

    const access = {
        user: document.getElementById('user'),
        guest: document.getElementById('guest'),
        greeting: document.getElementById('greeting')
    }

    showView('home', html);
    loggedUser(access);

    html.homeBtn.addEventListener('click', () => { showView('home', html) });
    html.loginBtn.addEventListener('click', () => { showView('login', html) });
    html.registerBtn.addEventListener('click', () => { showView('register', html) });


}

loadApplication();
