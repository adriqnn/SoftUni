function list_of_itemsV1(){
    //select input field and read its value;
    const content = document.getElementById('newItemText').value;
    //create <li> element;
    const liElement = document.createElement('li');
    //assign input value to element text content;
    liElement.textContent = content;
    //select <ul> and append new element;
    const ulElement = document.getElementById('items');
    ulElement.appendChild(liElement);
    //select input field and clear contents(value);
    document.getElementById('newItemText').value = '';
}

function list_of_itemsV2(){
    const input = document.getElementById('newItemText');
    const liElement = document.createElement('li');
    liElement.textContent = input.value;
    document.getElementById('items').appendChild(liElement);
    input.value = '';
}

function list_of_itemsV3(){
    const html = {
        input: document.getElementById("newItemText"),
        list: document.getElementById("items")
    }

    const liElement = document.createElement("li");
    liElement.textContent = html.input.value;
    html.input.value = "";

    html.list.appendChild(liElement);
}

function list_of_itemsV4(){
    const data = {
        valueToAdd: document.getElementById("newItemText").value,
        list: document.getElementById("items"),
    }

    function eFactory(tag, content){
        const temp = document.createElement(tag);
        temp.innerHTML = content;

        return temp;
    }

    data.list.appendChild(eFactory("li", data.valueToAdd));
}