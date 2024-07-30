export function eFactory(element, classes, content){
    const el = document.createElement(`${element}`);
    el.className = classes;
    el.innerHTML = `${content}`;

    return el;
}
