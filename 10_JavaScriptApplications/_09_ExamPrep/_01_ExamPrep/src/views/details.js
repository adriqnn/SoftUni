import { html } from '../lib.js';
import { getUserData } from '../util.js';
import { deleteMeme, getMemeById } from '../api/memes.js';

const detailsTemplate = (meme, isOwner, onDelete) => html `<section id="meme-details">
                                                               <h1>Meme Title: ${meme.title}</h1>
                                                               <div class="meme-details">
                                                                   <div class="meme-img">
                                                                       <img alt="meme-alt" src=${meme.imageUrl}>
                                                                   </div>
                                                                   <div class="meme-description">
                                                                       <h2>Meme Description</h2>
                                                                       <p>${meme.description}</p>
                                                                       ${isOwner ? html `<a class="button warning" href="/edit/${meme._id}">Edit</a>
                                                                                    <button @click=${onDelete} class="button danger">Delete</button>`
                                                                                 : ''}
                                                                   </div>
                                                               </div>
                                                           </section>`;

export async function detailsView(ctx){
    const meme = await getMemeById(ctx.params.id);

    const userData = getUserData();
    const isOwner = userData?.id === meme._ownerId; // ?. conditional chaining;

    ctx.render(detailsTemplate(meme, isOwner, onDelete));

    async function onDelete(){
        const choice = confirm('Are you sure you want to delete this meme?');
        if(choice){
            await deleteMeme(ctx.params.id);
            ctx.page.redirect('/memes');
        }
    }
}
