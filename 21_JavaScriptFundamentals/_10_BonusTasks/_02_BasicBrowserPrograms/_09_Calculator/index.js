const display = document.getElementById("display");

const actions = {
    "+": (a, b) => a + b,
    "-": (a, b) => a - b,
    "*": (a, b) => a * b,
    "\\": (a, b) => a / b,

}

function appendToDisplay(input){
    display.value += input;
}

function clearDisplay(){
    display.value = "";
}

function calculate(){
    if(display.value.includes("+")){
        let [a, b] = display.value.split(("+"));
        display.value = actions["+"](Number(a), Number(b));
    }else if(display.value.includes("-")){
        let [a, b] = display.value.split(("-"));
        display.value = actions["-"](Number(a), Number(b));
    }else if(display.value.includes("*")){
        let [a, b] = display.value.split(("*"));
        display.value = actions["*"](Number(a), Number(b));
    }else if(display.value.includes("\\")){
        let [a, b] = display.value.split(("\\"));
        display.value = actions["\\"](Number(a), Number(b));
    }
}