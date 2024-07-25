import { get } from "../src/api.js";
import { getUserDetails } from "../src/generalUtil.js";
import { movieLikes, userLiked } from "../src/movieUtil.js";

const section = document.getElementById('movie-example');
section.remove();

let ctx = null;
let id = null;

export async function showDetailsMovie(incCtx, incId){
    ctx = incCtx;
    id = incId;

    await generateSection(id);

    ctx.render(section);
}

async function generateSection(fId){
    const user = getUserDetails();
    const movie = await get(`/data/movies/${fId}`);
    const likes = await movieLikes(movie._id);
    const liked = await userLiked(user.id, movie._id);

    const divEl = document.createElement('div');
    divEl.className = 'container';
    divEl.id = movie._id;
    divEl.setAttribute('data-owner', movie._ownerId);

    divEl.innerHTML = `<h1>${movie.title}</h1>
                       <div class="row bg-light text-dark">
                           <div class="col-md-8">
                               <img class="img-thumbnail" src="${movie.img}" alt="Movie"/>
                           </div>
                           <div id="user-elements" class="col-md-4 text-center">
                               <h3 class="my-3">Movie Description</h3>
                               <p>${movie.description}</p>
                               <a class="btn btn-danger" href="#">Delete</a>
                               <a class="btn btn-warning" href="#">Edit</a>
                               <a class="btn btn-primary" id="like" href="#">Like</a>
                               <a class="btn btn-primary" id="unlike" href="#">Unlike</a>
                               <span class="enrolled-span">Liked ${likes}</span>
                           </div>
                       </div>`;

    const ux = {
        deleteBtn: divEl.querySelector('a.btn-danger'),
        editBtn: divEl.querySelector('a.btn-warning'),
        likeBtn: divEl.querySelector('#like'),
        unlikeBtn: divEl.querySelector('#unlike'),
        liked: divEl.querySelector('span.enrolled-span')
    }

    ux.deleteBtn.addEventListener('click', (e) => {
        e.preventDefault();
        ctx.goTo('deleteMovieBtn', movie._id);
    });

    ux.editBtn.addEventListener('click', (e) =>  {
        e.preventDefault();
        ctx.goTo('editMoviePage', movie._id);
    });

    ux.likeBtn.addEventListener('click', (e) => {
        e.preventDefault();
        ctx.goTo('likeMovieBtn', movie._id);
    });

    ux.unlikeBtn.addEventListener('click', (e) =>  {
        e.preventDefault();
        ctx.goTo('unlikeMovieBtn', { likeId: liked[0]._id, movieId: movie._id });
    });

    if(user?.id === movie._ownerId){
        ux.deleteBtn.style.display = 'inline';
        ux.editBtn.style.display = 'inline';
    }else{
        ux.deleteBtn.style.display = 'none';
        ux.editBtn.style.display = 'none';
    }

    if(user){
        if(liked.length > 0){
            ux.likeBtn.style.display = 'none';
            ux.unlikeBtn.style.display = 'inline';
        }else{
            ux.likeBtn.style.display = 'inline';
            ux.unlikeBtn.style.display = 'none';
        }
    }else{
        ux.likeBtn.style.display = 'none';
        ux.unlikeBtn.style.display = 'none';
    }

    section.replaceChildren(divEl);
}
