function studentsV1(){
    const url = `http://localhost:3030/jsonstore/collections/students`;
    const html = {
        submitBtn: document.getElementById('submit'),
        tbody: document.querySelector('tbody')
    }

    loadData();
    html.submitBtn.addEventListener('click', createEntry);

    async function loadData(){
        html.tbody.innerHTML = '';

        const res = await fetch(url);
        const data = await res.json();

        Object.entries(data).map(e => {
            let tr = document.createElement('tr');

            Object.entries(e[1]).forEach(([key, value]) => {
                const td = document.createElement('td');

                if(key !== '_id'){
                    td.innerHTML = value;
                    tr.appendChild(td);
                }

                html.tbody.appendChild(tr);
            });
        });
    }

    async function createEntry(e){
        e.preventDefault();
        const formData = new FormData(e.target.parentElement);

        const entry = {
            firstName: formData.get('firstName'),
            lastname: formData.get('lastName'),
            facultyNumber: formData.get('facultyNumber'),
            grade: formData.get('grade')
        }

        const hasEmptyStrings = Object.entries(entry).some(([key, value]) => value === '');

        if(!hasEmptyStrings){
            await fetch(url, {
                method: 'post',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(entry)
            });

            await loadData();
            clearFields([...document.querySelectorAll('#form > div.inputs > input[type=text]')]);
        }
    }

    const clearFields = (arr) => arr.forEach(x => x.value = '');
}

studentsV1();

function studentsV2(){
    const clearFields = (arr) => arr.forEach(x => x.value = '');
    const Url = `http://localhost:3030/jsonstore/collections/students`;

    function validData(data){
        return data.every(([_, value]) => value !== '');
    }

    function displayStudents(studentsData){
        const table = document.querySelector('#results > tbody');
        table.innerHTML = '';

        Object.values(studentsData).forEach(student => {
            const tr = document.createElement('tr');

            Object.entries(student).forEach(([key, value]) => {
                const td = document.createElement('td');

                if(key !== '_id'){
                    td.innerHTML = value;
                    tr.appendChild(td);
                }
            });

            table.appendChild(tr);
        })

    }

    async function getStudents(){
        const response = await fetch(Url);

        return await response.json();
    }

    async function postStudent(data){
        const response = await fetch(Url, {
            method: 'post',
            headers: { 'content-type': 'application/json' },
            body: JSON.stringify(Object.fromEntries(data))
        });

        return await response.json();
    }

    document.addEventListener('submit', async (e) => {
        e.preventDefault();
        const formData = new FormData(e.target);
        const data = [...formData.entries()];

        if(validData(data)){
            await postStudent(data);
            displayStudents(await getStudents());
            clearFields([...document.querySelectorAll('#form > div.inputs > input[type=text]')]);
        }
    });
}
