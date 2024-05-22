function locked_profileV1(){
    Array.from(document.querySelectorAll('.profile button')).forEach(b => b.addEventListener('click', toggle));

    function toggle(e){
        const profile = e.target.parentElement;
        const isActive = profile.querySelector('input[type="radio"][value="unlock"]').checked;

        if(isActive){
            let div = profile.querySelector('div');

            if(e.target.textContent === 'Show more'){
                div.style.display = 'block';
                e.target.textContent = 'Hide it';
            }else{
                div.style.display = '';
                e.target.textContent = 'Show more';
            }
        }
    }
}

function locked_profileV2(){
    const html = {
        buttons: Array.from(document.querySelectorAll('.profile button'))
    }

    html.buttons.forEach(e => e.addEventListener('click', toggle));

    function toggle(e){
        const profile = e.target.parentElement;
        const isActive = profile.querySelector('input[type="radio"][value="unlock"]').checked;

        if(isActive){
            let div = profile.querySelector('div');

            if(e.target.textContent === 'Show more'){
                div.style.display = 'block';
                e.target.textContent = 'Hide it';
            }else{
                div.style.display = '';
                e.target.textContent = 'Show more';
            }
        }
    }
}

function locked_profileV3(){
    const toggle = (btn, content) => {
        if (btn.innerHTML === "Show more") {
            btn.innerHTML = "Hide it";
            content.style.display = "block";
        } else {
            btn.innerHTML = "Show more";
            content.style.display = "none";
        }
    }

    document.getElementById("main").addEventListener("click", e => {
        if (e.target.tagName === "BUTTON") {
            const parent = e.target.parentNode;
            const isUnlocked = parent.querySelector("input[type=radio]:checked").value === "unlock";

            if (isUnlocked) {
                const infoDiv = parent.querySelector("div");
                toggle(e.target, infoDiv);
            }
        }
    });
}