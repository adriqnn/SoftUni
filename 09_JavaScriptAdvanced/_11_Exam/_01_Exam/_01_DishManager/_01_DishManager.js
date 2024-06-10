window.addEventListener("load", dish_managerV1);

function dish_managerV1(){
    const input = {
        firstName: document.getElementById('first-name'),
        lastName: document.getElementById('last-name'),
        age: document.getElementById('age'),
        gender: document.getElementById('genderSelect'),
        description: document.getElementById('task')
    }

    const containers = {
        inProgress: document.querySelector('#in-progress'),
        finished: document.getElementById('finished'),
        progress: document.getElementById('progress-count')

    }

    const formButton = document.querySelector("#form-btn");
    formButton.addEventListener('click', submitInformation);

    const clearButton = document.getElementById('clear-btn');
    clearButton.addEventListener('click', clear);

    function submitInformation(event){
        event.preventDefault();

        const firstName = input.firstName.value;
        const lastName = input.lastName.value;
        const age = input.age.value;
        const gender = input.gender.value;
        const description = input.description.value;

        if(firstName === '' || lastName === '' || age === '' || description === ''){
            return;
        }

        const li = document.createElement('li');
        li.className = 'each-line';
        li.innerHTML = `<article>
                            <h4>${firstName} ${lastName}</h4>
                            <p>${gender}, ${age}</p>
                            <p>Dish description: ${description}</p>
                        </article>
                        <button class="edit-btn">Edit</button>
                        <button class="complete-btn">Mark as complete</button>`;

        const editButton = li.querySelector('.edit-btn');
        editButton.addEventListener('click', edit);

        const completeButton = li.querySelector('.complete-btn');
        completeButton.addEventListener('click', complete);

        containers.inProgress.appendChild(li);

        let sum = Number(containers.progress.textContent) + 1;
        containers.progress.textContent = sum;

        input.firstName.value = '';
        input.lastName.value = '';
        input.age.value = '';
        input.gender.value = 'Male';
        input.description.value = '';

        function edit(){
            input.firstName.value = firstName;
            input.lastName.value = lastName;
            input.age.value = age;
            input.gender.value = gender;
            input.description.value = description;

            li.remove();
            containers.progress.textContent = (Number(containers.progress.textContent) - 1);
        }

        function complete(){
            li.remove();
            containers.finished.appendChild(li);
            editButton.remove();
            completeButton.remove();
            containers.progress.textContent = (Number(containers.progress.textContent) - 1);
        }
    }

    function clear(){
        containers.finished.innerHTML = '';
        containers.progress.textContent = 0;
    }
}