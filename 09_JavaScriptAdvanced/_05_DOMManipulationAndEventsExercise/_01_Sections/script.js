function create(words){
    let content = document.getElementById('content');

    for (const word of words) {
        let div = document.createElement('div');
        let p = document.createElement('p');
        p.textContent = word;
        p.style.display = 'none';
        div.appendChild(p);
        div.addEventListener('click', reaveal);
        // div.addEventListener('click', (ev) => {
        //     ev.currentTarget.children[0].style.display = '';
        // });
        content.appendChild(div);

    }
    function reaveal(ev){
        ev.currentTarget.children[0].style.display = '';
    }
}