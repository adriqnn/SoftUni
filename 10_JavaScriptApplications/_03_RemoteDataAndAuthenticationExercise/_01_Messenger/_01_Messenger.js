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
            html.messages.textContent = Object.entries(data).map(e => `${e[1].author}: ${e[1].content}`).join("\n");
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
