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
            const el = mainEl.firstElementChild;
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

function book_libraryV2(){
    const url = `http://localhost:3030/jsonstore/collections/books`;
    document.querySelector('#loadBooks').addEventListener('click', onLoad);
    document.querySelector('form button').addEventListener('click', onSubmit);

    async function onLoad(){
        document.querySelectorAll('form input')[0].value = '';
        document.querySelectorAll('form input')[1].value = '';

        let tBody = document.querySelector('tBody');
        tBody.innerHTML = '';

        const response = await fetch(url);
        const data = await response.json();

        Object.entries(data).forEach(([key, value]) => {
            let elements = e('tr', { id: key },
                e('td', {}, value.author),
                e('td', {}, value.title),
                e('td', {},
                    e('button', { id: 'edit' }, 'Edit'),
                    e('button', { id: 'delete' }, 'Delete'))
            );

            tBody.appendChild(elements);

            elements.querySelector('#edit').addEventListener('click', async (event) => {
                event.preventDefault();

                if(document.querySelector('#save')){
                    document.querySelector('#save').remove();
                }

                const currentElement = event.target.parentNode.parentNode;
                const currentAuthor = currentElement.children[0].textContent;
                const currentTitle = currentElement.children[1].textContent;
                const id = currentElement.id;

                document.querySelectorAll('form input')[0].value = currentTitle;
                document.querySelectorAll('form input')[1].value = currentAuthor;

                document.querySelector('form h3').textContent = 'Edit FORM';
                document.querySelector('form button').style.display = 'none';
                document.querySelector('form').appendChild(e('button', { id: 'save' }, 'Save'));

                const saveButton = document.querySelector('#save');

                saveButton.addEventListener('click', async (e) => {
                    e.preventDefault();

                    if(currentAuthor === '' && currentTitle === ''){
                        return alert('All fields are required');
                    }

                    await fetch(`${url}/${id}`, {
                        method: 'put',
                        headers: { 'Content-Type': 'application/json' },
                        body: JSON.stringify({
                            author: document.querySelectorAll('form input')[0].value,
                            title: document.querySelectorAll('form input')[1].value
                        })
                    });

                    document.querySelector('form button').style.display = 'block';
                    saveButton.remove();
                    onLoad();
                });
            });

            elements.querySelector('#delete').addEventListener('click', async (event) => {
                event.preventDefault();

                const currentElement = event.target.parentNode.parentNode;
                const id = currentElement.id;
                const confirmed = confirm('Are you sure you want to delete this book?');

                if(confirmed){
                    await fetch(`${url}/${id}`, {
                        method: 'delete'
                    });

                    onLoad();
                }
            });
        });
    }


    async function onSubmit(event){
        event.preventDefault();
        const [author, title] = Array.from(document.querySelectorAll('form input'));

        if(author.value === '' || title.value === ''){
            return alert('All fields are required');
        }

        const response = await fetch(url, {
            method: 'post',
            headers: { 'Content-Type': 'application/' },
            body: JSON.stringify({
                author: author.value,
                title: title.value
            })
        });

        if(response.ok === false){
            return alert('Error');
        }

        document.querySelectorAll('form input')[0].value = '';
        document.querySelectorAll('form input')[1].value = '';
    }


    function e(type, attributes, ...content){
        const result = document.createElement(type);

        for(let [attr, value] of Object.entries(attributes || {})){
            if(attr.substring(0, 2) === 'on'){
                result.addEventListener(attr.substring(2).toLocaleLowerCase(), value);
            }else{
                result[attr] = value;
            }
        }

        content = content.reduce((a, c) => a.concat(Array.isArray(c) ? c : [c]), []);

        content.forEach(e => {
            if(typeof e === 'string' || typeof e === 'number'){
                const node = document.createTextNode(e);
                result.appendChild(node);
            }else{
                result.appendChild(e);
            }
        });

        return result;
    }
}
