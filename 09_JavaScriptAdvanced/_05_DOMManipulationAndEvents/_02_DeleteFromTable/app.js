function deleteByEmail(){
    //select input field and read value;
    const input = document.querySelector('input[name ="email"]');
    const value = input.value;
    //repeat for every table row
    //select second column
    //compare text content with input value
    //if they are equal - removecurrent row
    //clear field
    const rows = Array.from(document.querySelectorAll('tbody tr'));

    let found = false;
    for (let row of rows) {
        const text = row.children[1].textContent;
        if(text == value){
            const parent = row.parentElement;
            parent.removeChild(row);
            found = true;
        }
    }
    //display result
    if(found){
        document.getElementById('result').textContent = 'Deleted.'
    }else{
        document.getElementById('result').textContent = 'Not found.'
    }
}