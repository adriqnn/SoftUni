function delete_from_tableV1(){
    //select input field and read value;
    const input = document.querySelector('input[name ="email"]');
    const value = input.value;

    //repeat for every table row
    //select second column
    //compare text content with input value
    //if they are equal - remove current row
    //clear field
    const rows = Array.from(document.querySelectorAll('tbody tr'));

    let found = false;
    for (let row of rows) {
        const text = row.children[1].textContent;

        if(text === value){
            const parent = row.parentElement;
            parent.removeChild(row);
            found = true;
        }
    }

    //display result
    if(found){
        document.getElementById('result').textContent = 'Deleted.';
    }else{
        document.getElementById('result').textContent = 'Not found.';
    }
}

function delete_from_tableV2(){
    const html = {
        input: document.querySelector('input[name="email"]').value,
        rows: Array.from(document.querySelectorAll("tbody tr")),
        result: document.getElementById("result")
    }
    
    let found = false;
    for (const row of html.rows) {
        const text = row.children[1].textContent;

        if(text === html.input){
            const parent = row.parentElement;
            parent.removeChild(row);
            found = true;
        }
    }

    found ? html.result.textContent = 'Deleted.' : html.result.textContent = 'Not found.';
}

function delete_from_tableV3(){
    const data = {
        emails: Array.from(document.querySelectorAll("tbody tr td:nth-child(2)")),
        inputValue: document.querySelector("body > label > input[type=text]").value,
        outputField: document.getElementById("result"),
    }

    let removed = false;

    data.emails.forEach(x => {
        if (x.innerHTML.includes(data.inputValue)) {
            x.parentNode.remove();
            data.outputField.innerHTML = "Deleted.";

            removed = true
        }
    });

    if (removed === false) data.outputField.innerHTML = "Not found.";
}