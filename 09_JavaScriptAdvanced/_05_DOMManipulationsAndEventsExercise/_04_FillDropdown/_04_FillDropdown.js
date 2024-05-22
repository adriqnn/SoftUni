function fill_dropdownV1(){
    let newItemText = document.getElementById('newItemText');
    let newItemValue = document.getElementById('newItemValue');
    let select = document.getElementById('menu');

    let optionElement = document.createElement('option');
    optionElement.textContent = newItemText.value;
    optionElement.value = newItemValue.value;

    select.appendChild(optionElement);
    newItemText.value = '';
    newItemValue.value = '';
}

function fill_dropdownV2(){
    const html = {
        newItemText: document.getElementById('newItemText'),
        mewItemValue: document.getElementById('newItemValue'),
        select: document.getElementById('menu')
    }

    let option = document.createElement('option');
    option.textContent = html.newItemText.value;
    option.value = html.mewItemValue.value;

    html.select.appendChild(option);

    html.newItemText.value = '';
    html.mewItemValue.value = "";
}

function fill_dropdownV3(){
    const html = {
        text: document.getElementById("newItemText"),
        value: document.getElementById("newItemValue"),
        menu: document.getElementById("menu")
    }

    const e = document.createElement("option");
    e.textContent = html.text.value;
    e.value = html.value.value;

    html.text.value = "";
    html.value.value = "";

    html.menu.appendChild(e);
}
