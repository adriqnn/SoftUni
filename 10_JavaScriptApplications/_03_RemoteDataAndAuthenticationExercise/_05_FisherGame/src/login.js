import { getUserDetails, loggedUser, sendData, showView } from "./helpers.js";

async function login(e){
    e.preventDefault();
    await sendData(e, 'login');
}

async function logout(e){
    e.preventDefault();

    const userDetails = getUserDetails();

    await fetch('http://localhost:3030/users/logout', {
        headers: {
            'Content-Type': 'application/json',
            'X-Authorization': userDetails.token
        }
    });

    sessionStorage.clear();

    loggedUser();
    showView('home');
}

export { login, logout };
