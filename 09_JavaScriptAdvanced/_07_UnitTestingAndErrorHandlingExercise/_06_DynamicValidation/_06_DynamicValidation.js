function dynamic_validationV1(){
    let emailEl = document.getElementById('email');
    let pattern = new RegExp('^[a-z]+@[a-z]+\\.[a-z]+');

    emailEl.addEventListener('change', () => {
        if(pattern.test(emailEl.value)){
            emailEl.classList.remove('error');
        }else{
            emailEl.classList.add('error');
        }
    });
}

function dynamic_validationV2(){
    const input = document.getElementById("email");

    function isValidEmail(str) {
        return /^[a-z]+@[a-z]+\.[a-z]+/g.test(str);
    }

    function applyStyle(e, email) {
        e.className = isValidEmail(email) ? "" : "error";
    }

    input.addEventListener("change", e => applyStyle(e.target, e.target.value));
}
