function highlight_activeV1(){
    Array.from(document.querySelectorAll('input')).forEach(i => {
        i.addEventListener('focus', onFocus);
        i.addEventListener('blur', onBlur);
    });


    function onFocus(ev){
        ev.target.parentElement.className = 'focused';
        //ev.target.parentElement.classList.add('focused');
    }

    function onBlur(ev){
        ev.target.parentElement.className = '';
        //ev.target.parentElement.className.remove('focused');
    }
}

function highlight_activeV2(){
    const html = {
        elements: Array.from(document.querySelectorAll("input"))
    }

    html.elements.forEach(e => {
        e.addEventListener('focus', onFocus);
        e.addEventListener('blur', onBlur);
    });

    function onFocus(e){
        e.target.parentElement.className = 'focused';
    }

    function onBlur(e){
        e.target.parentElement.className = '';
    }
}

function highlight_activeV3() {
    const inputs = document.getElementsByTagName("input");

    const addFocus = e => (e.parentNode.className = "focused");
    const removeFocus = e => (e.parentNode.className = "");

    Array.from(inputs).forEach(x => {
        x.addEventListener("focus", e => addFocus(e.target));
        x.addEventListener("blur", e => removeFocus(e.target));
    });
}