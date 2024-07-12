import { clearFields, clearHomeView, getUserDetails, loggedUser, showView, disableFunctionalityBasedOnUser } from "./helpers.js";

const url = 'http://localhost:3030/data/catches';
const html = {
    homeContainer: document.getElementById('catches')
}

async function loadCatches(){
    try{
        const res = await fetch(url);

        if(!res.ok){
            const error = await res.json();
            throw new Error(error.message);
        }

        const data = await res.json();

        clearHomeView();

        data.forEach(e => {
            let divEl = document.createElement('div');
            divEl.id = e._ownerId;
            divEl.classList.add('catch');

            divEl.innerHTML = `<label>Angler</label>
                               <input type="text" class="angler" value="${e.angler}">
                               <label>Weight</label>
                               <input type="text" class="weight" value="${e.weight}">
                               <label>Species</label>
                               <input type="text" class="species" value="${e.species}">
                               <label>Location</label>
                               <input type="text" class="location" value="${e.location}">
                               <label>Bait</label>
                               <input type="text" class="bait" value="${e.bait}">
                               <label>Capture Time</label>
                               <input type="number" class="captureTime" value="${e.captureTime}">
                               <button class="update" data-id="${e._id}">Update</button>
                               <button class="delete" data-id="${e._id}">Delete</button>`;


            let buttons = divEl.querySelectorAll('button');
            buttons[0].addEventListener('click', updateCatch);
            buttons[1].addEventListener('click', deleteCatch);

            disableFunctionalityBasedOnUser(divEl, 'button');
            disableFunctionalityBasedOnUser(divEl, 'input');

            html.homeContainer.appendChild(divEl);

            return divEl;
        });
    }catch(err){
        alert(err.message);
    }
}

async function addCatch(e){
    e.preventDefault();

    const formData = new FormData(e.target.parentElement.parentElement);
    const data = Object.fromEntries([...formData.entries()]);

    const newCatch = {
        angler: data.angler,
        weight: data.weight,
        species: data.species,
        location: data.location,
        bait: data.bait,
        captureTime: data.captureTime
    }

    const hasEmptyStrings = Object.values(newCatch).some((e) => e === '');

    try{
        if(hasEmptyStrings){
            throw new Error('All fields required!');
        }

        const userDetails = getUserDetails();
        const res = await fetch(`${url}`, {
            method: 'post',
            headers: { 'Content-Type': 'application/json', 'X-Authorization': userDetails.token},
            body: JSON.stringify(newCatch)
        });

        if(!res.ok){
            const error = await res.json();
            throw new Error(error.message);
        }

        const data = await res.json();

        clearFields(document.querySelectorAll(`#addForm input`));
        loggedUser();
        showView('home');
    }catch(err){
        alert(err.message);
    }

    await loadCatches();
}

async function deleteCatch(e){
    const id = e.target.getAttribute('data-id');
    const userDetails = getUserDetails();

    await fetch(`${url}/${id}`, {
        method: 'delete',
        headers: {
            'X-Authorization': userDetails.token
        }
    });

    await loadCatches();
}

async function updateCatch(e){
    const id = e.target.getAttribute('data-id');
    const userDetails = getUserDetails();

    const inputs = e.target.parentElement.querySelectorAll('input');
    const updated = {
        angler: inputs[0].value,
        weight: inputs[1].value,
        species: inputs[2].value,
        location: inputs[3].value,
        bait: inputs[4].value,
        captureTime: inputs[5].value
    }

    try{
        const res = await fetch(`${url}/${id}`, {
            method: 'put',
            headers: {
                'Content-Type': 'application/json',
                'X-Authorization': userDetails.token
            },
            body: JSON.stringify(updated)
        });

        await loadCatches();
    }catch(err){
        alert(err.message);
    }
}

export { loadCatches, addCatch };