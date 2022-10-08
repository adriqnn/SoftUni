import { clearUserData, setUserData } from "../util.js";
import { get, post } from "./api.js";

//setup export async function login;
export async function login(email, password){
    //get the user
    const result = await post('/users/login', {email, password});
    //extract userData
    const userData = {
        id: result._id,
        username: result.username,
        email: result.email,
        gender: result.gender,
        accessToken: result.accessToken
    }
    //save userData
    setUserData(userData);
    //return result
    return result;
}
//setup export async function register;
export async function register(username, email, password, gender){
    //create the user
    const result = await post('/users/register', {username, email, password, gender});
    //extract userData
    const userData = {
        id: result._id,
        username: result.username,
        email: result.email,
        gender: result.gender,
        accessToken: result.accessToken
    }
    //save userData
    setUserData(userData);
    //return result
    return result;
}
//setup export non-async function logout that just clears the data without waiting;
export function logout(){
    //send request
    get('/users/logout');
    //clear data
    clearUserData();
}