function town_populationV1(info){
    let record = {};

    info.forEach(e => {
        let [town, population] = e.split(" <-> ");

        if(!record.hasOwnProperty(town)){
            record[town] = 0;
        }

        record[town] += Number(population);
    });

    return Object.entries(record).map(e => `${e[0]} : ${e[1]}`).join("\n");
}

function town_populationV2(info){
    const result = {};

    for (const infoElement of info) {
        const tokens = infoElement.split(" <-> ");
        const name = tokens[0];
        let pop = Number(tokens[1]);

        if(result[name] !== undefined){
            pop += result[name];
        }

        result[name] = pop;
    }

    return Object.entries(result).map(e => `${e[0]} : ${e[1]}`).join("\n");
}

function town_populationV3(info){
    const parseData = info.reduce((a, b) => {
        const [name, population] = b.split(" <-> ");
        a[name] = (a[name] || 0) + Number(population);

        return a;
    }, {});

    return Object.entries(parseData).map(x => `${x[0]} : ${x[1]}`).join("\n");
}
