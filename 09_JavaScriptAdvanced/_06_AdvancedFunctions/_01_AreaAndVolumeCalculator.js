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
