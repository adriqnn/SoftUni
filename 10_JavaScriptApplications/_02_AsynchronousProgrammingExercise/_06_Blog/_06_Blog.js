function blogV1(){
    const url = `http://localhost:3030/jsonstore/blog`;
    const ids = [];
    let clicked = false;
    const html = {
        btnLoad: document.getElementById('btnLoadPosts'),
        btnView: document.getElementById('btnViewPost'),
        select: document.getElementById('posts'),
        postTitle: document.getElementById('post-title'),
        postComments: document.getElementById('post-comments')
    }

    html.btnLoad.addEventListener('click', options);
    html.btnView.addEventListener('click', loadComments);

    async function options(){
        try{
            let res = await fetch(`${url}/posts`);
            let loadedOptions = await res.json();

            if(!clicked){
                html.postTitle.insertAdjacentHTML('afterend', Object.values(loadedOptions).map(o => {
                    ids.push(o.id);

                    let summary = `<p id="${o.id}" style="display: none">${o.body}</p>`;

                    const option = document.createElement('option');
                    option.value = o.id;
                    option.text = o.title;

                    html.select.appendChild(option);

                    return summary;
                }).join(' '));

                clicked = true;
            }
        }catch(err){
            console.log(err);
        }
    }

    async function loadComments(){
        try{
            if(html.select.innerHTML !== ''){
                let res = await fetch(`${url}/comments`);
                let additionalInformation = await res.json();

                showElement(html.select.value);

                html.postComments.innerHTML = ``;
                Object.entries(additionalInformation)
                    .filter(e => e[1].postId === html.select.value).forEach(e => {
                    let li = document.createElement('li');
                    li.textContent = e[1].text;
                    html.postComments.appendChild(li);
                });
            }
        }catch(err){
            console.log(err);
        }
    }

    function showElement(id){
        ids.forEach(e => {
            let el = document.getElementById(`${e}`);
            e === id ? el.style.display = 'block' : el.style.display = 'none';
        });
    }
}

blogV1();
