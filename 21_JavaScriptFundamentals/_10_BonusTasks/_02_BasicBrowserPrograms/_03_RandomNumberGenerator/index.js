const myButton = document.getElementById("myButton");
const myLabel1 = document.getElementById("label1");
const myLabel2 = document.getElementById("label2");
const myLabel3 = document.getElementById("label3");

const min = 1;
const max = 6;

let randomNum;

myButton.onclick = function(){
    randomNum = Math.floor(Math.random() * max) + min;
    myLabel1.textContent = randomNum;
    randomNum = Math.floor(Math.random() * max) + min;
    myLabel2.textContent = randomNum;
    randomNum = Math.floor(Math.random() * max) + min;
    myLabel3.textContent = randomNum;
}