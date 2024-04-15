function arena_tierV1(array){
    let cesar = array.pop();
    let gladiators = {};

    array.forEach(e => {
        if(!e.includes("vs")){
            let [name, skill, power] = e.split(" -> ");

            if(!gladiators.hasOwnProperty(name)){
                gladiators[name] = {};
            }

            if(gladiators[name].hasOwnProperty(skill)){
                gladiators[name][skill] = Math.max(gladiators[name][skill], power);
            }else{
                gladiators[name][skill] = Number(power);
            }
        }else{
            let [gladOne, gladTwo] = e.split(" vs ");

            if(gladiators.hasOwnProperty(gladOne) && gladiators.hasOwnProperty(gladTwo)){
                const first = Object.entries(gladiators[gladOne]);
                const second = Object.entries(gladiators[gladTwo]);

                if(first.some(x => second.some(y => y.includes(x[0])))){
                    let sumFirst = sumSkill(Object.entries(gladiators[gladOne]));
                    let sumSecond = sumSkill(Object.entries(gladiators[gladTwo]));

                    sumFirst > sumSecond ? delete gladiators[gladTwo] : delete gladiators[gladOne];
                }
            }
        }
    });

    function sumSkill(glad) {
        return glad.reduce((a, v) => a + v[1], 0);
    }

    const result = Object.entries(gladiators).sort((x, y) =>{
        let cmp = sumSkill(Object.entries(y[1])) - sumSkill(Object.entries(x[1]));

        if(cmp === 0){
            cmp = x[0].localeCompare(y[0]);
        }

        return cmp;
    });

    return result.map(e => {
        const skills = Object.entries(e[1]).sort((x, y) => (y[1] - x[1] !== 0 ? y[1] - x[1] : x[0].localeCompare(y[0])));
        return `${e[0]}: ${sumSkill(skills)} skill\n${skills.map(x => `- ${x[0]} <!> ${x[1]}`).join("\n")}`;
    }).join("\n");
}

const arena_tierV2 = function(array){
    let cesar = array.pop();
    let gladiators = {};

    array.forEach(e => {
        if(!e.includes("vs")){
            let [name, skill, power] = e.split(" -> ");

            if(!gladiators.hasOwnProperty(name)){
                gladiators[name] = {};
            }

            if(gladiators[name].hasOwnProperty(skill)){
                gladiators[name][skill] = Math.max(gladiators[name][skill], power);
            }else{
                gladiators[name][skill] = Number(power);
            }
        }else{
            let [gladOne, gladTwo] = e.split(" vs ");

            if(gladiators.hasOwnProperty(gladOne) && gladiators.hasOwnProperty(gladTwo)){
                const first = Object.entries(gladiators[gladOne]);
                const second = Object.entries(gladiators[gladTwo]);

                if(first.some(x => second.some(y => y.includes(x[0])))){
                    let sumFirst = sumSkill(Object.entries(gladiators[gladOne]));
                    let sumSecond = sumSkill(Object.entries(gladiators[gladTwo]));

                    sumFirst > sumSecond ? delete gladiators[gladTwo] : delete gladiators[gladOne];
                }
            }
        }
    });

    function sumSkill(glad) {
        return glad.reduce((a, v) => a + v[1], 0);
    }

    const result = Object.entries(gladiators).sort((x, y) =>{
        let cmp = sumSkill(Object.entries(y[1])) - sumSkill(Object.entries(x[1]));

        if(cmp === 0){
            cmp = x[0].localeCompare(y[0]);
        }

        return cmp;
    });

    return result.map(e => {
        const skills = Object.entries(e[1]).sort((x, y) => (y[1] - x[1] !== 0 ? y[1] - x[1] : x[0].localeCompare(y[0])));
        return `${e[0]}: ${sumSkill(skills)} skill\n${skills.map(x => `- ${x[0]} <!> ${x[1]}`).join("\n")}`;
    }).join("\n");
}

const arena_tierV3 = (array) => {
    let cesar = array.pop();
    let gladiators = {};

    array.forEach(e => {
        if(!e.includes("vs")){
            let [name, skill, power] = e.split(" -> ");

            if(!gladiators.hasOwnProperty(name)){
                gladiators[name] = {};
            }

            if(gladiators[name].hasOwnProperty(skill)){
                gladiators[name][skill] = Math.max(gladiators[name][skill], power);
            }else{
                gladiators[name][skill] = Number(power);
            }
        }else{
            let [gladOne, gladTwo] = e.split(" vs ");

            if(gladiators.hasOwnProperty(gladOne) && gladiators.hasOwnProperty(gladTwo)){
                const first = Object.entries(gladiators[gladOne]);
                const second = Object.entries(gladiators[gladTwo]);

                if(first.some(x => second.some(y => y.includes(x[0])))){
                    let sumFirst = sumSkill(Object.entries(gladiators[gladOne]));
                    let sumSecond = sumSkill(Object.entries(gladiators[gladTwo]));

                    sumFirst > sumSecond ? delete gladiators[gladTwo] : delete gladiators[gladOne];
                }
            }
        }
    });

    function sumSkill(glad) {
        return glad.reduce((a, v) => a + v[1], 0);
    }

    const result = Object.entries(gladiators).sort((x, y) =>{
        let cmp = sumSkill(Object.entries(y[1])) - sumSkill(Object.entries(x[1]));

        if(cmp === 0){
            cmp = x[0].localeCompare(y[0]);
        }

        return cmp;
    });

    return result.map(e => {
        const skills = Object.entries(e[1]).sort((x, y) => (y[1] - x[1] !== 0 ? y[1] - x[1] : x[0].localeCompare(y[0])));
        return `${e[0]}: ${sumSkill(skills)} skill\n${skills.map(x => `- ${x[0]} <!> ${x[1]}`).join("\n")}`;
    }).join("\n");
}

// console.log(arena_tierV1(['Peter -> BattleCry -> 400', 'Alex -> PowerPunch -> 300', 'Stefan -> Duck -> 200', 'Stefan -> Tiger -> 250', 'Ave Cesar']));
//  console.log(arena_tierV1(['Peter -> Duck -> 400', 'Julius -> Shield -> 150', 'Gladius -> Heal -> 200', 'Gladius -> Support -> 250', 'Gladius -> Shield -> 250', 'Peter vs Gladius', 'Gladius vs Julius', 'Gladius vs Maximilian', 'Ave Cesar']));
