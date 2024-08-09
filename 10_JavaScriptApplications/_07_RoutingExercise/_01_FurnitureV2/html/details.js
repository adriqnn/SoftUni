import { html } from "../../node_modules/lit-html/lit-html.js";
import { getUserDetails } from "../src/util.js";

const details = (item) => html `<div class="container" id="${item._id}" data-owner="${item._ownerId}">
                                    <div class="row space-top">
                                        <div class="col-md-12">
                                            <h1>Furniture Details</h1>
                                        </div>
                                    </div>
                                    <div class="row space-top">
                                        <div class="col-md-4">
                                            <div class="card text-white bg-primary">
                                                <div class="card-body">
                                                    <img src="${item.img}"/>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <p>Make: <span>${item.make}</span></p>
                                            <p>Model: <span>${item.model}</span></p>
                                            <p>Year: <span>${item.year}</span></p>
                                            <p>Description: <span>${item.description}</span></p>
                                            <p>Price: <span>${item.price}</span></p>
                                            <p>Material: <span>${item.material}</span></p>
                                            ${getUserDetails()?.id === item._ownerId 
                                                    ?
                                                    html `<div>
                                                        <a href="/details-${item._id}/edit" class="btn btn-info">Edit</a>
                                                        <a href="/details-${item._id}/delete" class="btn btn-red">Delete</a>
                                                    </div>`
                                                    :
                                                    ''}
                                        </div>
                                    </div>
                                </div>`;

export { details };
