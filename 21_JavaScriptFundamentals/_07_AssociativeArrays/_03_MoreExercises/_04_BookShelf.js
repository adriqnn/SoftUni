function book_shelfV1(input){
    let shelves = {};

    input.forEach(e => {
        if(e.includes("->")){
            let [id, genre] = e.split(" -> ");
            if(!shelves.hasOwnProperty(id)){
                shelves[id] = { genre: genre, count: 0};
            }
        }else{
            let [title, info] = e.split(": ");
            let [author, genre] = info.split(", ");

            Object.entries(shelves).forEach(e => {
                if(e[1].genre === genre){
                    e[1][title] = author;
                    e[1].count++;
                }
            });
        }
    });

    return Object.entries(shelves).sort((a, b) => b[1].count - a[1].count).map(e => {
        let shelfId = `${e[0]} ${e[1].genre}: ${e[1].count}`;
        delete e[1].genre;
        delete e[1].count;
        let books = Object.entries(e[1]).sort((a, b) => a[0].localeCompare(b[0])).map(e => `--> ${e[0]}: ${e[1]}`).join("\n");

        return `${shelfId}\n${books}`;
    }).join("\n");
}

const book_shelfV2 =  function(input){
    let shelves = {};

    input.forEach(e => {
        if(e.includes("->")){
            let [id, genre] = e.split(" -> ");
            if(!shelves.hasOwnProperty(id)){
                shelves[id] = { genre: genre, count: 0};
            }
        }else{
            let [title, info] = e.split(": ");
            let [author, genre] = info.split(", ");

            Object.entries(shelves).forEach(e => {
                if(e[1].genre === genre){
                    e[1][title] = author;
                    e[1].count++;
                }
            });
        }
    });

    return Object.entries(shelves).sort((a, b) => b[1].count - a[1].count).map(e => {
        let shelfId = `${e[0]} ${e[1].genre}: ${e[1].count}`;
        delete e[1].genre;
        delete e[1].count;
        let books = Object.entries(e[1]).sort((a, b) => a[0].localeCompare(b[0])).map(e => `--> ${e[0]}: ${e[1]}`).join("\n");

        return `${shelfId}\n${books}`;
    }).join("\n");
}

const book_shelfV3 = (input) => {
    let shelves = {};

    input.forEach(e => {
        if(e.includes("->")){
            let [id, genre] = e.split(" -> ");
            if(!shelves.hasOwnProperty(id)){
                shelves[id] = { genre: genre, count: 0};
            }
        }else{
            let [title, info] = e.split(": ");
            let [author, genre] = info.split(", ");

            Object.entries(shelves).forEach(e => {
                if(e[1].genre === genre){
                    e[1][title] = author;
                    e[1].count++;
                }
            });
        }
    });

    return Object.entries(shelves).sort((a, b) => b[1].count - a[1].count).map(e => {
        let shelfId = `${e[0]} ${e[1].genre}: ${e[1].count}`;
        delete e[1].genre;
        delete e[1].count;
        let books = Object.entries(e[1]).sort((a, b) => a[0].localeCompare(b[0])).map(e => `--> ${e[0]}: ${e[1]}`).join("\n");

        return `${shelfId}\n${books}`;
    }).join("\n");
}

// console.log(book_shelfV1(['1 -> history', '1 -> action', 'Death in Time: Criss Bell, mystery', '2 -> mystery', '3 -> sci-fi', 'Child of Silver: Bruce Rich, mystery', 'Hurting Secrets: Dustin Bolt, action', 'Future of Dawn: Aiden Rose, sci-fi', 'Lions and Rats: Gabe Roads, history', '2 -> romance', 'Effect of the Void: Shay B, romance', 'Losing Dreams: Gail Starr, sci-fi', 'Name of Earth: Jo Bell, sci-fi', 'Pilots of Stone: Brook Jay, history']));