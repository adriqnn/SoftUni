function accordionV1(){
    const urlArticles = 'http://localhost:3030/jsonstore/advanced/articles/list';
    const singularArticle = 'http://localhost:3030/jsonstore/advanced/articles/details/';
    const html = { main: document.getElementById('main') };

    window.onload = populateList;

    async function populateList(){
        let res = await fetch(urlArticles);
        let articles = await res.json();

        html.main.innerHTML = articles.map(e => {
            return `<div class="accordion">
                        <div class="head">
                            <span>${e.title}</span>
                            <button class="button" id="${e._id}">More</button>
                        </div>
                        <div class="extra" style="display:none">
                            <p>Scalable Vector Graphics .....</p>
                        </div>
                    </div>`
        }).join(" ");

        document.querySelectorAll('button').forEach(e => e.addEventListener('click', reveal));

        async function reveal(e){
            const id = e.target.id;
            const extra = e.target.parentElement.parentElement.querySelector('.extra');

            const res = await fetch(singularArticle + id);
            const additionalInfo = await res.json();

            if(e.target.textContent === 'More'){
                e.target.textContent = 'Less';
                extra.innerHTML = `<p>${additionalInfo.content}</p>`;
                extra.style.display = 'block';
            }else{
                e.target.textContent = 'More';
                extra.style.display = 'none';
            }
        }
    }
}

accordionV1();
