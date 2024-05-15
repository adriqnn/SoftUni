function extract_parenthesisV1(content){
    const text = document.getElementById(content).textContent;
    let result = '';

    const pattern = /\((.+?)\)/g;
    let match = pattern.exec(text);

    while(match != null){
        result += match[1] + '; ';
        match = pattern.exec(text);
    }

    return result;
}

function extract_parenthesisV2(content){
    const target = document.getElementById(content);

    return target.innerHTML.match(/(?!\()[\w*\s*\d*]*(?=\))/g).filter(x => x !== "").join("; ");
}