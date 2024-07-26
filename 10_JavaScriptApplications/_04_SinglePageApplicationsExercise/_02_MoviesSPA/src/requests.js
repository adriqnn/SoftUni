import { getUserDetails, hasEmptyStrings } from "./util.js";
import { displayPage, showMovieDetailsPageWithoutEvent } from "./display.js";

async function loadMovieReq(id){
    const res = await fetch(`http://localhost:3030/data/movies/${id}`);
    const data = await res.json();

    return data;
}

async function loadMoviesReq(){
    const res = await fetch(`http://localhost:3030/data/movies`);
    const data = await res.json();
    const userDetails = getUserDetails();

    return data.map(e => {
        const liEl = document.createElement('li');

        liEl.innerHTML = `<div id="${e._id}" data-owner="${e._ownerId}">
                              <img class="img-thumbnail" src="${e.img}" alt="Movie"/>
                              <h4>${e.title}</h4>
                              <a href="/movie-details" class="btn btn-warning">Details</a>
                          </div>`;

        let details = liEl.querySelector('a');
        userDetails ? details.style.display = 'inline' : details.style.display = 'none';

        return liEl;
    });
}

async function movieLikesReq(userId, movieId){
    const res = await fetch(`http://localhost:3030/data/likes?where=movieId%3D%22${movieId}%22&distinct=_ownerId&count`);
    const data = await res.json();

    return data;
}

async function userLikedReq(userId, movieId){
    const res = await fetch(`http://localhost:3030/data/likes?where=movieId%3D%22${movieId}%22%20and%20_ownerId%3D%22${userId}%22`);
    const data = await res.json();

    return data;
}

async function addMovieReq(movie, e){
    const url = `http://localhost:3030/data/movies`;
    const userDetails = getUserDetails();

    try {
        if(hasEmptyStrings(movie)){
            throw new Error('All fields required!');
        }

        const res = await fetch(`${url}`, {
            method: 'post',
            headers: {'Content-Type': 'application/json', 'X-Authorization': userDetails.token},
            body: JSON.stringify(movie)
        });

        if(!res.ok){
            const error = await res.json();
            throw new Error(error.message);
        }

        e.target.reset();
        await displayPage('home');
    }catch(err) {
        alert(err.message);
    }
}

async function editMovieReq(movie, e){
    const url = `http://localhost:3030/data/movies`;
    const userDetails = getUserDetails();
    const id = e.target.id;

    try {
        if(hasEmptyStrings(movie)){
            throw new Error('All fields required!');
        }

        const res = await fetch(`${url}/${id}`, {
            method: 'put',
            headers: {'Content-Type': 'application/json', 'X-Authorization': userDetails.token},
            body: JSON.stringify(movie)
        });

        if(!res.ok){
            const error = await res.json();
            throw new Error(error.message);
        }

        e.target.reset();
        await displayPage('home');
    }catch(err) {
        alert(err.message);
    }
}

async function likeMovieReq(movieId){
    const userDetails = getUserDetails();

    const like = { movieId, ownerID: userDetails.id };
    const res = await fetch(`http://localhost:3030/data/likes`, {
        method: 'post',
        headers: { 'Content-Type': 'application/json', 'X-Authorization': userDetails.token },
        body: JSON.stringify(like)
    });

    showMovieDetailsPageWithoutEvent(movieId);
}

async function unlikeMovieReq(likeId, movieId){
    const userDetails = getUserDetails();

    const res = await fetch(`http://localhost:3030/data/likes/${likeId}`, {
        method: 'delete',
        headers: { 'X-Authorization': userDetails.token }
    });

    showMovieDetailsPageWithoutEvent(movieId);
}

async function deleteMovieReq(id){
    const userDetails = getUserDetails();
    const url = `http://localhost:3030/data/movies/`;

    await fetch(`${url}${id}`, {
        method: 'delete',
        headers: { 'X-Authorization': userDetails.token }
    });

    displayPage('home');
}

async function authenticateReq(user, e, where){
    const url = `http://localhost:3030/users`;

    try{
        if(hasEmptyStrings(user)){
            throw new Error('All fields required!');
        }

        const res = await fetch(`${url}/${where}`, {
            method: 'post',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(user)
        });

        if(!res.ok){
            const error = await res.json();
            throw new Error(error.message);
        }

        const data = await res.json();
        const userDetails = {
            email: data.email,
            id: data._id,
            token: data.accessToken
        }

        sessionStorage.setItem('userDetails', JSON.stringify(userDetails));

        e.target.reset();
        await displayPage('home');
    }catch(err){
        alert(err.message);
    }
}

function logoutReq(){
    const userDetails = getUserDetails();
    fetch('http://localhost:3030/users/logout', {
        headers: { 'X-Authorization': userDetails.token }
    });
}

export { loadMovieReq, loadMoviesReq, movieLikesReq, userLikedReq, editMovieReq, likeMovieReq, unlikeMovieReq, deleteMovieReq, addMovieReq, authenticateReq, logoutReq };
