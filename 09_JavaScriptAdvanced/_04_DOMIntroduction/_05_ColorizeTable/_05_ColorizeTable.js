function colorize_tableV1(){
    const rows = document.querySelectorAll('tr');

    for (let i = 1; i < rows.length; i+= 2) {
        rows[i].style.background = 'teal'; 
    }
}

function colorize_tableV2(){
    const rows = document.querySelectorAll('tr:nth-child(2n)');

    for (let i = 0; i < rows.length; i++) {
        rows[i].style.background = 'teal';
    }
}

function colorize_tableV3(){
    let elements =  Array.from(document.querySelectorAll(`table tr:nth-child(even)`)).forEach((el => el.style.backgroundColor = `Teal`));
}

function colorize_tableV4(){
    const rows = Array.from(document.querySelectorAll(`tr`));

    for (let i = 1; i < rows.length; i+= 2) {
        rows[i].style.backgroundColor = `Teal`;
        
    }
}

function colorize_tableV5() {
    let table = Array.from(document.getElementsByTagName("tr"));

    table = table.map((x, i) => {
        if (i % 2 !== 0) {
            x.style.backgroundColor = "teal";
        }

        return x;
    });
}