function tseam_accountV1(array){
    let games = array.shift().split(" ");
    let commands = array.shift();

    while(commands !== "Play!"){
        let [command, game] = commands.split(" ");

        if(command === "Install"){
            if(games.indexOf(game) === -1){
                games.push(game);
            }
        }else if(command === "Uninstall"){
            let index = games.indexOf(game);
            if(index !== -1){
                games.splice(index, 1);
            }
        }else if(command === "Update"){
            let index = games.indexOf(game);
            if(index !== -1){
                games.push(...games.splice(index, 1));
            }
        }else if(command === "Expansion"){
            let line = game.split("-");
            let index = games.indexOf(line[0]);
            if(index !== -1){
                games.splice(index + 1, 0, game.replace("-", ":"));
            }
        }

        commands = array.shift();
    }

    return games.join(" ");
}

const tseam_accountV2 = function(array){
    let games = array.shift().split(" ");
    let commands = array.shift();

    while(commands !== "Play!"){
        let [command, game] = commands.split(" ");

        if(command === "Install"){
            if(games.indexOf(game) === -1){
                games.push(game);
            }
        }else if(command === "Uninstall"){
            let index = games.indexOf(game);
            if(index !== -1){
                games.splice(index, 1);
            }
        }else if(command === "Update"){
            let index = games.indexOf(game);
            if(index !== -1){
                games.push(...games.splice(index, 1));
            }
        }else if(command === "Expansion"){
            let line = game.split("-");
            let index = games.indexOf(line[0]);
            if(index !== -1){
                games.splice(index + 1, 0, game.replace("-", ":"));
            }
        }

        commands = array.shift();
    }

    return games.join(" ");
}

const tseam_accountV3 = (array) => {
    let games = array.shift().split(" ");
    let commands = array.shift();

    while(commands !== "Play!"){
        let [command, game] = commands.split(" ");

        if(command === "Install"){
            if(games.indexOf(game) === -1){
                games.push(game);
            }
        }else if(command === "Uninstall"){
            let index = games.indexOf(game);
            if(index !== -1){
                games.splice(index, 1);
            }
        }else if(command === "Update"){
            let index = games.indexOf(game);
            if(index !== -1){
                games.push(...games.splice(index, 1));
            }
        }else if(command === "Expansion"){
            let line = game.split("-");
            let index = games.indexOf(line[0]);
            if(index !== -1){
                games.splice(index + 1, 0, game.replace("-", ":"));
            }
        }

        commands = array.shift();
    }

    return games.join(" ");
}

// console.log(tseam_accountV1(['CS WoW Diablo', 'Install LoL', 'Uninstall WoW', 'Update Diablo', 'Expansion CS-Go', 'Play!']));
// console.log(tseam_accountV1(['CS WoW Diablo', 'Uninstall XCOM', 'Update PeshoGame', 'Update WoW', 'Expansion Civ-V', 'Play!']));
