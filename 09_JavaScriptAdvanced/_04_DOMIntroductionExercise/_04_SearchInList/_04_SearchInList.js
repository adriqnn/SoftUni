function search_in_listV1(){
    let listElements = document.querySelectorAll('ul#towns li');
    let resultElement = document.getElementById('result');
    let searchText = document.getElementById('searchText').value;
    let matches = 0;

    for (const element of listElements) {
        element.style.fontWeight = 'normal';
        element.style.textDecoration = '';
    }

    for (const element of listElements) {
        let text = element.textContent;
        if(text.match(searchText)){
            matches++;
            element.style.fontWeight = 'bold';
            element.style.textDecoration = 'underline';
        }
    }

    resultElement.textContent = `${matches} matches found`;
}

function search_in_listV2() {
    const html = {
        value: document.getElementById("searchText").value,
        data: document.getElementById("towns").children,
        result: document.getElementById("result"),
    }

    let count = 0

    Array.from(html.data).map(x => {
        if (x.innerHTML.includes(html.value)) {
            x = x.style.textDecoration = "bold underline";
            count += 1;
        }

        return x;
    })

    html.result.innerHTML = `${count} matches found`;
}

function search_in_listV3(){
    const html = {
        search: document.getElementById("searchText").value,
        list: document.getElementById("towns").children,
        result: document.getElementById("result")
    }

    for (const element of html.list) {
        element.style.fontWeight = 'normal';
        element.style.textDecoration = '';
    }

    let count = Array.from(html.list).filter(e => e.textContent.includes(html.search)).map(e => {
        e.style.fontWeight = "bold";
        e.style.textDecoration = "underline";
        
        return e;
    }).length;

    html.result.textContent = `${count} matches found`;
}
