import { getAllMemes, getMemesByUser } from '../api/memes.js';
import {html} from '../lib.js'
import { getUserData } from '../util.js';
//create profile template
const profileTemplate = (userData, memes) => html `
<section id="user-profile-page" class="user-profile">
    <article class="user-info">
        <img id="user-avatar-url" alt="user-profile" src="/images/${userData.gender}.png">
        <div class="user-content">
            <p>Username: ${userData.username}</p>
            <p>Email: ${userData.email}</p>
            <p>My memes count: ${memes.length}</p>
        </div>
    </article>
    <h1 id="user-listings-title">User Memes</h1>
    <div class="user-meme-listings">
        <!-- Display : All created memes by this user (If any) --> 
        ${memes.length == 0 ? html `<p class="no-memes">No memes in database.</p>`
                        : memes.map(memeCard)}
        <!-- Display : If user doesn't have own memes  --> 
    </div>
</section>`;
//create function for meme rendering
const memeCard = (meme) => html `
<div class="user-meme">
    <p class="user-meme-title">${meme.title}</p>
    <img class="userProfileImage" alt="meme-img" src=${meme.imageUrl}>
    <a class="button" href="/memes/${meme._id}">Details</a>
</div>`

//export function that loads the view by rendering it
export async function profileView(ctx){
    //get user's id;
    const userData = getUserData();
    //get users's memes
    const memes = await getMemesByUser(userData.id);
    ctx.render(profileTemplate(userData, memes));
}