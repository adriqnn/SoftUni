const form = document.querySelector('form');

form.addEventListener('submit', (ev => {
    ev.preventDefault();
    const formData = new FormData(ev.target);

    onSubmit([...formData.entries()].reduce((p, [k, v]) => Object.assign(p, { [k]: v }), {}));
}));

async function onSubmit(data){
    const body = JSON.stringify({
        email: data.email,
        password: data.password
    });

    try{
        const response = await fetch('http://localhost:3030/users/login', {
            method: 'post',
            headers: { 'Content-Type': 'application/json' },
            body
        });
        const data = await response.json();

        const currentPath = window.location.pathname;
        const newPath = currentPath.replace(/\/[^\/]*$/, '/index.html');

        if(response.status === 200){
            sessionStorage.setItem('authToken', data.accessToken);
            window.location.pathname = newPath;
        }else{
            throw new Error(data.message);
        }
    }catch(err){
        console.error(err.message);
    }
}
