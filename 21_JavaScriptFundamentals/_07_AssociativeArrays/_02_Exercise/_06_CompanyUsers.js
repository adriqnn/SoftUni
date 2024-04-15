function company_usersV1(input){
    let companies = {};

    input.forEach(e => {
        let [ company, id] = e.split(" -> ");

        if(!companies.hasOwnProperty(company)){
            companies[company] = [];
        }

        if(companies[company].indexOf(id) === -1){
            companies[company].push(id);
        }
    });

    return Object.entries(companies).sort((a, b) => a[0].localeCompare(b[0])).map(e => `${e[0]}\n${e[1].map(e => `-- ${e}`).join("\n")}`).join("\n");
}

const company_usersV2 = function(input){
    let companies = {};

    input.forEach(e => {
        let [ company, id] = e.split(" -> ");

        if(!companies.hasOwnProperty(company)){
            companies[company] = [];
        }

        if(companies[company].indexOf(id) === -1){
            companies[company].push(id);
        }
    });

    return Object.entries(companies).sort((a, b) => a[0].localeCompare(b[0])).map(e => `${e[0]}\n${e[1].map(e => `-- ${e}`).join("\n")}`).join("\n");
}

const company_usersV3 = (input) => {
    let companies = {};

    input.forEach(e => {
        let [ company, id] = e.split(" -> ");

        if(!companies.hasOwnProperty(company)){
            companies[company] = [];
        }

        if(companies[company].indexOf(id) === -1){
            companies[company].push(id);
        }
    });

    return Object.entries(companies).sort((a, b) => a[0].localeCompare(b[0])).map(e => `${e[0]}\n${e[1].map(e => `-- ${e}`).join("\n")}`).join("\n");
}

// console.log(company_usersV1(['SoftUni -> AA12345', 'SoftUni -> CC12344', 'Lenovo -> XX23456', 'SoftUni -> AA12345', 'Movement -> DD11111']));