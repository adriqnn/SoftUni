function piccoloV1(input){
    let set = new Set();
    input.forEach(e => e.split(", ")[0] === "IN" ? set.add(e.split(", ")[1]) : set.delete(e.split(", ")[1]));

    return set.size > 0 ? Array.from(set).sort((a, b) => a.localeCompare(b)).map(e => `${e}`).join("\n") : "Parking Lot is Empty";
}

const piccoloV2 = function(input){
    let set = new Set();
    input.forEach(e => e.split(", ")[0] === "IN" ? set.add(e.split(", ")[1]) : set.delete(e.split(", ")[1]));

    return set.size > 0 ? Array.from(set).sort((a, b) => a.localeCompare(b)).map(e => `${e}`).join("\n") : "Parking Lot is Empty";
}

const piccoloV3 = (input) => {
    let set = new Set();
    input.forEach(e => e.split(", ")[0] === "IN" ? set.add(e.split(", ")[1]) : set.delete(e.split(", ")[1]));

    return set.size > 0 ? Array.from(set).sort((a, b) => a.localeCompare(b)).map(e => `${e}`).join("\n") : "Parking Lot is Empty";
}

// console.log(piccoloV1(['IN, CA2844AA', 'IN, CA1234TA', 'OUT, CA2844AA', 'IN, CA9999TT', 'IN, CA2866HI', 'OUT, CA1234TA', 'IN, CA2844AA', 'OUT, CA2866HI', 'IN, CA9876HH', 'IN, CA2822UU']));
// console.log(piccoloV1(['IN, CA2844AA', 'IN, CA1234TA', 'OUT, CA2844AA', 'OUT, CA1234TA']));