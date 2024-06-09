function _01_MailsDelivery(){
    const input = {
        recipient: document.getElementById('recipientName'),
        title: document.getElementById('title'),
        message: document.getElementById('message')
    }

    const lists = {
        listMails: document.querySelector('.list-mails ul'),
        sentMails: document.querySelector('.sent-list'),
        trash: document.querySelector('.delete-list')
    }

    const submitButton = document.getElementById('add');
    submitButton.addEventListener('click', addToList);

    const resetButton = document.getElementById('reset');
    resetButton.addEventListener('click', resetForm);

    function addToList(event){
        event.preventDefault();

        const recipient = input.recipient.value;
        const title = input.title.value;
        const message = input.message.value;

        if(recipient === '' || title === '' || message === ''){
            return;
        }

        input.recipient.value = '';
        input.title.value = '';
        input.message.value = '';

        const li = document.createElement('li');
        li.innerHTML = `<h4>Title: ${title}</h4>
                        <h4>Recipient Name: ${recipient}</h4>
                        <span>${message}</span>
                        <div id="list-action">
                            <button type="submit" id="send">Send</button>
                            <button type="submit" id="delete">Delete</button>
                        </div>`;

        const sendButton = li.querySelector('#send');
        sendButton.addEventListener('click', sendFunction);

        const deleteButton = li.querySelector('#delete');
        deleteButton.addEventListener('click', deleteFunction);

        lists.listMails.appendChild(li);

        function sendFunction(e){
            e.preventDefault()
            li.remove();
            li.innerHTML = `<span>To: ${recipient}</span>
                            <span>Title: ${title}</span>
                            <div class="btn">
                                <button type="submit" class="delete">Delete</button>
                            </div>`;

            const deleteButton2 = li.querySelector('.delete');
            deleteButton2.addEventListener('click', deleteFunction);

            lists.sentMails.appendChild(li);
        }

        function deleteFunction(e){
            e.preventDefault()
            li.innerHTML = `<li>
                                <span>To: ${recipient}</span>
                                <span>Title: ${title}</span>
                            </li>`;

            lists.trash.appendChild(li)
        }
    }

    function resetForm(e){
        e.preventDefault()
        input.recipient.value = '';
        input.title.value = '';
        input.message.value = '';
    }
}

_01_MailsDelivery();