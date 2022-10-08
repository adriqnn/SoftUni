import { getAllShoes } from '../api/shoes.js';
import {html} from '../lib.js'

const catalogTemplate = (shoes) => html `
<section id="dashboard">
<h2>Collectibles</h2>
<ul class="card-wrapper">
  <!-- Display a li with information about every post (if any)-->
  ${shoes.length == 0 
    ? html `<h2>There are no items added yet.</h2>`
    : shoes.map(shoe)}
</ul>

<!-- Display an h2 if there are no posts -->
</section>
`;
//extracting the html element template;
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
    <a class="details-btn" href="/shoes/${shoe._id}">Details</a>
  </li>`;
//export function that loads the view by rendering it
export async function catalogView(ctx){
    const shoes = await getAllShoes();
    ctx.render(catalogTemplate(shoes));
}