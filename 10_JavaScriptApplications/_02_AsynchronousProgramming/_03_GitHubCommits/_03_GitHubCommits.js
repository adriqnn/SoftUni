function github_commitsV1(){
    let username = document.getElementById('username');
    let repo = document.getElementById('repo');
    let result = document.getElementById('commits');

    const url = `https://api.github.com/repos/${username.value}/${repo.value}/commits`;

    function _createLi(_text){
        let li = document.createElement('li');
        li.textContent = _text;
        result.appendChild(li);
    }

    let status;

    fetch(url)
        .then(promise => {
            if(!promise.ok){
                status = promise.status;
            }

            return promise.json();
        })
        .then(data => {
            result.innerHTML = '';

            if(data.message === 'Not Found'){
                _createLi(`Error:${status} (${data.message})`);
                return;
            }

            data.forEach(e => {
                _createLi(`${e.commit.author.name}: ${e.commit.message}`);
            });
        });

    username.value = '';
    repo.value = '';
}

function github_commitsV2(){
    const html = {
        username: document.getElementById('username'),
        repo: document.getElementById('repo'),
        result: document.getElementById('commits')
    }

    const url = `https://api.github.com/repos/${html.username.value}/${html.repo.value}/commits`;

    fetch(url)
        .then(promise => promise.json())
        .then(data => {
            html.result.innerHTML = '';

            if(data.message === 'Not Found'){
                createElement(`Error: ${data.status} (${data.message})`);
                return;
            }

            data.forEach(e => {
                createElement(`${e.commit.author.name}: ${e.commit.message}`);
            });
        });

    html.username.value = '';
    html.repo.value = '';

    function createElement(text){
        let li = document.createElement('li');
        li.textContent = text;

        html.result.appendChild(li);
    }
}

async function github_commitsV3(){
    const html = {
        username: document.getElementById('username'),
        repo: document.getElementById('repo'),
        result: document.getElementById('commits')
    }

    const url = `https://api.github.com/repos/${html.username.value}/${html.repo.value}/commits`;

    try{
        let res = await fetch(url);
        let data = await res.json();

        html.result.innerHTML = '';

        if(res.ok === false){
            throw new Error(`Error: ${data.status} (${data.message})`);
        }

        data.forEach(createElement);

        html.username.value = '';
        html.repo.value = '';
    }catch(err){
        createElement(err);
    }

    function createElement(obj){
        let li = document.createElement('li');

        obj.hasOwnProperty('author')
            ? li.textContent = `${obj.commit.author.name}: ${obj.commit.message}`
            : li.textContent = obj.message;

        html.result.appendChild(li);

    }
}
