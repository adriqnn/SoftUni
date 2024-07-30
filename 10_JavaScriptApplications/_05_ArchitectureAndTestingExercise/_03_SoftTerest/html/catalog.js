import { eFactory } from "./factory.js";

const catalogHTML = eFactory('div', 'dashboard-holder', ``);
catalogHTML.id = `dashboard-holder`;

const emptyCatalogHTML = eFactory('div', 'dashboard-holder', `<h1>No ideas yet! Be the first one :)</h1>`);
emptyCatalogHTML.id = `dashboard-holder`;

function catalogIdeaTemplate(idea){
    const el = eFactory('div', '', `<div class="card overflow-hidden current-card details" style="width: 20rem; height: 360px;">
                                        <div class="card-body">
                                            <p class="card-text">${idea.title}</p>
                                        </div>
                                        <img class="card-image" src="${idea.img}" alt="Card image cap">
                                        <a class="btn" href="/details-${idea._id}">Details</a>
                                    </div>`);

    el.id = idea._id;

    return el;
}

export { catalogHTML, emptyCatalogHTML, catalogIdeaTemplate };
