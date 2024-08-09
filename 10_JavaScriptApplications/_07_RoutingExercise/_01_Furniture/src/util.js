import page from '../../node_modules/page/page.mjs';
import  {get, post, put, del } from "./api.js";

const html = {
    guest: document.querySelector('#guest'),
    user: document.querySelector('#user')
}

function loggedUser(){
    return getUserDetails();
}

function getUserDetails(){
    return JSON.parse(sessionStorage.getItem('userDetails'));
}

function checkUserNav(ctx, next){
    const userDetails = getUserDetails();

    if(userDetails){
        html.user.style.display = 'inline';
        html.guest.style.display = 'none';
    }else{
        html.user.style.display = 'none';
        html.guest.style.display = 'inline';
    }

    next();
}

function createSubmitHandler(form, callback){
    form.addEventListener('submit', onSubmit);

    function onSubmit(ev){
        ev.preventDefault();
        const formData = new FormData(form);
        callback(Object.fromEntries([...formData.entries()]));
    }
}

function onLogout(){
    get('/users/logout');
    sessionStorage.removeItem('userDetails');
    page.redirect('/login');
}

function deleteItem(ctx){
    const id = ctx.params.id;
    del(`/data/catalog/${id}`);
    ctx.page.redirect('/catalog');
}

async function saveData(ev, target, user){
    ev.preventDefault();

    const formData = new FormData(ev.target);
    const obj = Object.fromEntries([...formData.entries()]);

    let data = null;

    if(ev.target.id){
        data = await put(target, obj);
    }else{
        data = await post(target, obj);
    }

    if(user){
        const userDetails = {
            email: data.email,
            id: data._id,
            token: data.accessToken
        }

        sessionStorage.setItem('userDetails', JSON.stringify(userDetails));

        return;
    }

    ev.target.reset();
}

export { checkUserNav, getUserDetails, loggedUser, createSubmitHandler, saveData, onLogout, deleteItem };