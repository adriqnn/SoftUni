function sum_numbersV1(){
    const num1 = Number(document.getElementById('num1').value);
    const num2 = Number(document.getElementById('num2').value);

    const result = num1 + num2;
    document.getElementById('sum').value = result;
}

function sum_numbersV2(){
    const num1 = Number(document.getElementById('num1').value);
    const num2 = Number(document.getElementById('num2').value);

    document.getElementById('sum').value = num1 + num2;
}

function sum_numbersV3(){
    const html = {
        getNumField: n => document.getElementById(`num${n}`),
        result: () => document.getElementById("sum"),
    }
    const getNum = e => Number(e.value);

    html.result().value = getNum(html.getNumField(1)) + getNum(html.getNumField(2));
}