import { showDetails } from "./details.js";

const url = 'http://localhost:3030/jsonstore/collections/myboard/posts';
const html = {
    main: document.getElementById('main'),
    section: document.getElementById('homeView'),
    form: document.querySelector('form'),
    cancel: document.querySelector('[name="cancel"]'),
    container: document.querySelector('.topic-container')
}

html.section.querySelector('div.topic-title').addEventListener('click', showDetails);
html.form.addEventListener('submit', onSubmit);
html.cancel.addEventListener('click', clearForm);

html.section.remove();

async function showHome(ev){
    ev?.preventDefault();
    html.main.replaceChildren('Loading...');

    const res = await fetch(url);
    const posts = await res.json();

    html.container.replaceChildren(...Object.values(posts).map(createPostPreview));
    html.main.replaceChildren(html.section);
}

function createPostPreview(post){
    const divEl = document.createElement('div');

    divEl.className = 'topic-name-wrapper';
    divEl.innerHTML = `<div class="topic-name">
                           <a href="/details" class="normal" id="${post._id}">
                               <h2>${post.title}</h2>
                           </a>
                           <div class="columns">
                               <div>
                                   <p>Date: <time>${post.dateCreated}</time></p>
                                   <div class="nick-name">
                                       <p>Username: <span>${post.username}</span></p>
                                   </div>
                               </div>
                           </div>
                       </div>`;

    return divEl;
}

async function onSubmit(ev){
    ev.preventDefault();

    const formData = new FormData(html.form);

    const title = formData.get('topicName').trim();
    const username = formData.get('username').trim();
    const content = formData.get('postText').trim();

    try{
        if(title === '' || username === '' || content === ''){
            throw new Error('All fields are required!');
        }

        const res = await fetch(url, {
            method: 'post',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ title, username, content, dateCreated: new Date() })
        });

        if(res.ok !== true){
            const error = await res.json();
            throw new Error(error.message);
        }

        html.form.reset();
        showHome();
    } catch (err) {
        alert(err.message);
    }
}

function clearForm(){
    html.form.reset();
}

export { showHome };
