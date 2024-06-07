function juice_flavorsV1(arr){
    let juices = {};
    let bottles = {};

    for(let juice of arr){
        let[flavor,qty] = juice.split(' => ');

        if(!juices.hasOwnProperty(flavor)){
            juices[flavor] = 0;
        }

        juices[flavor] += Number(qty);
        createBottle(flavor);
    }

    let result = "";
    for(let flavor in bottles){
        result += `${flavor} => ${bottles[flavor]}\n`;
    }
    
    return result;

    function createBottle(flavor){
        if(juices[flavor] >= 1000){
            if(!bottles.hasOwnProperty(flavor)){
                bottles[flavor] = 0;
            }

            let numberOfBottles = Math.floor(juices[flavor] / 1000);
            bottles[flavor] += numberOfBottles;
            juices[flavor] -= (numberOfBottles * 1000);
        }
    }
}

function juice_flavorsV2(arr){
    const juices = {};
    const bottles = {};

    const addBottles = (n, q) => {
        const btlToAdd = (q - (q % 1000)) / 1000;

        if(btlToAdd > 0){
            bottles[n] = (bottles[n] || 0) + btlToAdd;
            return q % 1000;
        }

        return q;
    }

    arr.forEach(x => {
        const [name, quantity] = x.split(' => ');
        juices[name] = juices[name] || 0;

        juices[name] = addBottles(name, juices[name] + Number(quantity));
    });

    return Object.entries(bottles).map(([name, quantity]) => `${name} => ${quantity}`).join('\n');
}
