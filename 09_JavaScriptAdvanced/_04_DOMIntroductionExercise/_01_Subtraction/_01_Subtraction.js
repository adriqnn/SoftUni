function subtractionV1(){
    let firstElementValue = Number(document.getElementById(`firstNumber`).value);
    let secondElementValue = Number(document.getElementById(`secondNumber`).value);
    let resultElement = document.getElementById('result');

    resultElement.textContent = firstElementValue - secondElementValue;
}

function subtractionV2(){
    const html = {
        firstV: document.getElementById("firstNumber"),
        secondV: document.getElementById("secondNumber"),
        result: document.getElementById("result"),
    }

    html.result.innerHTML = (Number(html.firstV.value) || 0) - (Number(html.secondV.value) || 0);
}

function subtractionV3(){
    const html = {
        firstNumber: document.getElementById("firstNumber"),
        secondNumber: document.getElementById("secondNumber"),
        result: document.getElementById("result")
    }

    html.result.textContent = Number(html.firstNumber.value) - Number(html.secondNumber.value);
}
