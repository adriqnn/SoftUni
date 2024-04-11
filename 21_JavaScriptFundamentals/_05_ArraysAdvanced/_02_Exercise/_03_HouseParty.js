function house_partyV1(array){
    let partyList = {};
    let result = "";

    for (let i = 0; i < array.length; i++) {
        let [name, _, v2] = array[i].split(" ");

        if(v2 === "going!"){
            partyList.hasOwnProperty(name) ? result +=`${name} is already in the list!\n` : partyList[name] = "yes";
        }else{
            !partyList.hasOwnProperty(name) ? result +=`${name} is not in the list!\n` : delete partyList[name];
        }
    }

    Object.keys(partyList).forEach(e => result += `${e}\n`);
    return result;
}

const house_partyV2 = function(array){
    let partyList = {};
    let result = "";

    for (let i = 0; i < array.length; i++) {
        let [name, _, v2] = array[i].split(" ");

        if(v2 === "going!"){
            partyList.hasOwnProperty(name) ? result +=`${name} is already in the list!\n` : partyList[name] = "yes";
        }else{
            !partyList.hasOwnProperty(name) ? result +=`${name} is not in the list!\n` : delete partyList[name];
        }
    }

    Object.keys(partyList).forEach(e => result += `${e}\n`);
    return result;
}

const house_partyV3 = (array) => {
    let partyList = {};
    let result = "";

    for (let i = 0; i < array.length; i++) {
        let [name, _, v2] = array[i].split(" ");

        if(v2 === "going!"){
            partyList.hasOwnProperty(name) ? result +=`${name} is already in the list!\n` : partyList[name] = "yes";
        }else{
            !partyList.hasOwnProperty(name) ? result +=`${name} is not in the list!\n` : delete partyList[name];
        }
    }

    Object.keys(partyList).forEach(e => result += `${e}\n`);
    return result;
}

// console.log(house_partyV1(["Tom is going!", "Annie is going!", "Tom is going!", "Garry is going!", "Jerry is going!"]));
// console.log(house_partyV1(["Allie is going!", "George is going!", "John is not going!", "George is not going!"]));