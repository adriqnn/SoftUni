import { loggedUser } from "./util.js";
import { loadMovie, loadAllMovies } from "./movies.js";

const html = {
    container: document.getElementById('container'),
    navbar: document.querySelector('nav.navbar'),
    credentialsHTML: document.querySelectorAll('nav li a'),
    main: document.getElementById('main-page-section'),
    footer: document.querySelector('footer.page-footer'),
    addMovieBtn: document.getElementById('add-movie-button'),
}

const views = {
    homePage: document.getElementById('home-page'),
    addMovie: document.getElementById('add-movie'),
    movieExample: document.getElementById('movie-example'),
    editMovie: document.getElementById('edit-movie'),
    formLogin: document.getElementById('form-login'),
    formSignUp: document.getElementById('form-sign-up')
}

function clearPage(){
    html.container.innerHTML = '';
}

function addHeaderNav(){
    const userDetails = loggedUser();

    if(userDetails){
        html.credentialsHTML[0].textContent = `Welcome, ${userDetails.email}!`;
        html.credentialsHTML[1].style.display = 'block';
        html.credentialsHTML[2].style.display = 'none';
        html.credentialsHTML[3].style.display = 'none';
    }else{
        html.credentialsHTML[0].textContent = `Welcome, guest!`;
        html.credentialsHTML[1].style.display = 'none';
        html.credentialsHTML[2].style.display = 'block';
        html.credentialsHTML[3].style.display = 'block';
    }

    html.container.appendChild(html.navbar);
}

function addFooter(){
    html.container.appendChild(html.footer);
}

async function showHomePage(id){
    loggedUser() ? html.addMovieBtn.style.display = 'block' : html.addMovieBtn.style.display = 'none';

    const movies = await loadAllMovies();
    const moviesList = views.homePage.querySelector('#movies-list');

    movies.forEach(e => e.querySelector(`div a`).addEventListener('click', showMovieDetailsPage));

    moviesList.replaceChildren(...movies);
    html.container.appendChild(views[id]);
}

async function showMovieDetailsPage(e){
    e.preventDefault();

    const id = e.target.parentElement.id;
    const movie = await loadMovie(id)

    clearPage();
    addHeaderNav();

    views.movieExample.replaceChildren(movie);
    html.container.appendChild(views.movieExample);

    addFooter();
}

function showAddMoviePage(id){
    html.container.appendChild(views[id]);
}

function showEditMoviePage(id){

}

async function displayPage(page){
    const display = {
        home: () => showHomePage('homePage'),
        addMovie: () =>  showAddMoviePage('addMovie'),
        edit: () =>  showEditMoviePage('editMovie'),
        login: () => {
            html.container.appendChild(views.formLogin);
        },
        register: () => {
            html.container.appendChild(views.formSignUp);
        }
    }

    clearPage();
    addHeaderNav();

    await display[page]();

    addFooter();
}

export { displayPage };
