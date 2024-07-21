import { displayPage } from "./display.js";

function addMovie(e){
    e.preventDefault();

    displayPage('addMovie');
}

export { addMovie };