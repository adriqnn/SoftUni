function github_reposV1(){
    const nameField = document.getElementById(`username`);
    const resultEl = document.getElementById(`repos`);

    const url = `https://api.github.com/users/${nameField.value}/repos`;

    fetch(url)
        .then(res => {
            if(res.ok === false){
                throw new Error(`${res.status} - ${res.statusText}`);
            }

            return res.json();
        })
        .then(handleResponse)
        .catch(error => console.log(error));

    resultEl.innerHTML = '';

    function handleResponse(data){
        data.forEach(({ full_name, html_url }) => {
            const li = document.createElement('li');
            const a = document.createElement('a');

            a.innerHTML = full_name;
            a.href = html_url;

            li.appendChild(a);
            resultEl.appendChild(li);
        });
    }
}

function github_reposV2(){
    const html = {
        username: document.getElementById('username'),
        repos: document.getElementById('repos')
    }

    const url = `https://api.github.com/users/${html.username.value}/repos`;

    fetch(url).then(res => {
        if(res.ok === false){
            throw new Error(`${res.status} - ${res.statusText}`);
        }

        return res.json();
    }).then(handleResponse).catch(error => console.log(error));

    html.repos.innerHTML = '';

    function handleResponse(data){
        data.forEach(({ full_name, html_url }) => {
            const li = document.createElement('li');
            const a = document.createElement('a');

            a.innerHTML = full_name;
            a.href = html_url;

            li.appendChild(a);
            html.repos.appendChild(li);
        });
    }
}

async function github_reposV3(){
    const html = {
        username: document.getElementById('username'),
        repos: document.getElementById('repos')
    }

    const url = `https://api.github.com/users/${html.username.value}/repos`;

    try{
        let res = await fetch(url);
        let data = await res.json();

        if(res.ok === false){
            throw new Error(`${data.status} - ${data.message}`);
        }

        html.repos.innerHTML = '';
        handleResponse(data);
    }catch(error){
        console.log(error);
    }

    function handleResponse(data){
        data.forEach(({ full_name, html_url }) => {
            const li = document.createElement('li');
            const a = document.createElement('a');

            a.innerHTML = full_name;
            a.href = html_url;

            li.appendChild(a);
            html.repos.appendChild(li);
        });
    }
}