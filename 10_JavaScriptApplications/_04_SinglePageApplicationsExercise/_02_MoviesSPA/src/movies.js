import { loadMoviesReq, addMovieReq, loadMovieReq, movieLikesReq, userLikedReq, deleteMovieReq, editMovieReq, likeMovieReq, unlikeMovieReq } from "./requests.js";
import { getUserDetails } from "./util.js";
import { displayMovieEdit } from "./display.js";

const html = {
    formAddMovie: document.querySelector('#add-movie form')
}

html.formAddMovie.addEventListener('submit', addMovieSubmit);

async function addMovieSubmit(e){
    e.preventDefault();

    const formData = new FormData(e.target);
    const data = Object.fromEntries([...formData.entries()]);

    const movie = {
        title: data.title,
        description: data.description,
        img: data.img
    }

    await addMovieReq(movie, e);
}

async function editMoviePage(movie, e){
    e.preventDefault();
    displayMovieEdit(movie);
}

async function editMovie(e){
    e.preventDefault();

    const formData = new FormData(e.target);
    const data = Object.fromEntries([...formData.entries()]);

    const movie = {
        title: data.title,
        description: data.description,
        img: data.img
    }

    await editMovieReq(movie, e);
}

async function likeMovie(e){
    e.preventDefault();
    const movieId = e.target.parentElement.parentElement.parentElement.id;
    await likeMovieReq(movieId);
}

async function unlikeMovie(e, id, movieId){
    e.preventDefault();
    await unlikeMovieReq(id, movieId);
}

async function deleteMovie(e){
    e.preventDefault();
    await deleteMovieReq(e.target.parentElement.parentElement.parentElement.id);
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
                                <a class="btn btn-warning" href="#">Edit</a>
                                <a class="btn btn-primary" id="like" href="#">Like</a>
                                <a class="btn btn-primary" id="unlike" href="#">Unlike</a>
                                <span class="enrolled-span">Liked ${movieLikes}</span>
                            </div>
                       </div>`;

    const ux = {
        deleteBtn: divEl.querySelector('a.btn-danger'),
        editBtn: divEl.querySelector('a.btn-warning'),
        likeBtn: divEl.querySelector('#like'),
        unlikeBtn: divEl.querySelector('#unlike'),
        liked: divEl.querySelector('span.enrolled-span'),
        divContainer: divEl.querySelector('#user-elements')
    }

    ux.deleteBtn.addEventListener('click', deleteMovie);
    ux.editBtn.addEventListener('click', (e) =>  editMoviePage(movie, e));
    ux.likeBtn.addEventListener('click', likeMovie);
    ux.unlikeBtn.addEventListener('click', (e) =>  unlikeMovie(e, userLiked[0]._id, movie._id));

    if(user?.id === movie._ownerId){
        ux.deleteBtn.style.display = 'inline';
        ux.editBtn.style.display = 'inline';
    }else{
        ux.deleteBtn.style.display = 'none';
        ux.editBtn.style.display = 'none';
    }

    if(user){
        if(userLiked.length > 0){
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

    return divEl;
}

export { editMoviePage, editMovie, likeMovie, unlikeMovie, deleteMovie, loadMovie, loadAllMovies };
