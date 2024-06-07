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
