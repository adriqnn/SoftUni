function dungeonest_darkV1(input){
    const commands = input[0].split("|");
    let result = "";

    const player = {
        health: 100,
        coins: 0,
        rooms: 0,
        dead: false
    }

    for (const e of commands) {
        let room = e.split(" ");
        let type = room[0];
        let value = Number(room[1]);
        player.rooms++;

        if(type === "potion"){
            let healed = player.health + value >= 100 ? 100 - player.health : value;
            player.health + value >= 100 ? player.health = 100 : player.health = player.health + value;
            result += `You healed for ${healed} hp.\nCurrent health: ${player.health} hp.\n`;
        }else if(type === "chest"){
            player.coins += value;
            result += `You found ${value} coins.\n`;
        }else{
            player.health -= value;
            let health = player.health;

            if(health <= 0){
                result += `You died! Killed by ${type}.\nBest room: ${player.rooms}\n`;
                player.dead = true;
                return result;
            }else{
                result += `You slayed ${type}.\n`;
            }
        }
    }

    player.dead ? result += "" : result += `You've made it!\nCoins: ${player.coins}\nHealth: ${player.health}\n`;
    return result;
}

const dungeonest_darkV2 = function(input){
    const commands = input[0].split("|");
    let result = "";

    const player = {
        health: 100,
        coins: 0,
        rooms: 0,
        dead: false
    }

    for (const e of commands) {
        let room = e.split(" ");
        let type = room[0];
        let value = Number(room[1]);
        player.rooms++;

        if(type === "potion"){
            let healed = player.health + value >= 100 ? 100 - player.health : value;
            player.health + value >= 100 ? player.health = 100 : player.health = player.health + value;
            result += `You healed for ${healed} hp.\nCurrent health: ${player.health} hp.\n`;
        }else if(type === "chest"){
            player.coins += value;
            result += `You found ${value} coins.\n`;
        }else{
            player.health -= value;
            let health = player.health;

            if(health <= 0){
                result += `You died! Killed by ${type}.\nBest room: ${player.rooms}\n`;
                player.dead = true;
                return result;
            }else{
                result += `You slayed ${type}.\n`;
            }
        }
    }

    player.dead ? result += "" : result += `You've made it!\nCoins: ${player.coins}\nHealth: ${player.health}\n`;
    return result;
}

const dungeonest_darkV3 = (input) => {
    const commands = input[0].split("|");
    let result = "";

    const player = {
        health: 100,
        coins: 0,
        rooms: 0,
        dead: false
    }

    for (const e of commands) {
        let room = e.split(" ");
        let type = room[0];
        let value = Number(room[1]);
        player.rooms++;

        if(type === "potion"){
            let healed = player.health + value >= 100 ? 100 - player.health : value;
            player.health + value >= 100 ? player.health = 100 : player.health = player.health + value;
            result += `You healed for ${healed} hp.\nCurrent health: ${player.health} hp.\n`;
        }else if(type === "chest"){
            player.coins += value;
            result += `You found ${value} coins.\n`;
        }else{
            player.health -= value;
            let health = player.health;

            if(health <= 0){
                result += `You died! Killed by ${type}.\nBest room: ${player.rooms}\n`;
                player.dead = true;
                return result;
            }else{
                result += `You slayed ${type}.\n`;
            }
        }
    }

    player.dead ? result += "" : result += `You've made it!\nCoins: ${player.coins}\nHealth: ${player.health}\n`;
    return result;
}

// console.log(dungeonest_darkV1(["rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest 1000"]));
// console.log(dungeonest_darkV1(["cat 10|potion 30|orc 10|chest 10|snake 25|chest 110"]));