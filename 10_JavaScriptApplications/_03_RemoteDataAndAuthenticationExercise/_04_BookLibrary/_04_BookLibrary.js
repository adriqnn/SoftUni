function book_libraryV1(){
    const url = `http://localhost:3030/jsonstore/collections/books`;
    const html = {
        allBooksBtn: document.getElementById('loadBooks'),
        tbody: document.querySelector('tbody'),
        inputTitle: document.querySelectorAll('input[name="title"]'),
        inputAuthor: document.querySelectorAll('input[name="author"]'),
        createForm: document.getElementById('createForm'),
        editForm: document.getElementById('editForm'),
        createBtn: document.getElementById('create'),
        editBtn: document.getElementById('edit'),
        cancelBtn: document.getElementById('cancel')
    }

    html.allBooksBtn.addEventListener('click', loadAllBooks);
    html.createBtn.addEventListener('click', createBook);
    html.editBtn.addEventListener('click', saveBook);
    html.cancelBtn.addEventListener('click', cancel);

    async function loadAllBooks(){
        try{
            const res = await fetch(url);

            if(!res.ok){
                throw new Error('Error');
            }

            const data = await res.json();

            html.tbody.replaceChildren();
            Object.entries(data).forEach(e => {
                let el = tr(e[0], e[1].author, e[1].title);
                html.tbody.appendChild(el);
            });
        }catch(err){
            console.log(err.message);
        }
    }

    async function createBook(e){
        e.preventDefault();
        await saveData(e, 'post');
    }

    async function saveBook(e){
        e.preventDefault();
        await saveData(e, 'put');

        html.createForm.style.display = 'block';
        html.editForm.style.display = 'none';
    }

    async function saveData(e, method){
        const form = e.target.parentElement;
        const formData = new FormData(form);

        const urlSaveData = method === 'post' ? url : `${url}/${form.firstElementChild.id}`;

        const entry = {
            title: formData.get('title'),
            author: formData.get('author')
        }

        const hasEmptyStrings = Object.entries(entry).some(([key, value]) => value === '');

        if(!hasEmptyStrings){
            await fetch(urlSaveData, {
                method: method === 'post' ? 'post' : 'put',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(entry)
            });

            await loadAllBooks();
            clearFields([...document.querySelectorAll('form input[type=text]')]);
        }
    }

    function cancel(e){
        e.preventDefault();
        clearFields([...document.querySelectorAll('form input[type=text]')]);

        html.createForm.style.display = 'block';
        html.editForm.style.display = 'none';

        loadAllBooks();
    }

    async function editEl(e){
        if(html.editForm.style.display === 'none'){
            const mainEl = e.target.parentElement.parentElement;
            const id = mainEl.id;
            const el = document.getElementById('id');
            el.id = id;
            
            html.inputTitle[1].value = mainEl.firstElementChild.textContent;
            html.inputAuthor[1].value = mainEl.firstElementChild.nextElementSibling.textContent;

            html.createForm.style.display = 'none';
            html.editForm.style.display = 'block';
        }
    }

    async function deleteEl(e){
        const id = e.target.parentElement.parentElement.id;

        await fetch(`${url}/${id}`, {
            method: 'delete'
        });

        html.tbody.removeChild(e.target.parentElement.parentElement);
    }

    function tr(id, author, title){
        let trElement = document.createElement('tr');
        trElement.id = id;
        trElement.innerHTML = `<td>${title}</td>
                                   <td>${author}</td>
                                   <td>
                                       <button>Edit</button>
                                       <button>Delete</button>
                                   </td>`;
        
        trElement.querySelectorAll('button')[0].addEventListener('click', editEl);
        trElement.querySelectorAll('button')[1].addEventListener('click', deleteEl);

        return trElement;
    }

    const clearFields = (arr) => arr.forEach(x => x.value = '');
}

book_libraryV1();
