import { showHome } from "../views/home.js";
import { showLogin } from "../views/login.js";
import { showRegister } from "../views/register.js";
import { showAddMovie } from "../views/addMovie.js";
import { showEditMovie } from "../views/editMovie.js";
import { showDetailsMovie } from "../views/detailsMovie.js";

import { checkUserNav, onLogout } from "./generalUtil.js";
import { onDeleteMovie, onLikeMovie, onUnlikeMovie } from "./movieUtil.js";

import { render } from "./render.js";

document.querySelector('nav').addEventListener('click', navigate);

const sections = {
    'homePage': showHome,
    'addMoviePage': showAddMovie,
    'editMoviePage': showEditMovie,
    'movieDetailsPage': showDetailsMovie,
    'loginPage': showLogin,
    'registerPage': showRegister,
    'logoutBtn': onLogout,
    'likeMovieBtn': onLikeMovie,
    'unlikeMovieBtn': onUnlikeMovie,
    'deleteMovieBtn': onDeleteMovie
}

checkUserNav();
goTo('homePage');

function navigate(ev){
    if(ev.target.tagName === 'A'){
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
