import { render } from "../node_modules/lit-html/lit-html.js";
import page from '../node_modules/page/page.mjs';

import { homePage } from "./views/home.js";
import { loginPage } from "./views/login.js";
import { registerPage } from "./views/register.js";
import { myBooksPage } from "./views/my-books.js";
import { createPage } from "./views/create.js";
import { editPage } from "./views/edit.js";
import { searchPage } from "./views/search.js";
import { detailsPage } from "./views/details.js";

import { getUserData } from "./util.js";
import { logout } from "./api/data.js";

let root = document.getElementById('site-content');
document.getElementById('logoutBtn').addEventListener('click', (e) => {
    logout();
    updateUserNav();
    page.redirect('/');
});

page(decorateContext);
updateUserNav();

page('/', homePage)
page('/login', loginPage);
page('/register', registerPage);
page('/profile', myBooksPage);
page('/create', createPage);
page('/edit/:id', editPage);
page('/search', searchPage);
page('/details/:id', detailsPage);

page.start();

function decorateContext(ctx, next){
    ctx.render = (content) => render(content, root);
    ctx.updateUserNav = updateUserNav;

    next();
}

export function updateUserNav(){
    let userData =  getUserData();

    if(userData){
        document.getElementById('user').style.display = 'inline-block';
        document.getElementById('guest').style.display = 'none';
        document.querySelector('#user span').textContent = `Welcome, ${userData.email}!`;
    }else{
        document.getElementById('user').style.display = 'none';
        document.getElementById('guest').style.display = 'inline-block';
        document.querySelector('#user span').textContent = `Welcome, guest!`;
    }
}
