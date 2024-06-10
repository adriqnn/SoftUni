function work_processV1(){
    const input = {
        firstname: document.getElementById('fname'),
        lastname: document.getElementById('lname'),
        email: document.getElementById('email'),
        date: document.getElementById('birth'),
        position: document.getElementById('position'),
        salary: document.getElementById('salary')
    }

    const containers = {
        workers: document.querySelector('#tbody'),
        sum: document.getElementById('sum')
    }

    const hireWorker = document.getElementById('add-worker');
    hireWorker.addEventListener('click', hireWorkerAction);

    function hireWorkerAction(event){
        event.preventDefault();

        const firstname = input.firstname.value;
        const lastname = input.lastname.value;
        const email = input.email.value;
        const date = input.date.value;
        const position = input.position.value;
        const salary = input.salary.value;

        if(firstname === '' || lastname === '' || email === '' || date === '' || position === '' || salary === ''){
            return;
        }
        
        input.firstname.value = '';
        input.lastname.value = '';
        input.email.value = '';
        input.date.value = '';
        input.position.value = '';
        input.salary.value = '' ;

        const tr = document.createElement('tr');
        tr.innerHTML = `<td>${firstname}</td>
                        <td>${lastname}</td>
                        <td>${email}</td>
                        <td>${date}</td>
                        <td>${position}</td>
                        <td>${salary}</td>
                        <td><button class='fired'>Fired</button> <button class="edit">Edit</button></td>`;

        const fireButton = tr.querySelector('.fired');
        fireButton.addEventListener('click', fire);

        const editButton = tr.querySelector('.edit');
        editButton.addEventListener('click', edit);

        containers.workers.appendChild(tr);

        let sumSalaries = Number(containers.sum.textContent) + Number(salary);
        containers.sum.textContent = sumSalaries.toFixed(2);

        function edit(e){
            e.preventDefault();

            input.firstname.value = firstname;
            input.lastname.value = lastname;
            input.email.value = email;
            input.date.value = date;
            input.position.value = position;
            input.salary.value = salary;

            tr.remove();
            containers.sum.textContent = (Number(containers.sum.textContent) - Number(salary)).toFixed(2);
        }

        function fire(e){
            e.preventDefault();
            tr.remove();
            containers.sum.textContent = (Number(containers.sum.textContent) - Number(salary)).toFixed(2);
        }
    }
}

work_processV1();