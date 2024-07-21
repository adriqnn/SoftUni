import { displayPage } from "./display.js";

function register(e){
    e.preventDefault();

    displayPage('register');
}

export { register };