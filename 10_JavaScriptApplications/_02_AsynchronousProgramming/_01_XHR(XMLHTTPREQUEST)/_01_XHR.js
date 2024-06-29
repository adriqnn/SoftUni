function XHRV1(){
    let url = 'https://api.github.com/users/testnakov/repos';
    const httpRequest = new XMLHttpRequest();

    httpRequest.addEventListener('readystatechange', function(){
       if(httpRequest.readyState === 4 && httpRequest.status === 200){
          document.getElementById("res").textContent = httpRequest.responseText;
       }
    });

    httpRequest.open("GET", url);
    httpRequest.send();
}

function XHRV2(){
    let button = document.getElementById("load");

    button.addEventListener('click', function loadRepos(){
        let url = 'https://api.github.com/users/testnakov/repos';
        const httpRequest = new XMLHttpRequest();

        httpRequest.addEventListener('readystatechange', function (){
            if(httpRequest.readyState === 4 && httpRequest.status === 200){
                document.getElementById("res").textContent = httpRequest.responseText;
            }
        });

        httpRequest.open("GET", url);
        httpRequest.send();
    });
}


function XHRV3(){
    let button = document.getElementById("load");
    button.addEventListener('click', loadRepos);

    function loadRepos(){
        let url = 'https://api.github.com/users/testnakov/repos';
        const xhr = new XMLHttpRequest();

        xhr.open('GET', url, true);
        xhr.onload = function(){
            if(xhr.status >= 200 && xhr.status < 300){
                document.getElementById("res").textContent = xhr.responseText;
            }
        }

        xhr.send();
    }
}

function XHRV4(){
    let button = document.getElementById("load");

    button.addEventListener('click', function loadRepos(){
        let url = 'https://api.github.com/users/testnakov/repos';
        const httpRequest = new XMLHttpRequest();

        httpRequest.addEventListener('readystatechange', function (){
            if(httpRequest.readyState === 4 && httpRequest.status === 200){
                document.getElementById("res").textContent = httpRequest.responseText;
            }
        });

        httpRequest.open("GET", url);
        httpRequest.send();
    });
}

function XHRV5(){
    let button = document.getElementById("load");

    button.addEventListener('click', function loadRepos(){
        let url = 'https://api.github.com/users/testnakov/repos';
        const httpRequest = new XMLHttpRequest();

        httpRequest.addEventListener('readystatechange', function (){
            if(httpRequest.readyState === 4 && httpRequest.status === 200){
                document.getElementById("res").textContent = httpRequest.responseText;
            }
        });

        httpRequest.open("GET", url);
        httpRequest.send();
    });
}

function XHRV6(){
    let button = document.getElementById("load");

    button.addEventListener('click', function loadRepos(){
        let url = 'https://api.github.com/users/testnakov/repos';
        const httpRequest = new XMLHttpRequest();

        httpRequest.addEventListener('readystatechange', function (){
            if(httpRequest.readyState === 4 && httpRequest.status === 200){
                document.getElementById("res").textContent = httpRequest.responseText;
            }
        });

        httpRequest.open("GET", url);
        httpRequest.send();
    });
}

// Defer XHRV5();
// Async XHRV6();
