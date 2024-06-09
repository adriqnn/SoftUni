window.addEventListener('load', serviceV2);

function serviceV2(){
    const input = {
        type: document.getElementById('type-product'),
        description: document.getElementById('description'),
        clientName: document.getElementById('client-name'),
        phone: document.getElementById('client-phone')
    }

    const lists = {
        received: document.getElementById('received-orders'),
        completed: document.getElementById('completed-orders')
    }

    const submitBTN = document.querySelector('#right form button');
    submitBTN.addEventListener('click', sendInfo);

    const clearBTN = document.querySelector('#completed-orders button');
    clearBTN.addEventListener('click', clearOrders);

    function sendInfo(event){
        event.preventDefault();

        const type = input.type.value;
        const description = input.description.value;
        const clientName = input.clientName.value;
        const phone = input.phone.value;

        if(description === '' || clientName === '' || phone === ''){
            return;
        }

        input.type.value = '';
        input.description.value = '';
        input.clientName.value = '';
        input.phone.value = '';
        
        const div = document.createElement('div');
        div.className = 'container';
        div.innerHTML = `<h2>Product type for repair: ${type}</h2>
                         <h3>Client information: ${clientName}, ${phone}</h3>
                         <h4>Description of the problem: ${description}</h4>
                         <button class="start-btn">Start repair</button>
                         <button class="finish-btn">Finish repair</button>`;

        const startBtn = div.querySelector('.start-btn');
        startBtn.addEventListener('click', startRepair);

        const finishBtn = div.querySelector('.finish-btn');
        finishBtn.addEventListener('click', finishRepair);
        finishBtn.disabled = true;

        lists.received.appendChild(div);

        function startRepair(){
            startBtn.disabled = true;
            finishBtn.disabled = false;
        }

        function finishRepair(){
            startBtn.remove();
            finishBtn.remove();
            lists.completed.appendChild(div);
        }
    }

    function clearOrders(e){
        lists.completed.innerHTML = '';
    }
}