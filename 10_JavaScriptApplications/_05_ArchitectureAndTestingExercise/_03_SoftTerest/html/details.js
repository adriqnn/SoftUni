import { eFactory } from "./factory.js";

const deleteIdeaBtnHTML = eFactory('div', 'text-center', `<a class="btn detb" href="/delete-idea">Delete</a>`);
function detailsHTML(idea){
    const el =  eFactory('div', 'container home some', `<img class="det-img" src="${idea.img}" />
                                                                                             <div class="desc">
                                                                                                 <h2 class="display-5">${idea.title}</h2>
                                                                                                 <p class="infoType">Description:</p>
                                                                                                 <p class="idea-description">${idea.description}</p>
                                                                                             </div>`);

    el.id = idea._id;
    el.setAttribute('data-owner', idea._ownerId);

    return el;
}


export { deleteIdeaBtnHTML, detailsHTML };
