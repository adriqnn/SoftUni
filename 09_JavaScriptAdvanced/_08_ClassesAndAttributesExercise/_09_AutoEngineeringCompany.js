function auto_engineering_companyV1(arr){
    let carRegister = {};

    arr.forEach(element => {
        let [brand, model, quality] = element.split(' | ');

        if(!carRegister.hasOwnProperty(brand)){
            carRegister[brand] = {};
        }

        if(!carRegister[brand].hasOwnProperty(model)){
            carRegister[brand][model] = 0;
        }

        carRegister[brand][model] += Number(quality);
    });

    let result = "";
    for(let brand in carRegister){
        result += `${brand}\n`;
        Object.entries(carRegister[brand]).forEach(el => result += `###${el[0]} -> ${el[1]}\n`);
    }

    return result;
}

function auto_engineering_companyV2(arr){
    const data= {};

    arr.forEach(x => {
        const [brand, model, q] = x.split(' | ');

        data[brand] = data[brand] || {};
        data[brand][model] = data[brand][model] || 0;
        data[brand][model] += Number(q);
    });

    return Object.entries(data).map(([brand, models]) => `${brand}\n${Object.entries(models).map(([model, quantity]) => `###${model} -> ${quantity}`).join('\n')}`).join('\n');
}
