function accordionV1(){
    if(document.getElementById('extra').style.display == 'block'){
        document.getElementById('extra').style.display = 'none';
        document.getElementsByClassName('button')[0].textContent = 'More';
    }else{
        document.getElementById('extra').style.display = 'block';
        document.getElementsByClassName('button')[0].textContent = 'Less';
    }
}

function accordionV2(){
    let textElement = document.getElementById('extra');
    let buttonElement = document.getElementsByClassName('button')[0]; 

    if(buttonElement.textContent == 'More'){
        buttonElement.textContent = 'Less';
        textElement.style.display = 'block';
    }else{
        buttonElement.textContent = 'More';
        textElement.style.display = 'none';
    }
}

function accordionV3(){
    if(document.getElementById('extra').style.display == 'inline'){
        document.getElementById('extra').style.display = '';
        document.getElementsByClassName('button')[0].textContent = 'MORE';
    }else{
        document.getElementById('extra').style.display = 'inline';
        document.getElementsByClassName('button')[0].textContent = 'LESS';
    }
}

function accordionV4(){
    const html = {
        button: document.getElementsByClassName("button")[0],
        content: document.getElementById("extra"),
    }

    if (html.button.innerHTML === "More") {
        html.button.innerHTML = "Less";
        html.content.style.display = "block";
    } else {
        html.button.innerHTML = "More";
        html.content.style.display = "none";
    }
}

function accordionV5(){
    const html = {
        button: document.getElementsByClassName("button")[0],
        text: document.getElementById("extra")
    }

    if(html.button.textContent === "More"){
        html.button.textContent = "Less";
        html.text.style.display = "block";
    }else{
        html.button.textContent = "More";
        html.text.style.display = "none";
    }
}
