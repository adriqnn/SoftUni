function table_search_engineV1(){
    document.querySelector('#searchBtn').addEventListener('click', onClick);

    let rows = document.querySelectorAll('tbody tr');
    let input = document.getElementById('searchField');


    function onClick(){
        for(let row of rows){
            row.classList.remove('select');
            if(row.innerHTML.includes(input.value)){
                row.className = 'select';
            }
        }

        input.value = '';
    }
}

function table_search_engineV2(){
    const data = {
        collection: document.getElementsByTagName("tr"),
        getValue: () => document.getElementById("searchField").value,
    }

    function onClick({ collection, value }) {
        collection.map(x => (x.className = ""));
        collection.map(x => {
            if (x.innerHTML.includes(value)) {
                x.className = "select";
            }

            return x;
        });
    }

    document.getElementById("searchBtn").addEventListener("click", () =>
        onClick({
            collection: Array.from(data.collection),
            value: data.getValue(),
        })
    );
}

function table_search_engineV3(){
    const html = {
        table: document.querySelectorAll('tbody tr'),
        search: document.getElementById("searchField"),
        button: document.getElementById("searchBtn")
    }

    html.button.addEventListener('click', entries);

    function entries(){
        for(let row of html.table){
            row.classList.remove('select');

            if(row.innerHTML.includes(html.search.value)){
                row.className = 'select';
            }
        }

        html.search.value = '';
    }
}

function table_search_engineV4(){
    const html = {
        table: document.querySelectorAll('tbody tr'),
        button: document.getElementById("searchBtn"),
        search: () => document.getElementById("searchField").value
    }

    html.button.addEventListener('click', entries);

    function entries(){
        for(let row of html.table){
            row.classList.remove('select');

            if(row.innerHTML.includes(html.search())){
                row.className = 'select';
            }
        }

        document.getElementById("searchField").value = "";
    }
}
