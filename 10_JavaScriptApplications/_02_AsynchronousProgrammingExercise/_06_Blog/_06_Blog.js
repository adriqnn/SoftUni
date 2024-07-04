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

function blogV2(){
    document.getElementById('btnLoadPosts').addEventListener('click', getPosts);
    document.getElementById('btnViewPost').addEventListener('click', displayPost);

    async function getPosts(){
        try{
            const url = 'http://localhost:3030/jsonstore/blog/posts';

            const response = await fetch(url);
            const data = await response.json();

            const select = document.getElementById('posts');

            Object.values(data).map(createOption).forEach(o => select.appendChild(o));
        }catch(err){
            console.log(err);
        }
    }

    function createOption(post){
        const result = document.createElement('option');
        
        result.textContent = post.title;
        result.value = post.id;

        return result;
    }

    function displayPost() {
        const postId = document.getElementById('posts').value;
        getCommentsByPostId(postId);

    }

    async function getCommentsByPostId(postId){
        try{
            const commentsUl = document.getElementById('post-comments');
            commentsUl.innerHTML = '';

            const postUrl = `http://localhost:3030/jsonstore/blog/posts/${postId}`;
            const commentsUrl = 'http://localhost:3030/jsonstore/blog/comments';

            const [postResponse,commentsResponse] = await Promise.all([
                fetch(postUrl),
                fetch(commentsUrl)
            ]);

            const postData = await postResponse.json();

            document.getElementById('post-title').textContent = postData.title;
            document.getElementById('post-body').textContent = postData.body;

            const commentsData = await commentsResponse.json();
            const comments = Object.values(commentsData).filter(comment => comment.postId === postId);

            comments.map(createComment).forEach(c => commentsUl.appendChild(c));
        }catch(err){
            console.log(err);
        }
    }

    function createComment(comment) {
        const result = document.createElement('li');
        result.textContent = comment.text;
        result.id = comment.id;
        
        return result;
    }
}

function blogV3(){
    const cache = { posts: null, comments: null };
    const url = 'http://localhost:3030/jsonstore/blog/';

    function createOption({ id, title }){
        const e = document.createElement('option');
        e.textContent = title;
        e.id = id;

        return e;
    }

    const clearOutput = (...arr) => arr.forEach(x => x.innerHTML = '');

    async function getData(uri){
        try{
            const data = await fetch(`${url}${uri}`);

            return await data.json();
        }catch(err){
            console.log(err);
        }
    }

    async function loadData(type){
        if(cache[type] === null){
            const data = await getData(type);
            cache[type] = data;
        }
    }

    async function displayPosts(){
        try{
            await loadData('posts');
            const selectElement = document.getElementById(`posts`);
            selectElement.innerHTML = '';

            Object.values(cache.posts).forEach(x => selectElement.appendChild(createOption(x)));
        }catch(err){
            console.log(err);
        }
    }

    async function displayPost(){
        try{
            await loadData('comments');

            const html = {
                postTitle: document.getElementById(`post-title`),
                postBody: document.getElementById(`post-body`),
                postComments: document.getElementById(`post-comments`),
                selectElement: document.getElementById(`posts`)
            }

            const selected = html.selectElement.options[html.selectElement.selectedIndex];
            const comments = Object.values(cache.comments).filter(x => x.postId === selected.id);

            clearOutput(html.postTitle, html.postBody, html.postComments);

            html.postTitle.textContent = selected.value;
            html.postBody.textContent = cache.posts[selected.id].body;
            html.postComments.innerHTML = comments.map(x => `<li id=${x.id}>${x.text}</li>`).join('');
        }catch(err){
            console.log(err);
        }
    }

    function attachEvents(){
        document.addEventListener('click', e => {
            if(e.target.tagName === 'BUTTON'){
                const btns = {
                    'btnViewPost': displayPost,
                    'btnLoadPosts': displayPosts,
                }

                btns[e.target.id]();
            }
        });
    }

    attachEvents();
}
