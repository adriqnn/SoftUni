const host = 'http://localhost:3030';

async function request(method, url, data){
    const options = {
        method,
        headers: {}
    };

    if(data !== undefined){
        options.headers['Content-Type'] = 'application/json';
        options.body = JSON.stringify(data);
    }

    const userDetails = JSON.parse(sessionStorage.getItem('userDetails'));

    if(userDetails !== null){
        options.headers['X-Authorization'] = userDetails.token;
    }

    try{
        const res = await fetch(host + url, options);

        if(res.ok === false){
            const error = await res.json();
            throw Error(error.message);
        }

        if(res.status === 204){
            return res;
        }else{
            return await res.json();
        }
    } catch (err) {
        alert(err.message);
        throw err;
    }
}

async function get(url){
    return request('get', url);
}

async function post(url, data){
    return request('post', url, data);
}

async function put(url, data){
    return request('put', url, data);
}

async function del(url){
    return request('delete', url);
}

export { get, post, put, del };
