import { getShoeByModel } from '../api/shoes.js';
import {html} from '../lib.js'
import { getUserData } from '../util.js';

let isLogged = false;

const searchTemplate = (onSubmit,shoes) => html `
<section id="search">
<h2>Search by Brand</h2>

<form @submit=${onSubmit} class="search-wrapper cf">
  <input
    id="#search-input"
    type="text"
    name="search"
    placeholder="Search here..."
    required
  />
  <button type="submit">Search</button>
</form>

<h3>Results:</h3>

<div id="search-container">
    <ul class="card-wrapper">
    ${shoes.length == 0
    ? html `<h2>There are no results found.</h2>`
    : shoes.map(shoe)}
    </ul>
    <!-- Display a li with information about every post (if any)-->
    <!-- Display an h2 if there are no posts -->
</div>
</section>`;

const shoe = (shoe) => html `
<li class="card">
    <img src=${shoe.imageUrl} alt="travis" />
    <p>
    <strong>Brand: </strong><span class="brand">${shoe.brand}</span>
    </p>
    <p>
    <strong>Model: </strong
    ><span class="model">${shoe.model}</span>
    </p>
    <p><strong>Value:</strong><span class="value">${shoe.value}</span>$</p>
     ${isLogged ? html `<a class="details-btn" href="/details/${shoe._id}">Details</a>`
    :   ''}
</li>
`;

export async function searchView(ctx){
    
    const shoes1 = [];
    const userData = getUserData();
    if(userData){
        isLogged = true;
    }
    ctx.render(searchTemplate(onSubmit,shoes1));

    async function onSubmit(event){
        event.preventDefault();
        const formData = new FormData(event.target);
        const brand = formData.get('search');

        if(brand == ''){
            return;
        }
        const shoes2 = await getShoeByModel(brand);
        ctx.render(searchTemplate(onSubmit,shoes2));
    }
}