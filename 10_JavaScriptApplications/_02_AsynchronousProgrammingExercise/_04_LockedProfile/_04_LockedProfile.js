async function locked_profileV1(){
    const url = `http://localhost:3030/jsonstore/advanced/profiles`;
    const html = { main: document.getElementById('main') };

    html.main.innerHTML = '';

    try{
        await generateContent();
    }catch(err){
        console.log(err);
    }

    async function generateContent(){
        let res = await fetch(url);
        let data = await res.json();

        html.main.innerHTML = Object.values(data).map(e => {
            return `<div class="profile">
                        <img src="iconProfile2.png" class="userIcon"/>
                        <label>Lock</label>
                        <input type="radio" name="${e._id}-radio" value="lock" checked>
                        <label>Unlock</label>
                        <input type="radio" name="${e._id}-radio" value="unlock"><br>
                        <hr>
                        <label>Username</label>
                        <input type="text" name="${e._id}-name" value="${e.username}" disabled readonly/>
                        <div class="${e._id}" style="display:none">
                            <hr>
                            <label>Email:</label>
                            <input type="email" name="${e._id}-email" value="${e.email}" disabled readonly/>
                            <br>
                            <label>Age:</label>
                            <input type="text" name="${e._id}-age" value="${e.age}" disabled readonly/>
                        </div>
                        <button>Show more</button>
                    </div>`;
        }).join('');

        document.querySelectorAll('button').forEach(e => e.addEventListener('click', showMoreOrHide));

        function showMoreOrHide(e){
            const button = e.target;
            const content = button.previousElementSibling;
            const radio = button.parentElement.children[2];

            if(!radio.checked){
                if(button.textContent === 'Show more'){
                    button.textContent = 'Hide it';
                    content.style.display = 'block';
                }else{
                    button.textContent = 'Show more';
                    content.style.display = 'none';
                }
            }
        }
    }
}

async function locked_profileV2(){
    const url = `http://localhost:3030/jsonstore/advanced/profiles`;
    const html = { main: document.getElementById('main') };

    html.main.innerHTML = '';

    try{
        await generateContent();
    }catch(err){
        console.log(err);
    }

    async function generateContent(){
        let res = await fetch(url);
        let data = await res.json();

        html.main.innerHTML = Object.values(data).map(e => {
            return `<div class="profile">
                        <img src="iconProfile2.png" class="userIcon"/>
                        <label>Lock</label>
                        <input type="radio" name="${e._id}-radio" value="lock" checked>
                        <label>Unlock</label>
                        <input type="radio" name="${e._id}-radio" value="unlock"><br>
                        <hr>
                        <label>Username</label>
                        <input type="text" name="${e._id}-name" value="${e.username}" disabled readonly/>
                        <div class="${e._id}" style="display:none">
                            <hr>
                            <label>Email:</label>
                            <input type="email" name="${e._id}-email" value="${e.email}" disabled readonly/>
                            <br>
                            <label>Age:</label>
                            <input type="text" name="${e._id}-age" value="${e.age}" disabled readonly/>
                        </div>
                        <button>Show more</button>
                    </div>`;
        }).join('');

        document.querySelectorAll('button').forEach(e => e.addEventListener('click', showMoreOrHide));

        function showMoreOrHide(e){
            const button = e.target;
            const profileDiv = button.parentElement;
            const content = button.previousElementSibling;
            const radio = profileDiv.querySelector('input[type="radio"][value="lock"]');

            if(!radio.checked){
                if(button.textContent === 'Show more'){
                    button.textContent = 'Hide it';
                    content.style.display = 'block';
                }else{
                    button.textContent = 'Show more';
                    content.style.display = 'none';
                }
            }
        }
    }
}

async function locked_profileV3(){
    try{
        const data = await fetch(`http://localhost:3030/jsonstore/advanced/profiles`);
        const des = await data.json();

        const main = document.querySelector('main');
        main.innerHTML = '';

        Object.values(des).forEach((x, i) => main.appendChild(profileTemplate(x, i + 1)));
    }catch(err){
        console.log(err);
    }

    function profileTemplate ({ username, email, age }, id){
        const wrapper = document.createElement('div');
        const btn = document.createElement('button');
        btn.innerText = 'Show more';

        wrapper.className = 'profile';
        wrapper.innerHTML = `<img src="./iconProfile2.png" class="userIcon">
                             <label>Lock</label>
                             <input type="radio" name="user${id}Locked" value="lock" checked="">
                             <label>Unlock</label>
                             <input type="radio" name="user${id}Locked" value="unlock"><br>
                             <hr>
                             <label>Username</label>
                             <input type="text" name="user${id}Username" value=${username} disabled="" readonly="">
                             <div id="user${id}HiddenFields" style="display:none">
                             <hr>
                                 <label>Email:</label>
                                 <input type="email" name="user${id}Email" value=${email} disabled="" readonly="">
                                 <label>Age:</label>
                                 <input type="email" name="user${id}Age" value=${age} disabled="" readonly="">
                             </div>`;

        btn.addEventListener('click', () => {
            const checked = wrapper.querySelector('input[type=radio]:checked');

            if(checked && checked.value === 'unlock'){
                if(btn.innerText === 'Show more'){
                    wrapper.querySelector(`#user${id}HiddenFields`).style.display = 'block';
                    btn.innerText = 'Hide it';
                }else{
                    wrapper.querySelector(`#user${id}HiddenFields`).style.display = 'none';
                    btn.innerText = 'Show more';
                }
            }
        });

        wrapper.appendChild(btn);

        return wrapper;
    }
}
