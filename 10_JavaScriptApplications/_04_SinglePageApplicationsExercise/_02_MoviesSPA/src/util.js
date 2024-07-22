function loggedUser(){
    return getUserDetails();
}

function getUserDetails(){
    return JSON.parse(sessionStorage.getItem('userDetails'));
}

function hasEmptyStrings(obj){
    return Object.values(obj).some((e) => e === '');
}

function clearFields(arr){
    arr.forEach(x => x.value = '');
}

export { loggedUser, getUserDetails, hasEmptyStrings, clearFields };