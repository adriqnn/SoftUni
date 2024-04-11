function build_a_wallV1(array){
    let days = [];
    array.map(e => Number(e));

    while(array.some(e => e !== 30)){
        let sum = 0;
        let index = 0;

        array.forEach(e => {
            if(e < 30){
                sum += 195;
                array[index] = array[index] + 1;
            }

            index++;
        });

        days.push(sum);
    }

    return `${days.join(", ")}\n${days.reduce((a,v) => a + v, 0) * 1900} pesos`;
}

const build_a_wallV2 = function(array){
    let days = [];
    array.map(e => Number(e));

    while(array.some(e => e !== 30)){
        let sum = 0;
        let index = 0;

        array.forEach(e => {
            if(e < 30){
                sum += 195;
                array[index] = array[index] + 1;
            }

            index++;
        });

        days.push(sum);
    }

    return `${days.join(", ")}\n${days.reduce((a,v) => a + v, 0) * 1900} pesos`;
}

const build_a_wallV3 = (array) => {
    let days = [];
    array.map(e => Number(e));

    while(array.some(e => e !== 30)){
        let sum = 0;
        let index = 0;

        array.forEach(e => {
            if(e < 30){
                sum += 195;
                array[index] = array[index] + 1;
            }

            index++;
        });

        days.push(sum);
    }

    return `${days.join(", ")}\n${days.reduce((a,v) => a + v, 0) * 1900} pesos`;
}

// console.log(build_a_wallV1([21, 25, 28]));
// console.log(build_a_wallV1([17, 22, 17, 19, 17]));
