import { html } from '../../node_modules/lit-html/lit-html.js';

const furnitureTemplate = ({ _id, img, description, price }) => {
    return html `<div class="col-md-4">
                     <div class="card text-white bg-primary">
                         <div class="card-body">
                             <img src="${img}"/>
                             <p>${description}</p>
                             <footer>
                                 <p>Price: <span>${price} $</span></p>
                             </footer>
                             <div>
                                 <a href=details/${_id} class="btn btn-info">Details</a>
                             </div>
                         </div>
                     </div>
                 </div>`;
}

export { furnitureTemplate };
