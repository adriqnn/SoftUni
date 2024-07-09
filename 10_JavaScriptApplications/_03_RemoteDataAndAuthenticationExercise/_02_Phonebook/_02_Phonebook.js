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

function phonebookV2(){
    const baseUrl = `http://localhost:3030/jsonstore/phonebook`;
    document.addEventListener('click', e => {
        if(e.target.tagName === 'BUTTON'){
            const actions = {
                btnLoad: async () => displayData(await getData(baseUrl)),
                btnCreate: async () => {
                    await createData();
                    displayData(await getData(baseUrl));
                },
                remove: () => deleteData(e.target.parentNode, e.target.parentNode.id),
            };

            e.target.id ? actions[e.target.id]() : actions[e.target.className]();
        }
    });

    function createLi({ person, phone, _id }){
        const e = document.createElement('li');
        e.id = _id;
        e.innerHTML = `${person}: ${phone}`;

        const deleteBtn = document.createElement('button');
        deleteBtn.innerHTML = 'Delete';
        deleteBtn.className = 'remove';

        e.appendChild(deleteBtn);

        return e;
    }

    async function createData (){
        const [person, phone] = [document.getElementById('person').value, document.getElementById('phone').value];

        const response = await fetch(baseUrl, {
            method: 'post',
            headers: { 'content-type': 'application/json' },
            body: JSON.stringify({ person, phone })
        });

        return await response.json();
    }

    async function getData (url){
        const response = await fetch(url);
        const data = await response.json();

        return Object.values(data);
    }

    function displayData (data){
        const output = document.getElementById('phonebook');
        output.innerHTML = '';
        data.forEach(x => output.appendChild(createLi(x)));
    }

    async function deleteData (e, id) {
        const response = await fetch(`${baseUrl}/${id}`, {
            method: 'delete'
        });

        e.outerHTML = '';
    }
}
