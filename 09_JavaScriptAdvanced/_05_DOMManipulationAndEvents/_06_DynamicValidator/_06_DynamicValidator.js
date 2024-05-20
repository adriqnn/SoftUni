function dynamic_validatorV1() {
    const input = document.getElementById("email");

    function isValidEmail(str){
        return /^[a-z]+@[a-z]+\.[a-z]+/g.test(str);
    }

    function applyStyle(e, email){
        e.className = isValidEmail(email) ? "" : "error";
    }

    input.addEventListener("change", e => applyStyle(e.target, e.target.value));
}

function dynamic_validatorV2(){
    const html = {
        input: document.getElementById("email")
    }

    html.input.addEventListener('change', e => applyStyle(e.target, e.target.value));

    function isValidEmail(str){
        return /^[a-z]+@[a-z]+\.[a-z]+/g.test(str);
    }

    function applyStyle(e, email){
        e.className = isValidEmail(email) ? "" : "error";
    }
}

function dynamic_validatorV3(){
    const html = {
        input: document.getElementById("email")
    }

    html.input.addEventListener('change', (e) => applyStyle(e.target, e.target.value));

    function isValidEmail(str){
        return /^[a-z]+@[a-z]+\.[a-z]+/g.test(str);
    }

    function applyStyle(e, email){
        e.className = isValidEmail(email) ? "" : "error";
    }
}