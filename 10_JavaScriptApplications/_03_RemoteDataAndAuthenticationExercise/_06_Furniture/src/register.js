import { createUserDetails, userDetailsCheck } from "./helpers.js";

document.addEventListener('DOMContentLoaded', ()=> {
    const form = document.querySelector('form');
    form.addEventListener('submit', register);
});
document.addEventListener('DOMContentLoaded', activeNav);

async function register(event){
    event.preventDefault();
    await createUserDetails(event, 'register');
}

function activeNav(){
    userDetailsCheck();
}
