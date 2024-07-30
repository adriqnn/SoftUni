import { get } from "./api.js";

const html = {
    credentialsHTML: document.querySelectorAll('nav li a'),
    greeting: document.querySelector('#greeting')
}

function loggedUser(){
    return getUserDetails();
}

function getUserDetails(){
    return JSON.parse(sessionStorage.getItem('userDetails'));
}

function checkUserNav(){
    const userDetails = JSON.parse(sessionStorage.getItem('userDetails'));

    if(userDetails){
        html.greeting.textContent = `Hello, ${userDetails.email}!`;
        html.credentialsHTML[0].style.display = 'block';
        html.credentialsHTML[1].style.display = 'block';
        html.credentialsHTML[2].style.display = 'block';
        html.credentialsHTML[3].style.display = 'none';
        html.credentialsHTML[4].style.display = 'none';
    }else{
        html.greeting.textContent = `Hello, Guest!`;
        html.credentialsHTML[0].style.display = 'block';
        html.credentialsHTML[1].style.display = 'none';
        html.credentialsHTML[2].style.display = 'none';
        html.credentialsHTML[3].style.display = 'block';
        html.credentialsHTML[4].style.display = 'block';
    }
}

function createSubmitHandler(form, callback){
    form.addEventListener('submit', onSubmit);

    function onSubmit(ev){
        ev.preventDefault();
        const formData = new FormData(form);
        callback(Object.fromEntries([...formData.entries()]));
    }
}

function onLogout(ctx){
    get('/users/logout');
    sessionStorage.removeItem('userDetails');

    ctx.checkUserNav();
    ctx.goTo('loginPage');
}

export { checkUserNav, getUserDetails, loggedUser, createSubmitHandler, onLogout };
