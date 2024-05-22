function encode_and_decode_messagesV1(){
    let textAreas = document.querySelectorAll('textarea');
    let buttons = document.querySelectorAll('button');

    buttons[0].addEventListener('click', encode);
    buttons[1].addEventListener('click', decode);

    function encode(e){
        let encodeMessage = '';
        let input = textAreas[0].value;

        for (let i = 0; i < input.length; i++) {
            encodeMessage += String.fromCharCode(input[i].charCodeAt(0) + 1);
        }

        textAreas[1].value = encodeMessage;
        textAreas[0].value = '';
    }

    function decode(e){
        let decodeMessage = '';
        let input = textAreas[1].value;

        for (let i = 0; i < input.length; i++) {
            decodeMessage += String.fromCharCode(input[i].charCodeAt(0) - 1);
        }

        textAreas[1].value = decodeMessage;
    }
}

function encode_and_decode_messagesV2(){
    const html = {
        textAreas: document.querySelectorAll('textarea'),
        buttons: document.querySelectorAll('button')
    }

    html.buttons[0].addEventListener('click', encode);
    html.buttons[1].addEventListener('click', decode);

    function encode(){
        let encodeMessage = '';
        let input = html.textAreas[0].value;

        for (let i = 0; i < input.length; i++) {
            encodeMessage += String.fromCharCode(input[i].charCodeAt(0) + 1);
        }

        html.textAreas[1].value = encodeMessage;
        html.textAreas[0].value = '';
    }

    function decode(){
        let decodeMessage = '';
        let input = html.textAreas[1].value;

        for (let i = 0; i < input.length; i++) {
            decodeMessage += String.fromCharCode(input[i].charCodeAt(0) - 1);
        }

        html.textAreas[1].value = decodeMessage;
    }
}

function encode_and_decode_messagesV3(){
    const [encodeField, decodeField] = document.querySelectorAll("textarea");

    const transform = (str, type) => str.split("").map(x => String.fromCharCode(type === "encode" ? x.charCodeAt(0) + 1 : x.charCodeAt(0) - 1)).join("");

    document.addEventListener("click", e => {
        if (e.target.tagName === "BUTTON") {
            if (e.target.textContent.includes("Encode")) {
                decodeField.value = transform(encodeField.value, "encode");
                encodeField.value = "";
            } else {
                decodeField.value = transform(decodeField.value, "decode");
            }
        }
    });
}