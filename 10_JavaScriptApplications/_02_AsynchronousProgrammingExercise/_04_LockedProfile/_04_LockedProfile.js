async function locked_profileV1(){
    const url = `http://localhost:3030/jsonstore/advanced/profiles`;
    const html = { main: document.getElementById('main') };

    html.main.innerHTML = '';
    await generateContent();

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
