import { getShoeById, updateShoe } from '../api/shoes.js';
import {html} from '../lib.js'
//create edit template add submit handler in form that executes a function
const editTemplate = (onSubmit, shoe) => html `
<section id="edit">
    <div class="form">
    <h2>Edit item</h2>
    <form @submit=${onSubmit}class="edit-form">
        <input
        type="text"
        name="brand"
        id="shoe-brand"
        placeholder="Brand"
        .value=${shoe.brand}
        />
        <input
        type="text"
        name="model"
        id="shoe-model"
        placeholder="Model"
        .value=${shoe.model}
        />
        <input
        type="text"
        name="imageUrl"
        id="shoe-img"
        placeholder="Image url"
        .value=${shoe.imageUrl}
        />
        <input
        type="text"
        name="release"
        id="shoe-release"
        placeholder="Release date"
        .value=${shoe.release}
        />
        <input
        type="text"
        name="designer"
        id="shoe-designer"
        placeholder="Designer"
        .value=${shoe.designer}
        />
        <input
        type="text"
        name="value"
        id="shoe-value"
        placeholder="Value"
        .value=${shoe.value}
        />

        <button type="submit">post</button>
    </form>
    </div>
</section>`;
//export function that loads the view by rendering it;
export async function editView(ctx){
    //get meme
    let shoe = await getShoeById(ctx.params.id);
    ctx.render(editTemplate(onSubmit, shoe));

    async function onSubmit(event){
        event.preventDefault();
        const formData = new FormData(event.target);
        
        let shoe = {
            brand: formData.get('brand'),
            model: formData.get('model'),
            imageUrl: formData.get('imageUrl'),
            release: formData.get('release'),
            designer: formData.get('designer'),
            value: formData.get('value')
        }
        
        if(shoe.brand == '' || shoe.model == '' || shoe.imageUrl == '' || shoe.release == '' || shoe.designer == '' || shoe.value == ''){
            return alert('All fields are required!');
        }
        
        await updateShoe(ctx.params.id, shoe);
        event.target.reset();
        ctx.page.redirect('/shoes/' + ctx.params.id);
    }
}