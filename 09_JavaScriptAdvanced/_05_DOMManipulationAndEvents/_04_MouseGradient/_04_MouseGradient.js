function mouse_gradientV1(){
    const gradient = document.getElementById('gradient');
    const result = document.getElementById('result');

    gradient.addEventListener('mousemove', onMouseMove);

    function onMouseMove(ev){
        let moveNumber = Math.trunc((ev.offsetX / (gradient.clientWidth - 1)) * 100);
        result.textContent = `${moveNumber}%`;
    }
}

function mouse_gradientV2(){
    const html = {
        gradient: document.getElementById("gradient"),
        result: document.getElementById("result")
    }

    html.gradient.addEventListener("mousemove", mouseOver);

    function mouseOver(ev){
        html.result.textContent = `${Math.trunc((ev.offsetX / (html.gradient.clientWidth - 1)) * 100)}%`;
    }
}

function mouse_gradientV3() {
    const html = {
        hoverDiv: document.getElementById("gradient"),
        output: document.getElementById("result")
    }

    function displayPercent(event, element) {
        html.output.textContent = `${Math.trunc((event.offsetX / (html.hoverDiv.clientWidth - 1)) * 100)}%`;
    }

    html.hoverDiv.addEventListener("mousemove", e => displayPercent(e, html.hoverDiv));
}

function mouse_gradientV4(){
    let gradient = document.getElementById('gradient');
    gradient.addEventListener('mousemove', gradientMove);
    gradient.addEventListener('mouseout', gradientOut);

    function gradientMove(event) {
        let power = event.offsetX / (event.target.clientWidth - 1);
        power = Math.trunc(power * 100);
        document.getElementById('result').textContent = power + "%";
    }

    function gradientOut(event) {
        document.getElementById('result').textContent = "";
    }
}