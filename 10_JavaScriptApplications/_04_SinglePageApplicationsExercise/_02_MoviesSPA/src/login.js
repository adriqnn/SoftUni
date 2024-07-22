import { displayPage } from "./display.js";
import { loadMoviesReq, addMovieReq, loadMovieReq, movieLikesReq, userLikedReq, deleteMovieReq, editMovieReq, likeMovieReq } from "./requests.js";
import { getUserDetails } from "./util.js";

const html = {
    formAddMovie: document.querySelector('#add-movie form')
}

html.formAddMovie.addEventListener('submit', addMovieSubmit);

async function addMovie(e){
    e.preventDefault();
    await displayPage('addMovie');
}

async function addMovieSubmit(e){
    e.preventDefault();

    const formData = new FormData(e.target);
    const data = Object.fromEntries([...formData.entries()]);

    const movie = {
        title: data.title,
        description: data.description,
        img: data.img
    }

    await addMovieReq(movie, e)
}

async function loadAllMovies(){
    return await loadMoviesReq();
}

async function loadMovie(id){
    const user = getUserDetails();
    const movie = await loadMovieReq(id);
    const movieLikes = await movieLikesReq(user.id, movie._id);
    const userLiked = await userLikedReq(user.id, movie._id);

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
                                <p>
                                  ${movie.description}
                                </p>
                                <a class="btn btn-danger" href="#">Delete</a>
'                               <a class="btn btn-warning" href="#">Edit</a>
                                <a class="btn btn-primary" href="#">Like</a>
                                <span class="enrolled-span">Liked</span>
                            </div>
                       </div>`;

    const ux = {
        deleteBtn: divEl.querySelector('a.btn-danger'),
        editBtn: divEl.querySelector('a.btn-warning'),
        likeBtn: divEl.querySelector('a.btn-primary'),
        liked: divEl.querySelector('span.enrolled-span'),
        divContainer: divEl.querySelector('#user-elements')
    }

    ux.deleteBtn.addEventListener('click', deleteMovieReq);
    ux.editBtn.addEventListener('click', editMovieReq);
    ux.likeBtn.addEventListener('click', likeMovieReq);

    ux.divContainer.innerHTML = `<h3 class="my-3">Movie Description</h3>
                                 <p>
                                   ${movie.description}
                                 </p>${user?.id === movie._ownerId ? '<a class="btn btn-danger" href="#">Delete</a>' +
        '                                                             <a class="btn btn-warning" href="#">Edit</a>' : ""}
                                                                      <a class="btn btn-primary" href="#">Like</a>
                                <span class="enrolled-span">Liked ${movieLikes}</span>`;

    return divEl;
}

export { addMovie, loadMovie, loadAllMovies };
