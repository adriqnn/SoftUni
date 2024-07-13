import { createUserDetails, userDetailsCheck } from "./helpers.js";

document.addEventListener('DOMContentLoaded', ()=> {
    const form = document.querySelector('form');
    form.addEventListener('submit', login);
});
document.addEventListener('DOMContentLoaded', activeNav);

async function login(event){
    event.preventDefault();
    await createUserDetails(event, 'login');
}

function activeNav(){
    userDetailsCheck();
}
