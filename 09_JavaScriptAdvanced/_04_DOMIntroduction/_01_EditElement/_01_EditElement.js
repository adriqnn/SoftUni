function edit_elementV1(element, match, replacer){
    const text = element.textContent;
    const pattern = new RegExp(match, 'g');
    element.textContent = text.replace(pattern, replacer);
}

function edit_elementV2(element, match, replacer) {
    const r = new RegExp(match, "g");
    element.textContent = element.textContent.replace(r, replacer);
}

function edit_elementV3(htmlElement, match, replacerString){
    const regex = new RegExp(match, "g");
    htmlElement.textContent = htmlElement.textContent.replace(regex, replacerString);
}

function edit_elementV4(htmlElement, match, replacerString){
    let textContent = htmlElement.textContent;
    const regex = new RegExp(match, "g");

    htmlElement.textContent = textContent.replace(regex, replacerString);
}
