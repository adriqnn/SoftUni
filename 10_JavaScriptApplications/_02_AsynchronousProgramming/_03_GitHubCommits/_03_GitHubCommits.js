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