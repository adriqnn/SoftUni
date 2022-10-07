function toggle(){
    if(document.getElementById('extra').style.display == 'block'){
        document.getElementById('extra').style.display = 'none';
        document.getElementsByClassName('button')[0].textContent = 'More';
    }else{
        document.getElementById('extra').style.display = 'block';
        document.getElementsByClassName('button')[0].textContent = 'Less';
    }
}

function toggle3(){
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

function toggle2(){
    if(document.getElementById('extra').style.display == 'inline'){
        document.getElementById('extra').style.display = '';
        document.getElementsByClassName('button')[0].textContent = 'MORE';
    }else{
        document.getElementById('extra').style.display = 'inline';
        document.getElementsByClassName('button')[0].textContent = 'LESS';
    }
}