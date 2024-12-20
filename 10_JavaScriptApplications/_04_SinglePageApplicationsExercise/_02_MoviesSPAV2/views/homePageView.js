import { eFactory } from '../src/helper.js';
import { getMovies } from '../src/requests.js';
import { getMovie } from '../components/movie.js';
import { addMovieBtn } from '../components/addMovieBtn.js';

async function getHomePageView () {
    const movies = await getMovies();
    const fragment = new DocumentFragment();
    const head = `<div class="jumbotron jumbotron-fluid text-light" style="background-color: #343a40;">
                      <img src="https://slicksmovieblog.files.wordpress.com/2014/08/cropped-movie-banner-e1408372575210.jpg" class="img-fluid" alt="Responsive image" style="width: 150%; height: 200px">
                      <h1 class="display-4">Movies</h1>
                      <p class="lead">Unlimited movies, TV shows, and more. Watch anywhere. Cancel anytime.</p>
                  </div>`;

    const headSection = eFactory('section', '', head);
    headSection.id = 'home-page';
    const moviesHeader = eFactory('h1', 'text-center', 'Movies');
    const addMovieButton = sessionStorage.getItem('accessToken') ? addMovieBtn : document.createTextNode('');

    const moviesInnerHTML = `<div class=" mt-3 ">
                                 <div class="row d-flex d-wrap">
                                     <div class="card-deck d-flex justify-content-center">${movies.map(x => getMovie(x).outerHTML).join('')}</div>
                                 </div>
                             </div>`;

    const moviesSection = eFactory('section', '', moviesInnerHTML);
    moviesSection.id = 'movie';

    fragment.append(headSection, moviesHeader, addMovieButton, moviesSection);

    return fragment;
}

export { getHomePageView };
