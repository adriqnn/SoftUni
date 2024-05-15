function edit_elementV1(element, match, replacer){
    const text = element.textContent;
    const pattern = new RegExp(match, 'g');
    element.textContent = text.replace(pattern, replacer);
}

function edit_elementV2(element, match, replacer) {
    const r = new RegExp(match, "g")
    element.textContent = element.textContent.replace(r, replacer);
}