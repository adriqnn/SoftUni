import { createMeme, getMemeById, updateMeme } from '../api/memes.js';
import {html} from '../lib.js'
//create edit template add submit handler in form that executes a function
const editTemplate = (meme, onSubmit) => html `
<section id="edit-meme">
    <form @submit=${onSubmit} id="edit-form">
        <h1>Edit Meme</h1>
        <div class="container">
            <label for="title">Title</label>
            <input id="title" type="text" placeholder="Enter Title" name="title" .value=${meme.title}>
            <label for="description">Description</label>
            <textarea id="description" placeholder="Enter Description" name="description" .value=${meme.description}>
                </textarea>
            <label for="imageUrl">Image Url</label>
            <input id="imageUrl" type="text" placeholder="Enter Meme ImageUrl" name="imageUrl" .value=${meme.imageUrl}>
            <input type="submit" class="registerbtn button" value="Edit Meme">
        </div>
    </form>
</section>`;
//export function that loads the view by rendering it;
export async function editView(ctx){
    //get meme
    const meme = await getMemeById(ctx.params.id);
    ctx.render(editTemplate(meme, onSubmit));

    async function onSubmit(event){
        //prevent default
        event.preventDefault();
        //create form data
        const formData = new FormData(event.target);
        //all fields from the form
        const meme = {
            title: formData.get('title'),
            description: formData.get('description'),
            imageUrl: formData.get('imageUrl')
        }
        //validate fields
        if(meme.title == '' || meme.description == '' || meme.imageUrl == ''){
            return alert('All fields are required!');
        }
        //create async function;
        await updateMeme(ctx.params.id, meme);
        //reset data form;
        event.target.reset();
        //redirect;
        ctx.page.redirect('/memes/' + ctx.params.id);
    }
}