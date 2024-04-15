function party_timeV1(input){
    let partyList = { "vip": [], "regular": [] };
    let guestList = input.splice(0, input.indexOf("PARTY"));

    input.splice(1, input.length - 1).map(e => {
        if(guestList.includes(e)){
            guestList.splice(guestList.indexOf(e), 1);
        }
    });

    partyList["vip"] = partyList["vip"].concat(guestList.filter(e => !isNaN(e[0])));
    partyList["regular"] = partyList["regular"].concat(guestList.filter(e => isNaN(e[0])));

    let result = `${partyList['vip'].length + partyList['regular'].length}\n`;
    Object.keys(partyList).map(e => {
        if(partyList[e].length > 0){
            partyList[e].map(e => result += `${e}\n`);
        }
    });

    return result;
}

const party_timeV2 = function(input){
    let list = {};

    let index = input.indexOf("PARTY");
    let partyList = input.slice(0, index);
    let guests = input.slice(index + 1);

    let vip = 0;
    let regular = 100;

    partyList.forEach(e => {
        if(!list.hasOwnProperty(e)){
            list[e] = [0, 0];
        }

        list[e][0] = list[e][0] + 1;
        if(isNaN(Number(e.charAt(0)))){
            list[e][1] = regular++;
        }else{
            list[e][1] = vip++;
        }
    });

    guests.forEach(e => {
        if(list.hasOwnProperty(e)){
            list[e][0] = list[e][0] - 1;

            if(list[e][0] === 0){
                delete list[e];
            }
        }
    });

    let notGoing = [];
    Object.entries(list).sort((a, b) => a[1][1] - b[1][1]).forEach(e => {
        for (let i = 0; i < e[1][0]; i++) {
            notGoing.push(e[0]);
        }
    });

    let result = `${Object.keys(list).length}\n`;
    notGoing.forEach(e => result += `${e}\n`);
    return result;
}

const party_timeV3 = (input) => {
    let list = {};

    let index = input.indexOf("PARTY");
    let partyList = input.slice(0, index);
    let guests = input.slice(index + 1);

    let vip = 0;
    let regular = 100;

    partyList.forEach(e => {
        if(!list.hasOwnProperty(e)){
            list[e] = [0, 0];
        }

        list[e][0] = list[e][0] + 1;
        if(isNaN(Number(e.charAt(0)))){
            list[e][1] = regular++;
        }else{
            list[e][1] = vip++;
        }
    });

    guests.forEach(e => {
        if(list.hasOwnProperty(e)){
            list[e][0] = list[e][0] - 1;

            if(list[e][0] === 0){
                delete list[e];
            }
        }
    });

    let notGoing = [];
    Object.entries(list).sort((a, b) => a[1][1] - b[1][1]).forEach(e => {
        for (let i = 0; i < e[1][0]; i++) {
            notGoing.push(e[0]);
        }
    });

    let result = `${Object.keys(list).length}\n`;
    notGoing.forEach(e => result += `${e}\n`);
    return result;
}

// console.log(party_timeV1(['7IK9Yo0h', '9NoBUajQ', 'Ce8vwPmE', 'SVQXQCbc', 'tSzE5t0p', 'PARTY', '9NoBUajQ', 'Ce8vwPmE', 'SVQXQCbc']));
