function phonebookV1(){
    const url = 'http://localhost:3030/jsonstore/phonebook';
    const html = {
        load: document.getElementById('btnLoad'),
        create: document.getElementById('btnCreate'),
        ul: document.getElementById('phonebook'),
        inputPerson: document.getElementById('person'),
        inputPhone: document.getElementById('phone')
    }

    html.load.addEventListener('click', loadInfo);
    html.create.addEventListener('click', createEntry);

    async function loadInfo(){
        try{
            const res = await fetch(url);

            if(!res.ok){
                throw new Error('Error');
            }

            const data = await res.json();

            html.ul.replaceChildren();
            Object.entries(data).map(show);
        }catch(err){
            console.log(err);
        }
    }

    async function createEntry(){
        const entry = { person: html.inputPerson.value, phone: html.inputPhone.value };

        if(entry.person !== '' || entry.phone !== ''){
            await fetch(url, {
                method: 'post',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(entry)
            });

            loadInfo();
        }
    }

    function show(entry){
        const [id, obj] = entry;

        let liEl = document.createElement('li');
        let btnEl = document.createElement('button');

        liEl.id = id;
        liEl.textContent = `${obj.person}: ${obj.phone}`;

        btnEl.textContent = 'Delete';
        btnEl.addEventListener('click', deleteEntry);

        liEl.appendChild(btnEl);
        html.ul.appendChild(liEl);
    }

    async function deleteEntry(e){
        let elP = e.target.parentElement;

        await fetch(`${url}/${elP.id}`, {
            method: 'delete'
        });

        html.ul.removeChild(elP);
    }
}

phonebookV1();
