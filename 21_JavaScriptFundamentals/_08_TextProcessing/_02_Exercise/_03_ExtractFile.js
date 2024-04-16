function extract_fileV1(path){
    let file = path.split("\\").pop();

    let name= file.substring(0, file.lastIndexOf("."));
    let extension= file.substring(file.lastIndexOf(".") + 1);

    return `File name: ${name}\nFile extension: ${extension}`;
}

const extract_fileV2 = function(path){
    let file = path.split("\\").pop();

    let name= file.substring(0, file.lastIndexOf("."));
    let extension= file.substring(file.lastIndexOf(".") + 1);

    return `File name: ${name}\nFile extension: ${extension}`;
}

const extract_fileV3 = (path) => {
    let file = path.split("\\").pop();

    let name= file.substring(0, file.lastIndexOf("."));
    let extension= file.substring(file.lastIndexOf(".") + 1);

    return `File name: ${name}\nFile extension: ${extension}`;
}

// console.log(extract_fileV1('C:\\Internal\\training-internal\\Template.pptx'));
