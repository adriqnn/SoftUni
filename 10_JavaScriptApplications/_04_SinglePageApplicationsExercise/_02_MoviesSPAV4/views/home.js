import { get } from "../src/api.js";
import { getUserDetails, loggedUser } from "../src/generalUtil.js";

const section = document.getElementById('home-page');
const addMovieButton = document.querySelector('#add-movie-button a');
const movieUlContainer = document.querySelector('#movies-list');

addMovieButton.addEventListener('click', loadAddMovie);
section.remove();

let ctx = null;

export async function showHome(incCtx){
    ctx = incCtx;

    loggedUser() ? addMovieButton.style.display = 'inline' : addMovieButton.style.display = 'none';

    /* load movies # 1 */
    movieUlContainer.replaceChildren(...await loadMovies());

    /* load movies # 2 */
    // const movies = await loadMovies();
    // movieUlContainer.replaceChildren();
    // movieUlContainer.append(...movies);

    /* load movies # 3 */
    // const movies = await loadMovies();
    // movieUlContainer.replaceChildren();
    // movies.forEach(movie => movieUlContainer.appendChild(movie));

    /* load movies # 4 */
    // const movies = await loadMovies();
    // movieUlContainer.replaceChildren(...movies);

    /* load movies # 5 */
    // const movies = await loadMovies();
    // const fragment = document.createDocumentFragment();
    // movies.forEach(movie => fragment.appendChild(movie));
    // movieUlContainer.replaceChildren(fragment);

    /* load movies # 6 */
    // const movies = await loadMovies();
    // movieUlContainer.innerHTML = '';
    // movies.forEach(movie => movieUlContainer.innerHTML += movie.outerHTML);

    /* load movies # 7 */
    // const movies = await loadMovies();
    // movieUlContainer.innerHTML = movies.map(movie => movie.outerHTML).join('');

    /* load movies # 8 */
    // const movies = await loadMovies();
    // movieUlContainer.innerHTML = movies.reduce((acc, movie) => acc + movie.outerHTML, '');

    /* load movies # 9 */
    // const movies = await loadMovies();
    // const fragment = document.createDocumentFragment();
    // fragment.append(...movies);
    // movieUlContainer.replaceChildren(fragment);

    /* load movies # 10 */
    // const movies = await loadMovies();
    // movieUlContainer.innerHTML = '';
    // movies.forEach(movie => movieUlContainer.insertAdjacentHTML('beforeend', movie.outerHTML));

    ctx.render(section);
}

function loadAddMovie(ev){
    ev.preventDefault();
    ctx.goTo('addMoviePage');
}

async function loadMovies(){
    const movies = await get('/data/movies');
    const user = getUserDetails();

    return movies.map(e => {
        const liEl = document.createElement('li');

        liEl.innerHTML = `<div id="${e._id}" data-owner="${e._ownerId}">
                              <img class="img-thumbnail" src="${e.img}" alt="Movie"/>
                              <h4>${e.title}</h4>
                              <a href="/movie-details-${e._id}" class="btn btn-warning">Details</a>
                          </div>`;

        const details = liEl.querySelector(`div a`);

        !user ? details.remove() : details.addEventListener('click', (e) => {
            e.preventDefault();
            ctx.goTo('movieDetailsPage', e.target.parentElement.id);
        });

        return liEl;
    });
}
