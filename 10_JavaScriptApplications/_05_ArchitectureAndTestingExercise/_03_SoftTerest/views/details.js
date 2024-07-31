import { get } from "../src/api.js";
import { deleteIdeaBtnHTML, detailsHTML } from "../html/details.js";
import { getUserDetails } from "../src/util.js";

let section = null;
let deleteBtn = deleteIdeaBtnHTML;
let ctx = null;
let id = null;

export async function showDetails(incCtx, incId){
    ctx = incCtx;
    id = incId;

    section = await generateIdeaDetailsPage(id);

    ctx.render(section);
}

async function generateIdeaDetailsPage(id){
    const user = getUserDetails();
    const idea = await get(`/data/ideas/${id}`);
    const el = detailsHTML(idea);

    if(user?.id === el.dataset.owner){
        el.append(deleteBtn);
        el.querySelector('a.btn').addEventListener('click', (e) => {
            e.preventDefault();
            ctx.goTo('deleteBtn', id);
        });
    }

    return el;
}
