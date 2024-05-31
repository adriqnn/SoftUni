function next_articleV1(articles){
    const div = document.getElementById('content');

    return function(){
        const article = articles.shift();

        if (article !== undefined){
            const element = document.createElement('article');
            element.textContent = article;
            div.appendChild(element);
        }
    };
}

function next_articleV2(articles) {
    const output = document.getElementById("content");
    const ourCopy = articles.slice();

    return function showNext(arr = []) {
        if (ourCopy[0] !== undefined) {
            const article = document.createElement("article");
            article.innerHTML = ourCopy.shift();
            output.appendChild(article);
        }

        return showNext;
    }
}