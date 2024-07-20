const url = `http://localhost:3030/jsonstore/collections/myboard`;
const html = {
    main: document.getElementById('main'),
    section: document.getElementById('detailsView'),
    title: document.getElementById('details-title'),
    username: document.getElementById('details-username'),
    time: document.getElementById('details-time'),
    content: document.getElementById('details-content'),
    commentsList: document.getElementById('user-comment')
};

const form = html.section.querySelector('form');
form.addEventListener('submit', onSubmit);
html.section.remove();

function showDetails(ev){
    let target = ev.target;

    if(target.tagName === 'H2'){
        target = target.parentElement;
    }

    if(target.tagName === 'A'){
        ev.preventDefault();

        const postId = target.id;
        showPost(postId);
    }
}

async function showPost(postId){
    html.main.replaceChildren('Loading...');

    const [ res, commentRes ] = await Promise.all([ fetch(`${url}/posts/${postId}`), fetch(`${url}/comments`) ]);
    const [ post, comments ] = await Promise.all([ res.json(), commentRes.json() ]);

    html.commentsList.replaceChildren(...Object.values(comments).filter(c => c.postId === postId).map(createCommentElement));

    form.id = postId;
    html.title.textContent = post.title;
    html.username.textContent = post.username;
    html.time.textContent = post.dateCreated;
    html.content.textContent = post.content;

    html.main.replaceChildren(html.section);
}

function createCommentElement(comment){
    const divElement = document.createElement('div');

    divElement.className = 'topic-name-wrapper';
    divElement.innerHTML = `<div class="topic-name">
                                <p><strong>${comment.username}</strong> commented on <time>${comment.dateCreated}</time></p>
                                <div class="post-content">
                                    <p>${comment.content}</p>
                                </div>
                            </div>`;

    return divElement;
}

async function onSubmit(ev){
    ev.preventDefault(ev);

    const formData = new FormData(form);

    const username = formData.get('username').trim();
    const content = formData.get('postText').trim();
    const postId = form.id;

    try{
        if (username === '' || content === ''){
            throw new Error('All fields are required!');
        }

        const res = await fetch(`${url}/comments`, {
            method: 'post',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ username, content, postId, dateCreated: new Date() })
        });

        if(res.ok !== true){
            const error = await res.json();
            throw new Error(error.message);
        }

        form.reset();

        showPost(postId);
    }catch(err){
        alert(err.message);
    }
}

export { showDetails };
