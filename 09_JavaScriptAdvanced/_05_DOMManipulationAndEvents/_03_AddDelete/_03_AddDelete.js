function add_deleteV1(){
    //select input field and read its value;
    const content = document.getElementById('newItemText').value;
    //create <li> element;
    const liElement = document.createElement('li');
    //assign input value to element text content;
    liElement.textContent = content;

    //create [Delete] anchor
    const deleteBtn = document.createElement('a');
    deleteBtn.textContent = '[Delete]';
    deleteBtn.href = '#';
    liElement.appendChild(deleteBtn);
    deleteBtn.addEventListener('click', onDelete);

    //select <ul> and append new element;
    const ulElement = document.getElementById('items')
    ulElement.appendChild(liElement);
    //select input field and clear contents(value);
    document.getElementById('newItemText').value = '';


    //creating function for delete
    function onDelete(event){
        event.target.parentElement.remove();
    }
}

function add_deleteV2(){
    const html = {
        content: document.getElementById("newItemText"),
        list: document.getElementById("items")
    }

    const liElement = document.createElement("li");
    liElement.textContent = html.content.value;
    html.content.value = "";
    addDeleteButton(liElement);

    html.list.appendChild(liElement);

    function addDeleteButton(el){
        const deleteBtn = document.createElement("a");
        deleteBtn.textContent = '[Delete]';
        deleteBtn.href = '#';

        el.appendChild(deleteBtn);
        deleteBtn.addEventListener('click', onDelete);
    }

    function onDelete(event){
        event.target.parentElement.remove();
    }
}

function add_deleteV3(){
    const data = {
        valueToAdd: document.getElementById("newText").value,
        list: document.getElementById("items"),
    }

    function eFactory(tag, content) {
        const temp = document.createElement(tag);
        temp.innerHTML = content;

        return temp;
    }

    const item = eFactory("li", data.valueToAdd);
    const deleteLink = eFactory("a", "[Delete]");
    deleteLink.href = "#";
    deleteLink.addEventListener("click", e => e.target.parentNode.remove());

    item.appendChild(deleteLink);
    data.list.appendChild(item);
}

