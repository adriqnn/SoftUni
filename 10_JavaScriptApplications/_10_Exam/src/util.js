//get user data;
export function getUserData(){
    return JSON.parse(sessionStorage.getItem('userData'));
}
//set user data;
export function setUserData(data){
    sessionStorage.setItem('userData', JSON.stringify(data));
}
//clear user data;
export function clearUserData(){
    sessionStorage.removeItem('userData');
}