function extract_textV1(){
    const items = Array.from(document.querySelectorAll('li'));
    const result = items.map(e => e.textContent).join('\n');
    document.getElementById('result').value = result;
}

function extract_textV2(){
    const html = {
        list: () => document.getElementById("items"),
        result: () => document.getElementById("result"),
    }

    html.result().innerHTML = Array.from(html.list().children).map(x => x.innerHTML).join("\n");
}

function extract_textV3(){
    const html = {
        list: Array.from(document.getElementById("items").children),
        textArea: document.getElementById("result")
    }

    html.textArea.value = html.list.map(e => e.textContent).join("\n");
}
