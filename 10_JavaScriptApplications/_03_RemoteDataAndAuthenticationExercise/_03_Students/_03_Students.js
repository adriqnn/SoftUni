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

                if (key !== '_id') {
                    td.innerHTML = value;
                    tr.appendChild(td);
                }

                html.tbody.appendChild(tr);
            });
        })
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
