import { html, render } from "../node_modules/lit-html/lit-html.js";

function book_libraryV1(){
    const htmlElements = {
        body: document.querySelector('body')
    }

    const button = html `<button id="loadBooks" @click="${loadAllBooks}">LOAD ALL BOOKS</button>`;
    const emptyDiv = html `<div id="editDiv"></div>`;
    const table = html `<table>
                            <thead><tr><th>Title</th><th>Author</th><th>Action</th></tr></thead>
                            <tbody>
                            </tbody>
                        </table>`;

    const createForm = html `<form id="createForm">
                                 <h3>FORM</h3>
                                 <label>TITLE</label>
                                 <input type="text" name="title" placeholder="Title...">
                                 <label>AUTHOR</label>
                                 <input type="text" name="author" placeholder="Author...">
                                 <button id="create" @click="${createBook}">Submit</button>
                             </form>`;

    const elementsArray = [ button, table, createForm, emptyDiv ];
    render(elementsArray, htmlElements.body);

    async function loadAllBooks(){
        const tbody = document.querySelector('tbody');

        try{
            const res = await fetch(`http://localhost:3030/jsonstore/collections/books`);

            if(!res.ok){ throw new Error('Error'); }

            const data = await res.json();

            const trEl = (book) => html `<tr id="${book[0]}">
                                             <td>${book[1].title}</td>
                                             <td>${book[1].author}</td>
                                             <td><button @click="${showEdit}">Edit</button><button @click="${deleteBook}">Delete</button></td>
                                         </tr>`;

            render(Object.entries(data).map(e => trEl(e)), tbody);
        }catch(err){
            console.log(err);
        }
    }

    async function createBook(e){
        e.preventDefault();

        await saveData(e, 'post');
    }

    async function deleteBook(e){
        e.preventDefault();

        const id = e.target.parentElement.parentElement.id;
        await fetch(`http://localhost:3030/jsonstore/collections/books/${id}`, { method: 'delete'});
        await loadAllBooks();
    }

    async function editBook(e){
        e.preventDefault();

        const id = e.target.parentElement.id;
        await saveData(e, 'put', id);

        document.querySelector('#createForm').style.display = 'block';
        render(html ``, document.querySelector('#editDiv'));
    }

    function showEdit(e){
        document.querySelector('#createForm').style.display = 'none';

        const parentElement = e.target.parentElement.parentElement;

        const title = parentElement.firstElementChild.textContent;
        const author = parentElement.firstElementChild.nextElementSibling.textContent;
        const id = parentElement.id;

        const editForm = html `<form id="${id}">
                                   <h3>Edit FORM</h3>
                                   <label>TITLE</label>
                                   <input type="text" name="title" placeholder="Title..." value="${title}">
                                   <label>AUTHOR</label>
                                   <input type="text" name="author" placeholder="Author..." value="${author}">
                                   <button id="edit" @click="${editBook}">Save</button>
                                   <button id="cancel" @click="${cancelEdit}">Cancel</button>
                               </form>`;

        render(editForm, document.querySelector('#editDiv'));
    }

    function cancelEdit(e){
        document.querySelector('#createForm').style.display = 'block';
        render(html ``, document.querySelector('#editDiv'));
    }

    async function saveData(e, method, id){
        const form = e.target.parentElement;
        const formData = new FormData(form);
        const url = method === 'post' ? 'http://localhost:3030/jsonstore/collections/books' : `http://localhost:3030/jsonstore/collections/books/${id}`;

        const entry = Object.fromEntries([...formData.entries()]);
        const hasEmptyStrings = Object.entries(entry).some(([key, value]) => value === '');

        if(!hasEmptyStrings){
            await fetch(url, { method, headers: { 'Content-Type': 'application/json' }, body: JSON.stringify(entry)});
            await loadAllBooks();
            form.reset();
        }
    }
}

book_libraryV1();

function book_libraryV2(){
    const htmlElements = {
        body: document.querySelector('body')
    }

    const button = html `<button id="loadBooks" @click="${loadAllBooks}">LOAD ALL BOOKS</button>`;
    const emptyDiv = html `<div id="editDiv"></div>`;
    const table = html `<table><thead><tr><th>Title</th><th>Author</th><th>Action</th></tr></thead><tbody></tbody></table>`;
    const createForm = html `<form id="createForm"><h3>FORM</h3><label>TITLE</label><input type="text" name="title" placeholder="Title..."><label>AUTHOR</label><input type="text" name="author" placeholder="Author..."><button id="create" @click="${createBook}">Submit</button></form>`;

    const elementsArray = [ button, table, createForm, emptyDiv ];
    render(elementsArray, htmlElements.body);

    async function loadAllBooks(){
        const tbody = document.querySelector('tbody');

        try{
            const res = await fetch(`http://localhost:3030/jsonstore/collections/books`);
            const data = await res.json();

            const trEl = (book) => html `<tr id="${book[0]}"><td>${book[1].title}</td><td>${book[1].author}</td><td><button @click="${showEdit}">Edit</button><button @click="${deleteBook}">Delete</button></td></tr>`;
            render(Object.entries(data).map(e => trEl(e)), tbody);
        }catch(err){
            console.log(err);
        }
    }

    async function createBook(e){
        e.preventDefault();

        await saveData(e, 'post');
    }

    async function deleteBook(e){
        e.preventDefault();

        await fetch(`http://localhost:3030/jsonstore/collections/books/${e.target.parentElement.parentElement.id}`, { method: 'delete'});
        await loadAllBooks();
    }

    async function editBook(e){
        e.preventDefault();

        await saveData(e, 'put', e.target.parentElement.id);
        removeEditForm();
    }

    function showEdit(e){
        document.querySelector('#createForm').style.display = 'none';

        const parentElement = e.target.parentElement.parentElement;

        const title = parentElement.firstElementChild.textContent;
        const author = parentElement.firstElementChild.nextElementSibling.textContent;
        const id = parentElement.id;

        const editForm = html `<form id="${id}"><h3>Edit FORM</h3><label>TITLE</label><input type="text" name="title" placeholder="Title..." value="${title}"><label>AUTHOR</label><input type="text" name="author" placeholder="Author..." value="${author}"><button id="edit" @click="${editBook}">Save</button><button id="cancel" @click="${cancelEdit}">Cancel</button></form>`;
        render(editForm, document.querySelector('#editDiv'));
    }

    function cancelEdit(){
        clear();
    }

    async function saveData(e, method, id){
        const form = e.target.parentElement;
        const formData = new FormData(e.target.parentElement);
        const url = method === 'post' ? 'http://localhost:3030/jsonstore/collections/books' : `http://localhost:3030/jsonstore/collections/books/${id}`;

        const entry = Object.fromEntries([...formData.entries()]);
        const hasEmptyStrings = Object.entries(entry).some(([key, value]) => value === '');

        if(!hasEmptyStrings){
            await fetch(url, { method, headers: { 'Content-Type': 'application/json' }, body: JSON.stringify(entry)});
            await loadAllBooks();
            form.reset();
        }
    }

    function removeEditForm(){
        document.querySelector('#createForm').style.display = 'block';
        render(html ``, document.querySelector('#editDiv'));
    }
}

function book_libraryV3(){
    const url = `http://localhost:3030/jsonstore/collections/books`;
    const htmlElements = {
        body: document.querySelector('body')
    }

    const button = html `<button id="loadBooks" @click="${loadAllBooks}">LOAD ALL BOOKS</button>`;
    const emptyDiv = html `<div id="editDiv"></div>`;
    const table = html `<table><thead><tr><th>Title</th><th>Author</th><th>Action</th></tr></thead><tbody></tbody></table>`;
    const createForm = html `<form id="createForm"><h3>FORM</h3><label>TITLE</label><input type="text" name="title" placeholder="Title..."><label>AUTHOR</label><input type="text" name="author" placeholder="Author..."><button id="create" @click="${createBook}">Submit</button></form>`;

    const elementsArray = [ button, table, createForm, emptyDiv ];
    render(elementsArray, htmlElements.body);

    async function loadAllBooks(){
        const tbody = document.querySelector('tbody');

        try{
            const res = await fetch(url);
            const data = await res.json();

            const trEl = (book) => html `<tr id="${book[0]}"><td>${book[1].title}</td><td>${book[1].author}</td><td><button @click="${showEdit}">Edit</button><button @click="${deleteBook}">Delete</button></td></tr>`;
            render(Object.entries(data).map(e => trEl(e)), tbody);
        }catch(err){
            console.log(err);
        }
    }

    async function createBook(e){
        e.preventDefault();

        await saveData(e, 'post');
    }

    async function deleteBook(e){
        e.preventDefault();

        await fetch(`${url}/${e.target.parentElement.parentElement.id}`, { method: 'delete'});
        await loadAllBooks();
    }

    async function editBook(e){
        e.preventDefault();

        await saveData(e, 'put', e.target.parentElement.id);
        removeEditForm();
    }

    function showEdit(e){
        document.querySelector('#createForm').style.display = 'none';

        const parentElement = e.target.parentElement.parentElement;

        const title = parentElement.firstElementChild.textContent;
        const author = parentElement.firstElementChild.nextElementSibling.textContent;
        const id = parentElement.id;

        const editForm = html `<form id="${id}"><h3>Edit FORM</h3><label>TITLE</label><input type="text" name="title" placeholder="Title..." value="${title}"><label>AUTHOR</label><input type="text" name="author" placeholder="Author..." value="${author}"><button id="edit" @click="${editBook}">Save</button><button id="cancel" @click="${cancelEdit}">Cancel</button></form>`;
        render(editForm, document.querySelector('#editDiv'));
    }

    function cancelEdit(){
        clear();
    }

    async function saveData(e, method, id){
        const form = e.target.parentElement;
        const formData = new FormData(e.target.parentElement);
        const urlSaveData = method === 'post' ? url : `${url}/${id}`;

        const entry = Object.fromEntries([...formData.entries()]);
        const hasEmptyStrings = Object.entries(entry).some(([key, value]) => value === '');

        if(!hasEmptyStrings){
            await fetch(urlSaveData, { method, headers: { 'Content-Type': 'application/json' }, body: JSON.stringify(entry)});
            await loadAllBooks();
            form.reset();
        }
    }

    function removeEditForm(){
        document.querySelector('#createForm').style.display = 'block';
        render(html ``, document.querySelector('#editDiv'));
    }
}

function book_libraryV4(){
    const dataTd = (entryData) => html `<td>${entryData}</td>`;
    const tBodyTr = ([id, data]) => html `<tr id=${id}>${Object.entries(data).filter(x => x[0] !== '_id').map(x => dataTd(x[1]))}<td><button class="editBookBtn">Edit</button><button class="deleteBookBtn">Delete</button></td></tr>`;
    const tableTemp = (booksData = []) => html `<thead><tr><th>Title</th><th>Author</th><th>Action</th></tr></thead><tbody>${booksData.map(x => tBodyTr(x))}</tbody>`;
    const formTemplate = (className = 'createForm', submitText = 'Submit', id = '') => html `<form id=${id} class=${className}><h3>${submitText === 'Submit' ? 'Create book' : 'Edit book'}</h3><label>TITLE</label><input type="text" name="title" placeholder="Title..."><label>AUTHOR</label><input type="text" name="author" placeholder="Author..."><input type="submit" .value=${submitText}></form>`;
    const indexPage = (booksData = []) => html `<button id="loadBooks">LOAD ALL BOOKS</button><div id="forms"><table>${tableTemp(booksData)}</table><div id="formDiv">${formTemplate()}</div></div>`;

    const request = async (url, options = {}) => {
        const response = await fetch(url, options);
        return response.json();
    }

    const createOptions = (method = 'GET', headers = {}, data = {}) => {
        return {
            method,
            headers: { ...{ 'Content-Type': 'application/json', }, ...headers },
            body: JSON.stringify(data)
        }
    }

    const baseUrl = 'http://localhost:3030/jsonstore/collections/books';

    const loadBooks = async () => await request(baseUrl);
    const createBook = async data => request(baseUrl, createOptions('POST', undefined, data));
    const getBook = async id => request(`${baseUrl}/${id}`);
    const updateBook = async (id, data) => await request(`${baseUrl}/${id}`, createOptions('PUT', undefined, data));
    const deleteBook = async (id) => request(`${baseUrl}/${id}`, createOptions('DELETE', undefined));

    const clearInputs = (...inputs) => inputs.forEach(x => x.value = '');
    const getId = e => e.target.parentNode.parentNode.id;
    const checkValidInput = (formData) => formData.every(x => x !== '' && x !== ' ');

    const body = document.querySelector('body');
    render(indexPage(), body);

    const clearInput = () => clearInputs(document.querySelector('input[name="title"]'), document.querySelector('input[name="author"]'));

    document.addEventListener('click', e => {
        if(e.target.tagName === 'BUTTON'){
            const id = e.target.id ? e.target.id : e.target.className;

            const actions = {
                'loadBooks': async () => {
                    const booksData = Object.entries(await loadBooks());
                    render(indexPage(booksData), body);
                },
                'editBookBtn': async () => {
                    const bookResponse = await getBook(getId(e));
                    render(formTemplate('editForm', 'Save', getId(e)), document.getElementById('formDiv'));

                    document.querySelector('input[name="title"]').value = bookResponse.title;
                    document.querySelector('input[name="author"]').value = bookResponse.author;
                },
                'deleteBookBtn': async () => {
                    await deleteBook(getId(e));
                    const bookData = await loadBooks();

                    render(tableTemp(Object.entries(bookData)), document.querySelector('table'));
                }
            }

            actions[id]();
        }
    });

    document.addEventListener('submit', e => {
        e.preventDefault();

        const className = e.target.className;
        const formData = new FormData(e.target);
        const data = Object.fromEntries([...formData.entries()]);

        const actions = {
            editForm: async () => {
                await updateBook(e.target.id, data);
                const booksData = Object.entries(await loadBooks());

                render(indexPage(booksData), body);
                render(formTemplate('createForm', 'Submit'), document.getElementById('formDiv'));
                clearInput();
            },
            createForm: async () => {
                await createBook(data);
                clearInput();
                render(indexPage(Object.entries(await loadBooks())), body);
            }
        }

        if(checkValidInput(Object.values(data))){
            actions[className]();
        }
    });
}
