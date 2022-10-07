function areaVol(areaIn,volIn,input){
    const data = JSON.parse(input);

    const result = [];
    for (const cube of data) {
        const currentResult = {
            area: areaIn.call(cube),
            volume: volIn.call(cube)
        }
        result.push(currentResult);
    }
    return result;
}