function moviesV1(array){
    let movieDB = {};

    const actions = {
        addMovie: (movie) => {
            if(!movieDB.hasOwnProperty(movie)){
                movieDB[movie] = { name: movie };
            }
        },
        directedBy: (movie, director) => {
            if(movieDB.hasOwnProperty(movie)){
                movieDB[movie]["director"] = director;
            }
        },
        onDate: (movie, date) => {
            if(movieDB.hasOwnProperty(movie)){
                movieDB[movie]["date"] = date;
            }
        }
    }

    array.forEach(e => {
        let currentCommand = e.split(" ");

        if(currentCommand[0] === "addMovie"){
            currentCommand.shift();
            actions.addMovie(currentCommand.join(" "));
        }else if(currentCommand.indexOf("directedBy") > -1){
            let newInfo = e.split("directedBy").map(e => e.trim());
            actions.directedBy(newInfo[0], newInfo[1]);
        }else if(currentCommand.indexOf("onDate") > -1){
            let newInfo = e.split("onDate").map(e => e.trim());
            actions.onDate(newInfo[0], newInfo[1]);
        }
    });

    return Object.values(movieDB).filter(e => Object.keys(e).length === 3).map(e => JSON.stringify(e)).join("\n");
}

const moviesV2 = function(){
    let movieDB = {};

    const actions = {
        addMovie: (movie) => {
            if(!movieDB.hasOwnProperty(movie)){
                movieDB[movie] = { name: movie };
            }
        },
        directedBy: (movie, director) => {
            if(movieDB.hasOwnProperty(movie)){
                movieDB[movie]["director"] = director;
            }
        },
        onDate: (movie, date) => {
            if(movieDB.hasOwnProperty(movie)){
                movieDB[movie]["date"] = date;
            }
        }
    }

    array.forEach(e => {
        let currentCommand = e.split(" ");

        if(currentCommand[0] === "addMovie"){
            currentCommand.shift();
            actions.addMovie(currentCommand.join(" "));
        }else if(currentCommand.indexOf("directedBy") > -1){
            let newInfo = e.split("directedBy").map(e => e.trim());
            actions.directedBy(newInfo[0], newInfo[1]);
        }else if(currentCommand.indexOf("onDate") > -1){
            let newInfo = e.split("onDate").map(e => e.trim());
            actions.onDate(newInfo[0], newInfo[1]);
        }
    });

    return Object.values(movieDB).filter(e => Object.keys(e).length === 3).map(e => JSON.stringify(e)).join("\n");
}

const moviesV3 = () => {
    let movieDB = {};

    const actions = {
        addMovie: (movie) => {
            if(!movieDB.hasOwnProperty(movie)){
                movieDB[movie] = { name: movie };
            }
        },
        directedBy: (movie, director) => {
            if(movieDB.hasOwnProperty(movie)){
                movieDB[movie]["director"] = director;
            }
        },
        onDate: (movie, date) => {
            if(movieDB.hasOwnProperty(movie)){
                movieDB[movie]["date"] = date;
            }
        }
    }

    array.forEach(e => {
        let currentCommand = e.split(" ");

        if(currentCommand[0] === "addMovie"){
            currentCommand.shift();
            actions.addMovie(currentCommand.join(" "));
        }else if(currentCommand.indexOf("directedBy") > -1){
            let newInfo = e.split("directedBy").map(e => e.trim());
            actions.directedBy(newInfo[0], newInfo[1]);
        }else if(currentCommand.indexOf("onDate") > -1){
            let newInfo = e.split("onDate").map(e => e.trim());
            actions.onDate(newInfo[0], newInfo[1]);
        }
    });

    return Object.values(movieDB).filter(e => Object.keys(e).length === 3).map(e => JSON.stringify(e)).join("\n");
}

// console.log(moviesV1(['addMovie Fast and Furious', 'addMovie Godfather', 'Inception directedBy Christopher Nolan', 'Godfather directedBy Francis Ford Coppola', 'Godfather onDate 29.07.2018', 'Fast and Furious onDate 30.07.2018', 'Batman onDate 01.08.2018', 'Fast and Furious directedBy Rob Cohen']));