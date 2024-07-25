import { get } from "./api.js";

const html = {
    credentialsHTML: document.querySelectorAll('nav li a')
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
        html.credentialsHTML[0].textContent = `Welcome, ${userDetails.email}!`;
        html.credentialsHTML[1].style.display = 'block';
        html.credentialsHTML[2].style.display = 'none';
        html.credentialsHTML[3].style.display = 'none';
    }else{
        html.credentialsHTML[0].textContent = `Welcome, guest!`;
        html.credentialsHTML[1].style.display = 'none';
        html.credentialsHTML[2].style.display = 'block';
        html.credentialsHTML[3].style.display = 'block';
    }
}

function onLogout(ctx){
    get('/users/logout');
    sessionStorage.removeItem('userDetails');
    ctx.checkUserNav();
    ctx.goTo('loginPage');
}

function createSubmitHandler(form, callback){
    form.addEventListener('submit', onSubmit);

    function onSubmit(ev){
        ev.preventDefault();
        const formData = new FormData(form);
        callback(Object.fromEntries([...formData.entries()]));
    }
}

export { loggedUser, getUserDetails, checkUserNav, createSubmitHandler, onLogout };
