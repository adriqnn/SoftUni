import { get, put } from "../src/api.js";
import {createSubmitHandler, getUserDetails} from "../src/generalUtil.js";

const section = document.getElementById('edit-movie');
section.remove();

let ctx = null;
let id = null;

export async function showEditMovie(incCtx, movieId){
    ctx = incCtx;
    id = movieId;

    await generateSection(id);

    ctx.render(section);
}

async function generateSection(fId){
    const user = getUserDetails();
    const movie = await get(`/data/movies/${fId}`);

    const form = document.createElement('form');
    form.className = "text-center border border-light p-5";

    form.innerHTML = `<h1>Edit Movie</h1>
                      <div class="form-group">
                          <label for="title">Movie Title</label>
                          <input id="title" type="text" class="form-control" placeholder="Movie Title" value="${movie.title}" name="title"/>
                      </div>
                      <div class="form-group">
                          <label for="description">Movie Description</label>
                          <textarea class="form-control" placeholder="Movie Description..." name="description">${movie.description}</textarea>
                      </div>
                      <div class="form-group">
                          <label for="imageUrl">Image url</label>
                          <input id="imageUrl" type="text" class="form-control" placeholder="Image Url" value="${movie.img}" name="img"/>
                      </div>
                      <button type="submit" class="btn btn-primary">Submit</button>`;

    createSubmitHandler(form, onSubmit);

    async function onSubmit(data){
        await put(`/data/movies/${id}`, data);

        form.reset();

        ctx.goTo('homePage');
    }

    section.replaceChildren(form);
}
