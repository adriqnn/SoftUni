function list_processorV1(input){
    let arr = [];

    let obj = {
        add: (str) => arr.push(str),
        remove: (str) => arr = arr.filter(x => x !== str),
        print: () => console.log(arr.join(","))
    }

    input.forEach(e => {
        const [command, value] = e.split(" ");
        obj[command](value);
    });
}
