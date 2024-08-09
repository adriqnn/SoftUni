import page from '../../node_modules/page/page.mjs';
import { render as litRender } from '../../node_modules/lit-html/lit-html.js';

import { showHome } from "../views/home.js";
import { showRegister } from "../views/register.js";
import { showLogin } from "../views/login.js";
import { showAccount } from "../views/account.js";
import { showCreate } from "../views/create.js";
import { showEdit } from "../views/edit.js";
import { showCatalog } from "../views/catalog.js";
import { showDetails } from "../views/details.js";

import { checkUserNav, deleteItem, onLogout } from "./util.js";

const main = document.querySelector('#main');

const logout = document.querySelector('#logoutBtn')
logout.addEventListener('click', onLogout);

page(decorateContext);
page(checkUserNav);

page('/', showHome);
page('/index.html', () => page.redirect('/'));
page('/login', showLogin);
page('/register', showRegister);
page('/profile', showAccount);
page('/create', showCreate);
page('/catalog', showCatalog);
page('/details-:id', showDetails);
page('/details-:id/edit', showEdit);
page('/details-:id/delete', deleteItem);
page('*', showHome);

page.start();

function render(templateResult){
    litRender(templateResult, main);
}

function decorateContext(ctx, next){
    ctx.render = render;
    next();
}

function notFound(ctx){
    ctx.render('Not Found');
}
