function armiesV1(input){
    let armies = {};

    input.forEach(e => {
        if(e.includes(":")){
            let [leader, properties] = e.split(": ");

            if(armies.hasOwnProperty(leader)){
                let [army, count] = properties.split(", ");
                armies[leader][army] = Number(count);
                armies[leader].total += Number(count);
            }
        }else if(e.includes("+")){
            let [army, count] = e.split(" + ");

            Object.entries(armies).forEach(e => {
                if(e[1].hasOwnProperty(army)){
                    e[1][army] = e[1][army] + Number(count);
                    armies[e[0]].total += Number(count);
                }
            });
        }else{
            let line = e.split(" "), leader = line.slice(0, -1).join(" "), word = line.pop();
            word === "arrives" ? armies[leader] = {total: 0} : delete armies[leader];
        }
    });


    return Object.entries(armies).sort((a, b) => b[1].total - a[1].total).map(e => {
        let firstLine = `${e[0]}: ${e[1].total}`;
        delete e[1].total;
        let secondLine = `${Object.entries(e[1]).sort((a, b) => b[1] - a[1]).map(e => `>>> ${e[0]} - ${e[1]}`).join("\n")}`;
        return `${firstLine}\n${secondLine}`;
    }).join("\n");
}

const armiesV2 = function(input){
    let armies = {};

    input.forEach(e => {
        if(e.includes(":")){
            let [leader, properties] = e.split(": ");

            if(armies.hasOwnProperty(leader)){
                let [army, count] = properties.split(", ");
                armies[leader][army] = Number(count);
                armies[leader].total += Number(count);
            }
        }else if(e.includes("+")){
            let [army, count] = e.split(" + ");

            Object.entries(armies).forEach(e => {
                if(e[1].hasOwnProperty(army)){
                    e[1][army] = e[1][army] + Number(count);
                    armies[e[0]].total += Number(count);
                }
            });
        }else{
            let line = e.split(" "), leader = line.slice(0, -1).join(" "), word = line.pop();
            word === "arrives" ? armies[leader] = {total: 0} : delete armies[leader];
        }
    });


    return Object.entries(armies).sort((a, b) => b[1].total - a[1].total).map(e => {
        let firstLine = `${e[0]}: ${e[1].total}`;
        delete e[1].total;
        let secondLine = `${Object.entries(e[1]).sort((a, b) => b[1] - a[1]).map(e => `>>> ${e[0]} - ${e[1]}`).join("\n")}`;
        return `${firstLine}\n${secondLine}`;
    }).join("\n");
}

const armiesV3 = (input) => {
    let armies = {};

    input.forEach(e => {
        if(e.includes(":")){
            let [leader, properties] = e.split(": ");

            if(armies.hasOwnProperty(leader)){
                let [army, count] = properties.split(", ");
                armies[leader][army] = Number(count);
                armies[leader].total += Number(count);
            }
        }else if(e.includes("+")){
            let [army, count] = e.split(" + ");

            Object.entries(armies).forEach(e => {
                if(e[1].hasOwnProperty(army)){
                    e[1][army] = e[1][army] + Number(count);
                    armies[e[0]].total += Number(count);
                }
            });
        }else{
            let line = e.split(" "), leader = line.slice(0, -1).join(" "), word = line.pop();
            word === "arrives" ? armies[leader] = {total: 0} : delete armies[leader];
        }
    });


    return Object.entries(armies).sort((a, b) => b[1].total - a[1].total).map(e => {
        let firstLine = `${e[0]}: ${e[1].total}`;
        delete e[1].total;
        let secondLine = `${Object.entries(e[1]).sort((a, b) => b[1] - a[1]).map(e => `>>> ${e[0]} - ${e[1]}`).join("\n")}`;
        return `${firstLine}\n${secondLine}`;
    }).join("\n");
}

// console.log(armiesV1(['Rick Burr arrives', 'Fergus: Wexamp, 30245', 'Rick Burr: Juard, 50000', 'Findlay arrives', 'Findlay: Britox, 34540', 'Wexamp + 6000', 'Juard + 1350', 'Britox + 4500', 'Porter arrives', 'Porter: Legion, 55000', 'Legion + 302', 'Rick Burr defeated', 'Porter: Retix, 3205']))
