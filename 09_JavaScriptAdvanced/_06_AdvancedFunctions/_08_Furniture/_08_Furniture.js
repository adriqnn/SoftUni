function furnitureV1(){
    const[generateBtn, buyBtn] = Array.from(document.querySelectorAll('button'));
    const[input, output] = Array.from(document.querySelectorAll('textarea'));
    const tbody = document.querySelector('tbody');
    const items = [];

    generateBtn.addEventListener('click', generate);
    buyBtn.addEventListener('click', buy);

    function generate(){
        const data = JSON.parse(input.value);

        for (let item of data) {
            const row = document.createElement('tr');
            row.appendChild(createColumn('img',item.img));// --image column
            row.appendChild(createColumn('p',item.name));// --name column
            row.appendChild(createColumn('p',item.price));// --price column
            row.appendChild(createColumn('p',item.decFactor));// --decoration column

            const c5 = document.createElement('td');
            const checkbox = document.createElement('input');

            checkbox.type = 'checkbox';
            c5.appendChild(checkbox);
            row.appendChild(c5);
            tbody.appendChild(row);

            items.push({...item, isChecked});

            function isChecked(){
                return checkbox.checked;
            }
        }
    }

    function buy(){
        let list = [];
        let total = 0;
        let decoration = 0;
        const bought = items.filter(i => i.isChecked());

        for (const item of bought) {
            list.push(item.name);
            total += Number(item.price);
            decoration += Number(item.decFactor);
        }

        decoration /= bought.length;

        output.value = [
            `Bought furniture: ${list.join(', ')}`,
            `Total price: ${total.toFixed(2)}`,
            `Average decoration factor: ${decoration}`
        ].join('\n');
    }

    function createColumn(type, content){
        const result = document.createElement('td');
        let innerElement;

        if(type === 'img'){
            innerElement = document.createElement('img');
            innerElement.src = content;
        }else{
            innerElement = document.createElement('p');
            innerElement.textContent = content;
        }

        result.appendChild(innerElement);
        return result;
    }
}