

function loggedUser(){
    return getUserDetails();
}

function getUserDetails(){
    return JSON.parse(sessionStorage.getItem('userDetails'));
}

export { loggedUser, getUserDetails };