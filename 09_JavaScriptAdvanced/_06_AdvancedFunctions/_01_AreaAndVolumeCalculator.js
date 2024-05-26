function area_and_volume_calculatorV1(fArea, fVol, input){
    const data = JSON.parse(input);
    const result = [];

    for (const cube of data) {
        const current = {
            area: fArea.call(cube),
            volume: fVol.call(cube)
        }

        result.push(current);
    }

    return result;
}

function area_and_volume_calculatorV2(fArea, fVol, input){
    return JSON.parse(input).reduce((a, v, i, obj) => {
        a.push({
            area: fArea.call(v),
            volume: fVol.call(v)
        });

        return a;
    }, []);
}

function area_and_volume_calculatorV3(fArea, fVol, input){
    let objects = JSON.parse(input);

    function calc(obj){
        let areaObj = Math.abs(fArea.call(obj));
        let volumeObj = Math.abs(fVol.call(obj));

        return {area: areaObj, volume: volumeObj};
    }

    return objects.map(calc);
}
