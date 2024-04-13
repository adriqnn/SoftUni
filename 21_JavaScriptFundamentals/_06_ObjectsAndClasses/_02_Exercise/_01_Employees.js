function employeesV1(list){
    let employees = {};
    list.forEach(e => employees[e] = e.length);
    return Object.entries(employees).map(([k,v]) => `Name: ${k} -- Personal Number: ${v}`).join("\n");
}

const employeesV2 = function(list){
    const obj = list.reduce((a, v) => {
        a[v] = v.length;
        return a;
    }, {});

    return Object.entries(obj).map(x => `Name: ${x[0]} -- Personal Number: ${x[1]}`).join("\n");
}

const employeesV3 = (list) => {
    let employees = {}
    list.forEach(e => employees[e] = e.length);
    return Object.entries(employees).map(([k,v]) => `Name: ${k} -- Personal Number: ${v}`).join("\n");
}