import { loggedUser } from "./util.js";

const html = {
    container: document.getElementById('container'),
    navbar: document.querySelector('nav.navbar'),
    credentialsHTML: document.querySelectorAll('nav li a'),
    main: document.getElementById('main-page-section'),
    footer: document.querySelector('footer.page-footer')
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

function showHomePage(id){
    html.container.appendChild(views[id]);
}

function showAddMoviePage(id){
    html.container.appendChild(views[id]);
}

function showMoviePage(id){

}

function showEditMoviePage(id){

}

function displayPage(page){
    const display = {
        home: () => showHomePage('homePage'),
        addMovie: () =>  showAddMoviePage('addMovie'),
        movie: () => showMoviePage('movieExample'),
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

    display[page]();

    addFooter();
}

export { displayPage };