import { get } from "../src/api.js";
import { catalogHTML, emptyCatalogHTML, catalogIdeaTemplate } from "../html/catalog.js";

const section = catalogHTML;
const emptySection = emptyCatalogHTML;

let ctx = null;

export async function showCatalog(incCtx){
    ctx = incCtx;
    
    let listOfElements = await loadIdeas() || [];
    listOfElements.length > 0 ? section.replaceChildren(...listOfElements) : section.replaceChildren(emptySection);

    ctx.render(section);
}

async function loadIdeas(){
    const ideas = await get('/data/ideas?select=_id%2Ctitle%2Cimg&sortBy=_createdOn%20desc');
    // const ideas = await get('/data/ideas?select=_id%2Ctitle%2CimageURL&sortBy=_createdOn%20desc');

    return ideas?.map(catalogIdeaTemplate).map(e => {
        e.querySelector('a.btn').addEventListener('click', (ev) => details(ev, e.id));
        return e;
    });
}

function details(ev, id){
    ev.preventDefault();
    ctx.goTo('detailsPage', id);
}
