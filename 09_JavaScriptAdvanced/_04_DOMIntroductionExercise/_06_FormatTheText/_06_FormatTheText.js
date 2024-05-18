function format_the_textV1(){
    let input = document.getElementById('input').value;
    let output = document.getElementById('output');
    let sentences = input.split('.').filter(s => s.length !== 0);

    while(sentences.length > 0){
        let textForParagraph = sentences.splice(0, 3).join('. ') + '.';
        let p = document.createElement('p');
        p.textContent = textForParagraph;
        output.appendChild(p);
    }
}

function format_the_textV2(){
    const html = {
        textField: document.getElementById("input"),
        outputDiv: document.getElementById("output"),
    }

    const workArr = html.textField.value.split(".").filter(x => x.length >= 1).map(x => x.trim());
    const tagTemplate = (tag, text) => `<${tag}>${text}</${tag}>`;
    let tempIndex = 0;

    html.outputDiv.innerHTML = workArr.reduce((a, v, i) => {
            if (i % 3 === 0 && i !== 0) tempIndex += 1;
            a[tempIndex] = (a[tempIndex] || "") + `${v}.`;

            return a;
        }, []).map(x => tagTemplate("p", x)).join("\n");
}

function format_the_textV3(){
    const html = {
        input: document.getElementById("input"),
        output: document.getElementById("output")
    }

    const inputArray = html.input.value.split(".").filter(x => x.length >= 1).map(x => x.trim());

    while (inputArray.length > 0){
        let textForParagraph = inputArray.splice(0, 3).join('. ') + '.';
        let p = document.createElement('p');
        p.textContent = textForParagraph;
        html.output.appendChild(p);
    }
}
