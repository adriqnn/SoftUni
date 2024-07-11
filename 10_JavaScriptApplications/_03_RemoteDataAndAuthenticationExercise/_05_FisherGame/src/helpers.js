function showView(v, html){
    html.views.replaceChildren();
    html.main.replaceChildren();

    html[v].style.display = 'block';
    html.main.appendChild(html[v]);
}

function loggedUser(access){
    const userDetails = sessionStorage.getItem('user');

    if(userDetails){
        access.user.style.display = 'inline';
        access.guest.style.display = 'none';
        access.greeting.innerHTML = `Welcome, <span>${userDetails.name}</span>`;
    }else{
        access.user.style.display = 'none';
        access.guest.style.display = 'inline';
        access.greeting.innerHTML = `Welcome, <span>guest</span>`;
    }
}

export { showView, loggedUser };
