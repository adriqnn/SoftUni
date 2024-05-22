function sectionsV1(words){
    let content = document.getElementById('content');

    for (const word of words) {
        let div = document.createElement('div');
        let p = document.createElement('p');

        p.textContent = word;
        p.style.display = 'none';

        div.appendChild(p);
        div.addEventListener('click', reveal);
        // div.addEventListener('click', (ev) => {
        //     ev.currentTarget.children[0].style.display = '';
        // });
        content.appendChild(div);

    }
    function reveal(ev){
        ev.currentTarget.children[0].style.display = '';
    }
}

function sectionsV2(words){
    let html = {
        content: document.getElementById("content")
    }


    for (const word of words) {
        let div = document.createElement("div");
        let p = document.createElement("p");

        p.textContent = word;
        p.style.display = 'none';

        div.appendChild(p);
        div.addEventListener('click', reveal);

        html.content.appendChild(div);
    }

    function reveal(e){
        e.currentTarget.children[0].style.display = '';
    }
}

function sectionsV3(words){
    let html = {
        content: document.getElementById("content")
    }


    for (const word of words) {
        let div = document.createElement("div");
        let p = document.createElement("p");

        p.textContent = word;
        p.style.display = 'none';

        div.appendChild(p);
        div.addEventListener('click', reveal);

        html.content.appendChild(div);
    }

    function reveal(e){
        if(e.currentTarget.children[0].style.display === ''){
            e.currentTarget.children[0].style.display = 'none';
        }else{
            e.currentTarget.children[0].style.display = '';
        }
    }
}

function sectionsV4(words){
    const elements = [];
    const output = document.getElementById("content");

    function eFactory(tag, content = "") {
        const temp = document.createElement(tag);
        temp.innerHTML = content;

        return temp;
    }

    words.forEach(x => {
        const div = eFactory("div");
        const p = eFactory("p", x);
        p.style.display = "none";

        div.appendChild(p);
        div.addEventListener("click", () => (p.style.display = "block"));
        elements.push(div);
    });

    elements.forEach(x => output.appendChild(x));
}

function sectionsV5(words){
    const output = document.getElementById("content");

    function eFactory(tag, content = "") {
        const temp = document.createElement(tag);
        temp.innerHTML = content;

        return temp;
    }

    words.forEach(e => {
        const div = eFactory("div");
        const p = eFactory("p", e);
        p.style.display = "none";

        div.appendChild(p);
        div.addEventListener("click", () => (p.style.display = "block"));

        output.appendChild(div);
    });
}