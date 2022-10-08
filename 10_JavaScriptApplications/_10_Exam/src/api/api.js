import { clearUserData, getUserData } from "../util.js";

//url that is constant for all requests;
const host = `http://localhost:3030`;

//async function for requests to server has url, method for the request and data;
async function request(url, method, data){
    //options with method and empty header based on request;
    const options = {
        method,
        headers: {}
    }
    //check if we have data:
    if(data != undefined){
        options.headers['Content-Type'] = 'application/json';
        options.body = JSON.stringify(data);
    }
    //getting user data;
    const userData = getUserData();
    //if there is user data authorized requests;
    if(userData){
        options.headers['X-Authorization'] = userData.accessToken;
    }
    //try-catch for the response structure checks;
    try{
        //response from fetch;
        const res = await fetch(host + url, options);
        //check if the response is ok otherwise throw;
        if(res.ok == false){
            //check for token error and soft-lock;
            if(res.status == 403){
                clearUserData();
            }
            //throw error message;
            const error = await res.json()
            throw new Error(error.message);
        }
        //check if the response has data or doesnt have data, which throws exception if we try to turn it into json with .json();
        if(res.status == 204){
            return res;
        }else{
            return res.json();
        }
    }catch(err){
        //send alert to user;
        alert(err.message);
        //return err;
        throw err;
    }
}

//decorated function for all 4 requests;
//get;
export async function get(url){
    return request(url, 'get')
}
//post;
export async function post(url, data){
    return request(url, 'post', data);
}
//put;
export async function put(url, data){
    return request(url, 'put', data);
}
//delete;
export async function del(url){
    return request(url, 'delete');
}