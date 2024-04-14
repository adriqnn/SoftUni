function school_gradesV1(input){
    let schoolbook = {};

    input.forEach(e => {
        let [name, ...grades] = e.split(" ");
        if(!schoolbook.hasOwnProperty(name)){
            schoolbook[name] = [];
        }

        schoolbook[name].push(...grades);
    });

    let averageArray = Object.entries(schoolbook).map(e => {
        let num = e[1].map(Number).reduce((a, v, i, arr) => {
            a.sum += Number(v);
            a.count++;

            if (i === arr.length - 1) {
                a.average = a.sum / a.count;
            }

            return a;
        } , {sum: 0, count: 0, average: 0}).average.toFixed(2);

        return [e[0], num];
    });

    return averageArray.sort((a, b) => a[0].localeCompare(b[0])).map(e => `${e[0]}: ${e[1]}`).join("\n");
}

const school_gradesV2 = function(input){
    let schoolbook = {};

    input.forEach(e => {
        let [name, ...grades] = e.split(" ");
        if(!schoolbook.hasOwnProperty(name)){
            schoolbook[name] = [];
        }

        schoolbook[name].push(...grades);
    });

    let averageArray = Object.entries(schoolbook).map(e => {
        let num = e[1].map(Number).reduce((a, v, i, arr) => {
            a.sum += Number(v);
            a.count++;

            if (i === arr.length - 1) {
                a.average = a.sum / a.count;
            }

            return a;
        } , {sum: 0, count: 0, average: 0}).average.toFixed(2);

        return [e[0], num];
    });

    return averageArray.sort((a, b) => a[0].localeCompare(b[0])).map(e => `${e[0]}: ${e[1]}`).join("\n");
}

const school_gradesV3 = (input) => {
    let schoolbook = {};

    input.forEach(e => {
        let [name, ...grades] = e.split(" ");
        if(!schoolbook.hasOwnProperty(name)){
            schoolbook[name] = [];
        }

        schoolbook[name].push(...grades);
    });

    let averageArray = Object.entries(schoolbook).map(e => {
        let num = e[1].map(Number).reduce((a, v, i, arr) => {
            a.sum += Number(v);
            a.count++;

            if (i === arr.length - 1) {
                a.average = a.sum / a.count;
            }

            return a;
        } , {sum: 0, count: 0, average: 0}).average.toFixed(2);

        return [e[0], num];
    });

    return averageArray.sort((a, b) => a[0].localeCompare(b[0])).map(e => `${e[0]}: ${e[1]}`).join("\n");
}

// console.log(school_gradesV1(['Lilly 4 6 6 5', 'Tim 5 6', 'Tammy 2 4 3', 'Tim 6 6']));