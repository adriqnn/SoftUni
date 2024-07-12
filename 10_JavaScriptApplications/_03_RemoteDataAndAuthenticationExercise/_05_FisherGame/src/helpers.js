const access = {
    user: document.getElementById('user'),
    guest: document.getElementById('guest'),
    greeting: document.getElementById('greeting')
}

const html = {
    main: document.getElementById('html-main'),
    views: document.getElementById('views'),
    register: document.getElementById('register-view'),
    login: document.getElementById('login-view'),
    home: document.getElementById('home-view'),
    homeContainer: document.getElementById('catches'),
    addBtn: document.querySelector('#addForm button')
}

function showView(v){
    html.views.replaceChildren();
    html.main.replaceChildren();

    if(v === 'home'){
        clearHomeView();
        showMessage(html.homeContainer, 'Click to load catches!');
        enableAddButtonForUsers();
    }

    html[v].style.display = 'block';
    html.main.appendChild(html[v]);
}

function loggedUser(){
    const userDetails = getUserDetails();

    if(userDetails){
        access.user.style.display = 'inline';
        access.guest.style.display = 'none';
        access.greeting.innerHTML = `Welcome, <span>${userDetails.email}</span>`;
    }else{
        access.user.style.display = 'none';
        access.guest.style.display = 'inline';
        access.greeting.innerHTML = `Welcome, <span>guest</span>`;
    }
}

function clearFields(arr){
    arr.forEach(x => x.value = '');
}

async function sendData(e, where){
    const url = `http://localhost:3030/users`;

    const formData = new FormData(e.target.parentElement);
    const data = Object.fromEntries([...formData.entries()]);

    const user = {
        email: data.email,
        password: data.password
    }

    try{
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

        clearFields(document.querySelectorAll(`#${where}Form input`));
        loggedUser();
        showView('home');
    }catch(err){
        alert(err.message);
    }
}

function getUserDetails(){
    return JSON.parse(sessionStorage.getItem('userDetails'));
}

function disableFunctionalityBasedOnUser(divEl, type){
    const userDetails = getUserDetails();

    divEl.querySelectorAll(`${type}`).forEach(e => {
        if(divEl.id !== userDetails?.id){
            e.disabled = true;
        }
    });
}

function showMessage(el, msg){
    const pEl = document.createElement('p');
    pEl.innerHTML = `${msg}`;
    
    el.appendChild(pEl);
}

function clearHomeView(){
    html.homeContainer.replaceChildren();
}

function enableAddButtonForUsers(){
    getUserDetails() ? html.addBtn.disabled = false : html.addBtn.disabled = true;
}

export { showView, loggedUser, clearFields, sendData, getUserDetails, disableFunctionalityBasedOnUser, clearHomeView };
