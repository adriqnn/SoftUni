function subtract(){
    let firstElementValue = Number(document.getElementById(`firstNumber`).value);
    let secondElementValue = Number(document.getElementById(`secondNumber`).value);
    let resultElement = document.getElementById('result');
    resultElement.textContent = firstElementValue - secondElementValue;
}