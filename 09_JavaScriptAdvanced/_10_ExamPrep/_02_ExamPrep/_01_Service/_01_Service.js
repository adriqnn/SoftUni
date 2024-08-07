window.addEventListener('load', serviceV1);

function serviceV1(){
    let productTypeSelectElement = document.querySelector('#type-product');
    let descriptionTextAreaElement = document.querySelector('#description');
    let clientNameInputElement = document.querySelector('#client-name');
    let clientPhoneInputElement = document.querySelector('#client-phone');
    
    let receivedOrdersSectionElement = document.querySelector('#received-orders');
    let completedOrdersSectionElement = document.querySelector('#completed-orders');

    let sendButtonElement = document.querySelector('#right form button');
    sendButtonElement.addEventListener('click', sendInfo);

    let clearButtonElement = document.querySelector('#completed-orders button');
    clearButtonElement.addEventListener('click', clearOrders);

    function sendInfo(e){
        e.preventDefault();

        let productType = productTypeSelectElement.value;
        let description = descriptionTextAreaElement.value;
        let clientName = clientNameInputElement.value;
        let clientPhone = clientPhoneInputElement.value;

        if(description === '' || clientName === '' || clientPhone === ''){
            return;
        }

        productTypeSelectElement.value = '';
        descriptionTextAreaElement.value = '';
        clientNameInputElement.value = '';
        clientPhoneInputElement.value = '';

        let containerDivElement = document.createElement('div');
        containerDivElement.classList.add('container');
        //containerDivElement.className = 'container';

        let h2Element = document.createElement('h2');
        h2Element.textContent = `Product type for repair: ${productType}`;

        let h3Element = document.createElement('h3');
        h3Element.textContent = `Client information: ${clientName}, ${clientPhone}`;

        let h4Element = document.createElement('h4');
        h4Element.textContent = `Description of the problem: ${description}`;

        let startButton = document.createElement('button');
        startButton.classList.add('start-btn');
        //startButton.className = 'start-btn';
        startButton.textContent = 'Start repair';

        let finishButton = document.createElement('button');
        finishButton.classList.add('finish-btn');
        //finishButton.className = 'finish-btn';
        finishButton.textContent = 'Finish repair';
        finishButton.disabled = true;

        startButton.addEventListener('click', startRepair);
        finishButton.addEventListener('click', finishRepair);

        containerDivElement.appendChild(h2Element);
        containerDivElement.appendChild(h3Element);
        containerDivElement.appendChild(h4Element);
        containerDivElement.appendChild(startButton);
        containerDivElement.appendChild(finishButton);

        receivedOrdersSectionElement.appendChild(containerDivElement);
    }

    function startRepair(e){
        e.currentTarget.disabled = true;
        e.currentTarget.parentNode.querySelector('.finish-btn').disabled = false;
    }

    function finishRepair(e){
        let containerDiv = e.currentTarget.parentNode;
        e.currentTarget.remove();
        containerDiv.querySelector('.start-btn').remove();

        containerDiv.remove();
        completedOrdersSectionElement.appendChild(containerDiv);
    }

    function clearOrders(e){
        let allContainers = Array.from(e.currentTarget.parentNode.querySelectorAll('.container'));

        for (let container of allContainers) {
            container.remove();
        }
    }
}