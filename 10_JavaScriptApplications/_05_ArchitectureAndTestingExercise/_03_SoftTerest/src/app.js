import { showHome } from "../views/home.js";
import { showLogin } from "../views/login.js"
import { showRegister } from "../views/register.js"
import { showCreate } from "../views/create.js";
import { showCatalog } from "../views/catalog.js";
import { showDetails } from "../views/details.js";

import { checkUserNav, onLogout } from "./util.js";
import { onDelete } from "./collectionUtil.js";

import { render } from "./render.js";

document.querySelector('nav').addEventListener('click', navigate);

const sections = {
    'homePage': showHome,
    'loginPage': showLogin,
    'registerPage': showRegister,
    'logoutBtn': onLogout,
    'createPage': showCreate,
    'catalogPage': showCatalog,
    'detailsPage': showDetails,
    'deleteBtn': onDelete
}

checkUserNav();
goTo('homePage');

function navigate(ev){
    if(ev.target.tagName === 'A' || ev.target.tagName === 'IMG'){
        const viewName = ev.target.id;

        if(goTo(viewName)){
            ev.preventDefault();
        }
    }
}

function goTo(viewName, pageDetails){
    const view = sections[viewName];

    if(typeof view === 'function'){
        view({ render, goTo, checkUserNav }, pageDetails);

        return true;
    }else{
        return false;
    }
}
