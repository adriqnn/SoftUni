function pascal_or_camel_caseV1(){
    let text = document.getElementById('text').value;
    let namingConvention = document.getElementById('naming-convention').value;
    let result = '';
    let words = text.split(/(\s+)/).filter(x => x !==  ' ');

    if(namingConvention === 'Pascal Case'){
        for (let i = 0; i < words.length; i++) {
            words[i] = words[i].charAt(0).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        result = words.join('');

    }else if(namingConvention === 'Camel Case'){
        for (let i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            if(i > 0){
                words[i] = words[i].charAt(0).toUpperCase() + words[i].substring(1);
            }
        }
        result = words.join('');
    }else {
        result = 'Error!'
    }

    document.getElementById('result').textContent = result;
}

function pascal_or_camel_caseV2(){
    const data = {
        case: document.getElementById("naming-convention").value,
        str: document.getElementById("text").value,
        resultSpan: document.getElementById("result"),
    }

    const result = data.str.split(" ").map(x => x.toLocaleLowerCase()).map(x => `${x.charAt(0).toLocaleUpperCase()}${x.slice(1)}`).join("");

    if (data.case !== "Camel Case" && data.case !== "Pascal Case") {
        data.resultSpan.innerHTML = "Error!";
    } else {
        data.resultSpan.innerHTML = data.case === "Pascal Case" ? result : `${result.charAt(0).toLocaleLowerCase()}${result.slice(1)}`;
    }
}

function pascal_or_camel_caseV3(){
    const html = {
        case: document.getElementById("naming-convention").value,
        modifyStrong: document.getElementById("text").value,
        result: document.getElementById("result")
    }

    const modified = html.modifyStrong.split(" ").map(x => x.toLocaleLowerCase()).map(x => `${x.charAt(0).toLocaleUpperCase()}${x.slice(1)}`).join("");

    
    if (html.case !== "Camel Case" && html.case !== "Pascal Case") {
        html.result.textContent = "Error!";
    } else {
        html.result.textContent = html.case === "Pascal Case" ? modified : `${modified.charAt(0).toLocaleLowerCase()}${modified.slice(1)}`;
    }
}
