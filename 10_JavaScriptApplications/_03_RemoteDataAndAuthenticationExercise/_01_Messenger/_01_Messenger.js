function messengerV1(){
    const url = 'http://localhost:3030/jsonstore/messenger';
    const html = {
        messages: document.getElementById('messages'),
        author: document.querySelectorAll('input')[0],
        content: document.querySelectorAll('input')[1],
        submit: document.getElementById('submit'),
        refresh: document.getElementById('refresh')
    }

    refreshInfo();

    html.submit.addEventListener('click', submitInfo);
    html.refresh.addEventListener('click', refreshInfo);

    async function refreshInfo(){
        try{
            const res = await fetch(url);

            if(res.ok !== true){
                throw new Error('Error');
            }

            const data = await res.json();
            html.messages.innerHTML = Object.entries(data).map(e => `${e[1].author}: ${e[1].content}`).join("\n");
        }catch(err){
            console.log(err);
        }
    }

    async function submitInfo(){
        if(html.author.value !== '' && html.content.value !== ''){
            const res = await fetch(url, {
                method: 'post',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify({ author: html.author.value, content: html.content.value })
            });
        }
    }
}

messengerV1();

function messengerV2(){
    document.getElementById('submit').addEventListener('click', sendMessage);
    document.getElementById('refresh').addEventListener('click', refresh);

    async function sendMessage() {
        const [name, message] = document.querySelectorAll('input');

        if(name.value !== '' && message.value !== ''){
            await fetch('http://localhost:3030/jsonstore/messenger', {
                method: 'post',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify({
                    author: name.value,
                    content: message.value
                })
            });

            name.value = '';
            message.value = '';
        }
    }

    async function refresh() {
        const response = await fetch('http://localhost:3030/jsonstore/messenger');
        const data = await response.json();

        document.getElementById('messages').value = Object.values(data).map(m => `${m.author}: ${m.content}`).join('\n');
    }
}

function messengerV3(){
    const url = 'http://localhost:3030/jsonstore/messenger';
    const html = {
        messages: document.getElementById('messages'),
        author: document.querySelectorAll('input')[0],
        content: document.querySelectorAll('input')[1],
        submit: document.getElementById('submit'),
        refresh: document.getElementById('refresh')
    }

    refreshInfo();

    html.submit.addEventListener('click', submitInfo);
    html.refresh.addEventListener('click', refreshInfo);

    function refreshInfo(){
       fetch(url).then(res => {
           if(res.ok !== true){
               throw new Error('Error');
           }

           return res.json();
       }).then(data => {
           html.messages.value = Object.entries(data).map(e => `${e[1].author}: ${e[1].content}`).join("\n");
       }).catch(err => {
           console.log(err);
       });
    }

    function submitInfo(){
        if(html.author.value !== '' && html.content.value !== ''){
            fetch(url, {
                method: 'post',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify({ author: html.author.value, content: html.content.value })
            }).then(res => res.json()).catch(err => console.log(err));
        }
    }
}

function messengerV4(){
    const url = 'http://localhost:3030/jsonstore/messenger';
    const html = {
        messages: document.getElementById('messages'),
        author: document.querySelectorAll('input')[0],
        content: document.querySelectorAll('input')[1],
        submit: document.getElementById('submit'),
        refresh: document.getElementById('refresh')
    }

    refreshInfo();

    html.submit.addEventListener('click', submitInfo);
    html.refresh.addEventListener('click', refreshInfo);

    async function refreshInfo(){
        try{
            const res = await fetch(url);

            if(res.ok !== true){
                throw new Error('Error');
            }

            const data = await res.json();
            html.messages.value = Object.entries(data).map(e => `${e[1].author}: ${e[1].content}`).join("\n");
        }catch(err){
            console.log(err);
        }
    }

    async function submitInfo(){
        if(html.author.value !== '' && html.content.value !== ''){
            await fetch(url, {
                method: 'post',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify({ author: html.author.value, content: html.content.value })
            });

            html.author.value = '';
            html.content.value = '';
        }
    }
}
