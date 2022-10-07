function solve(){
    const params = Array.from(arguments);
    const types = {};

    for (const arg of params) {
        const type = typeof arg;
        console.log(`${type}: ${arg}`)

        if(types[type] == undefined){
            types[type] = 0;
        }
        types[type]++;
    }
    //console.log(types);
    const result = Object.entries(types).sort((a,b) => b[1] - a[1]);
    for (const [type,count] of result) {
        console.log(`${type} = ${count}`)
    }
}
function solve2(...params){
    const types = {};

    for (const arg of params) {
        const type = typeof arg;
        console.log(`${type}: ${arg}`)

        if(types[type] == undefined){
            types[type] = 0;
        }
        types[type]++;
    }
    //console.log(types);
    const result = Object.entries(types).sort((a,b) => b[1] - a[1]);
    for (const [type,count] of result) {
        console.log(`${type} = ${count}`)
    }
}