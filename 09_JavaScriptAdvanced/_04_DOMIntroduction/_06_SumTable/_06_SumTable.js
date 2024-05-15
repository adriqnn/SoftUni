function sum_tableV1(){
    const rows = Array.from(document.querySelectorAll(`tr`)).slice(1, -1);

    let sum = 0;
    for (let row of rows){
        const value = Number(row.lastElementChild.textContent);
        sum += value;
    }

    document.getElementById(`sum`).textContent = sum;
}

function sum_tableV2() {
    let dataCells = Array.from(document.getElementsByTagName("td"));

    document.getElementById("sum").innerHTML = dataCells.slice(0, dataCells.length - 1).reduce((a, v) => a + (Number(v.innerHTML) || 0), 0);
}