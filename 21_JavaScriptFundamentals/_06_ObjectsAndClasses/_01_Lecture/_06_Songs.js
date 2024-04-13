function songsV1(array){
    class Song{
        constructor(type, name, time) {
            this.type = type;
            this.name = name;
            this.time = time;
        }
    }

    let n = array.shift();
    let songs = [];
    let type = array[array.length - 1];

    for (let i = 0; i < n; i++) {
        let [type, name, time] = array[i].split("_");
        songs.push(new Song(type, name, time));
    }


    return type === "all" ? songs.map(e => e.name).join("\n") : songs.filter(e => e.type === type).map(e => e.name).join("\n");
}

const songsV2 = function(array){
    class Song{
        constructor(type, name, time) {
            this.type = type;
            this.name = name;
            this.time = time;
        }
    }

    let n = array.shift();
    let songs = [];
    let type = array[array.length - 1];

    for (let i = 0; i < n; i++) {
        let [type, name, time] = array[i].split("_");
        songs.push(new Song(type, name, time));
    }


    return type === "all" ? songs.map(e => e.name).join("\n") : songs.filter(e => e.type === type).map(e => e.name).join("\n");
}

const songsV3 = (array) => {
    class Song{
        constructor(type, name, time) {
            this.type = type;
            this.name = name;
            this.time = time;
        }
    }

    let n = array.shift();
    let songs = [];
    let type = array[array.length - 1];

    for (let i = 0; i < n; i++) {
        let [type, name, time] = array[i].split("_");
        songs.push(new Song(type, name, time));
    }


    return type === "all" ? songs.map(e => e.name).join("\n") : songs.filter(e => e.type === type).map(e => e.name).join("\n");
}

// console.log(songsV1([3, 'favourite_DownTown_3:14', 'favourite_Kiss_4:16', 'favourite_Smooth Criminal_4:01', 'favourite']));