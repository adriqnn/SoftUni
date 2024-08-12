import { html } from '../../node_modules/lit-html/lit-html.js';

import { furniture as furnitureREQ } from '../requests/requests.js';
import { furnitureTemplate } from '../Components/furniture.js';

const Dashboard = (items) => {
    document.title = 'Dashboard';

    return html `<div class="container">
                     <div class="row space-top">
                         <div class="col-md-12">
                             <h1>Welcome to Furniture System</h1>
                             <p>Select furniture from the catalog to view details.</p>
                         </div>
                     </div>
                     <div class="row space-top">${items.map(x => furnitureTemplate(x))}</div>
                 </div>`;
}

export { Dashboard };
