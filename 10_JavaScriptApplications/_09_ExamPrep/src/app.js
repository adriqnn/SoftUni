import { logout } from './api/users.js';
import {page, render} from './lib.js';
import { getUserData } from './util.js';
import { catalogView } from './views/catalog.js';
import { createView } from './views/create.js';
import { detailsView } from './views/details.js';
import { editView } from './views/edit.js';
import { homeView } from './views/home.js';
import { loginView } from './views/login.js';
import { profileView } from './views/profile.js';
import { registerView } from './views/register.js';
//get main element from the page;
const main = document.querySelector('main');
//select logout button and add event listerner;
document.getElementById('logoutBtn').addEventListener('click', onLogout);
//adding the middleware function to the page without route before the routing;
page(decorateContext);
//add all the routes needed for the application using page.mjs;
page('/', homeView);
page('/memes', catalogView);
page('/memes/:id', detailsView);
page('/edit/:id', editView);
page('/login', loginView);
page('/register', registerView);
page('/create', createView);
page('/profile', profileView);

//render on start of application;
updateNav();
//starts the application;
page.start();
//middleware to import the renderMain function inside the context;
function decorateContext(ctx, next){
    //adding the renderMain function to context:
    ctx.render = renderMain;
    //adding updateNav function to context;
    ctx.updateNav = updateNav;
    //calling next to continue with the context carry;
    next();
}
//function that renders the templates for the views within the context using the main element;
function renderMain(templateResult){
    render(templateResult, main);
}
//function that shows/hides html elements based on user/guest;
function updateNav(){
    //chekc if there is user data
    const userData = getUserData();
    if(userData){
        //if user laod those
        document.querySelector('.user').style.display = 'block';
        document.querySelector('.guest').style.display = 'none';
        document.querySelector('.user span').textContent = `Welcome, ${userData.email}`
    }else{
        //if guest load those
        document.querySelector('.user').style.display = 'none';
        document.querySelector('.guest').style.display = 'block';
    }
}
//function for logout;
function onLogout(){
    //logout
    logout();
    //update nav
    updateNav();
    //redirect
    page.redirect('/');
}