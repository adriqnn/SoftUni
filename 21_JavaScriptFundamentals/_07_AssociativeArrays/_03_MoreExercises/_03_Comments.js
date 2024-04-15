function commentsV1(input){
    let db = [];
    let articles = {};

    input.forEach(e => {
        let [first, ...second] = e.split(" ");

        if(first === "user"){
            if(db.indexOf(second) === -1){
                db.push(second.join(" "));
            }
        }else if(first === "article"){
            if(!articles.hasOwnProperty(second)){
                articles[second.join(" ")] = { count: 0};
            }
        }else{
            let [username, details] = e.split(" posts on ");
            let [article, commentDetails] = details.split(": ");
            let [commentTitle, commentContent] = commentDetails.split(", ");

            if(articles.hasOwnProperty(article) && db.indexOf(username) !== -1){
                if(!articles[article].hasOwnProperty(username)){
                    articles[article][username] = [];
                }

                articles[article].count++;
                articles[article][username].push(`${commentTitle} - ${commentContent}`);
            }
        }
    });

    return Object.entries(articles).sort((a, b) => b[1].count - a[1].count).map(e => {
        delete e[1].count;
        return e;
    }).map(e => `Comments on ${e[0]}\n${Object.entries(e[1]).sort((a, b) => a[0].localeCompare(b[0])).map(e => {
        let user = e[0];
        return e[1].map(e => `--- From user ${user}: ${e}`).join("\n");
    }).join("\n")}`).join("\n");
}

const commentsV2 = function(input){
    let db = [];
    let articles = {};

    input.forEach(e => {
        let [first, ...second] = e.split(" ");

        if(first === "user"){
            if(db.indexOf(second) === -1){
                db.push(second.join(" "));
            }
        }else if(first === "article"){
            if(!articles.hasOwnProperty(second)){
                articles[second.join(" ")] = { count: 0};
            }
        }else{
            let [username, details] = e.split(" posts on ");
            let [article, commentDetails] = details.split(": ");
            let [commentTitle, commentContent] = commentDetails.split(", ");

            if(articles.hasOwnProperty(article) && db.indexOf(username) !== -1){
                if(!articles[article].hasOwnProperty(username)){
                    articles[article][username] = [];
                }

                articles[article].count++;
                articles[article][username].push(`${commentTitle} - ${commentContent}`);
            }
        }
    });

    return Object.entries(articles).sort((a, b) => b[1].count - a[1].count).map(e => {
        delete e[1].count;
        return e;
    }).map(e => `Comments on ${e[0]}\n${Object.entries(e[1]).sort((a, b) => a[0].localeCompare(b[0])).map(e => {
        let user = e[0];
        return e[1].map(e => `--- From user ${user}: ${e}`).join("\n");
    }).join("\n")}`).join("\n");
}

const commentsV3 = (input) => {
    let db = [];
    let articles = {};

    input.forEach(e => {
        let [first, ...second] = e.split(" ");

        if(first === "user"){
            if(db.indexOf(second) === -1){
                db.push(second.join(" "));
            }
        }else if(first === "article"){
            if(!articles.hasOwnProperty(second)){
                articles[second.join(" ")] = { count: 0};
            }
        }else{
            let [username, details] = e.split(" posts on ");
            let [article, commentDetails] = details.split(": ");
            let [commentTitle, commentContent] = commentDetails.split(", ");

            if(articles.hasOwnProperty(article) && db.indexOf(username) !== -1){
                if(!articles[article].hasOwnProperty(username)){
                    articles[article][username] = [];
                }

                articles[article].count++;
                articles[article][username].push(`${commentTitle} - ${commentContent}`);
            }
        }
    });

    return Object.entries(articles).sort((a, b) => b[1].count - a[1].count).map(e => {
        delete e[1].count;
        return e;
    }).map(e => `Comments on ${e[0]}\n${Object.entries(e[1]).sort((a, b) => a[0].localeCompare(b[0])).map(e => {
        let user = e[0];
        return e[1].map(e => `--- From user ${user}: ${e}`).join("\n");
    }).join("\n")}`).join("\n");
}

// console.log(commentsV1(['user aUser123', 'someUser posts on someArticle: NoTitle, stupidComment', 'article Books', 'article Movies', 'article Shopping', 'user someUser', 'user uSeR4', 'user lastUser', 'uSeR4 posts on Books: I like books, I do really like them', 'uSeR4 posts on Movies: I also like movies, I really do', 'someUser posts on Shopping: title, I go shopping every day', 'someUser posts on Movies: Like, I also like movies very much']));
// console.log(commentsV1(['user xsomeUser', 'user aUser123', 'xsomeUser posts on someArticle: NoTitle, stupidComment', 'article Books', 'article Movies', 'article Shopping', 'user xsomeUser', 'user uSeR4', 'user lastUser', 'uSeR4 posts on Books: I like books, I do really like them', 'uSeR4 posts on Movies: I also like movies, I really do', 'xsomeUser posts on Shopping: title, I go shopping every day', 'xsomeUser posts on Movies: Like, I also like movies very much']));
// console.log(commentsV1(['user aUser123', 'article Books', 'article Movies', 'article Shopping', 'user someUser', 'user uSeR4', 'user lastUser', 'uSeR4 posts on Books: I like books, I do really like them', 'uSeR4 posts on Movies: I also like movies, I really do', 'someUser posts on Shopping: title, I go shopping every day', 'someUser posts on Movies: Like, I also like movies very much', 'someUser posts on Movies: Like, I also like movies very much', 'someUser posts on Shopping: title, I go shopping every day', 'someUser posts on Shopping: title, I go shopping every day', 'someUser posts on Shopping: title, I go shopping every day']));