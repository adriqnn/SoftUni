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
