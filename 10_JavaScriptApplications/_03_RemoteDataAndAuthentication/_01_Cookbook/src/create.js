const form = document.querySelector('form');

form.addEventListener('submit', (ev => {
    ev.preventDefault();
    const formData = new FormData(ev.target);

    onSubmit([...formData.entries()].reduce((p, [k, v]) => Object.assign(p, { [k]: v }), {}));
}));

async function onSubmit(data){
    const body = JSON.stringify({
        name: data.name,
        img: data.img,
        ingredients: data.ingredients.split('\n').map(l => l.trim()).filter(l => l !== ''),
        steps: data.steps.split('\n').map(l => l.trim()).filter(l => l !== '')
    });

    const currentPath = window.location.pathname;
    const newPath = currentPath.replace(/\/[^\/]*$/, '/index.html');

    const token = sessionStorage.getItem('authToken');
    if(token == null){
        return window.location.pathname = newPath;
    }

    try{
        const response = await fetch('http://localhost:3030/data/recipes', {
            method: 'post',
            headers: { 'Content-Type': 'application/json', 'X-Authorization': token },
            body
        });

        if(response.status === 200){
            window.location.pathname = newPath;
        }else{
            throw new Error(await response.json());
        }
    }catch(err){
        console.error(err.message);
    }
}
