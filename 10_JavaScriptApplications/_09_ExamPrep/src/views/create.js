import { createMeme } from '../api/memes.js';
import {html} from '../lib.js'
//create create template add submit handler in form that executes a function
const createTemplate = (onSubmit) => html `
<section id="create-meme">
    <form @submit=${onSubmit} id="create-form">
        <div class="container">
            <h1>Create Meme</h1>
            <label for="title">Title</label>
            <input id="title" type="text" placeholder="Enter Title" name="title">
            <label for="description">Description</label>
            <textarea id="description" placeholder="Enter Description" name="description"></textarea>
            <label for="imageUrl">Meme Image</label>
            <input id="imageUrl" type="text" placeholder="Enter meme ImageUrl" name="imageUrl">
            <input type="submit" class="registerbtn button" value="Create Meme">
        </div>
    </form>
</section>`;
//export function that loads the view by rendering it;
export function createView(ctx){
    ctx.render(createTemplate(onSubmit));

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
        await createMeme(meme);
        //reset data form;
        event.target.reset();
        //redirect;
        ctx.page.redirect('/memes');
    }
}