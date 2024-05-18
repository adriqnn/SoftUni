function show_moreV1(){
    document.getElementById('text').style.display = 'inline';
    document.getElementById('more').style.display = 'none';
}

function show_moreV2(){
    document.getElementById("more").style.display = "none";
    document.getElementById("text").style.display = "inline";
}

function show_moreV3(){
    const html = {
        moreStyle: document.getElementById("more"),
        textStyle: document.getElementById("text")
    }

    html.moreStyle.style.display = "none";
    html.textStyle.style.display = "inline";
}
