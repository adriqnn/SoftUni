function focused(){
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