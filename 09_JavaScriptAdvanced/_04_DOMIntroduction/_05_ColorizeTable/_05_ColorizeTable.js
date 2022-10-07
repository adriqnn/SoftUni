function colorize(){
    const rows = document.querySelectorAll('tr');

    for (let i = 1; i < rows.length; i+= 2) {
        rows[i].style.background = 'teal'; 
    }
}

function colorizev2(){
    const rows = document.querySelectorAll('tr:nth-child(2n)');

    for (let i = 0; i < rows.length; i++) {
        rows[i].style.background = 'teal';
    }
}

function colorizev3(){
    let elements =  Array.from(document.querySelectorAll(`table tr:nth-child(even)`)).forEach((el => el.style.backgroundColor = `Teal`));
}

function colorizev4(){
    const rows = Array.from(document.querySelectorAll(`tr`));

    for (let i = 1; i < rows.length; i+= 2) {
        rows[i].style.backgroundColor = `Teal`;
        
    }
}