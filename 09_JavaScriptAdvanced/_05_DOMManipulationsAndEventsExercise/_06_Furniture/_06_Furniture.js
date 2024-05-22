function furnitureV1(){
    let [generateBtn, buyBtn] = Array.from(document.querySelectorAll('button'));
    generateBtn.addEventListener('click', generate);
    buyBtn.addEventListener('click', buy);

    function generate(e) {
        let input = JSON.parse(document.querySelector('textarea').value);

        input.forEach(x => {
            let tr = document.createElement('tr');
            let td1 = document.createElement('td');
            let img = document.createElement('img');

            img.src = x.img;
            td1.appendChild(img);
            tr.appendChild(td1);

            let td2 = document.createElement('td');
            let p = document.createElement('p');

            p.textContent = x.name;
            td2.appendChild(p);
            tr.appendChild(td2);

            let td3 = document.createElement('td');
            let p2 = document.createElement('p');

            p2.textContent = Number(x.price);
            td3.appendChild(p2);
            tr.appendChild(td3);

            let td4 = document.createElement('td');
            let p3 = document.createElement('p');

            p3.textContent = Number(x.decFactor);
            td4.appendChild(p3);
            tr.appendChild(td4);

            let td5 = document.createElement('td');
            let input = document.createElement('input');

            input.type = 'checkbox';
            td5.appendChild(input);
            tr.appendChild(td5);

            document.querySelector('tbody').appendChild(tr);
        });
    }

    function buy(e) {
        let checkboxes = Array.from(document.querySelectorAll('tbody input')).filter(c => c.checked);
        let bought = [];
        let price = 0;
        let decoration = 0;

        checkboxes.forEach(x => {
            let parent = x.parentElement.parentElement;
            let data = Array.from(parent.querySelectorAll('p'));

            bought.push(data[0].textContent);
            price += Number(data[1].textContent);
            decoration += Number(data[2].textContent);
        });

        let output = document.querySelectorAll('textarea')[1];

        output.textContent += `Bought furniture: ${bought.join(', ')}\r\n`;
        output.textContent += `Total price: ${price.toFixed(2)}\r\n`;
        output.textContent += `Average decoration factor: ${decoration / checkboxes.length}`;
    }
}

function furnitureV2(){
    const html = {
        generateBtn: Array.from(document.querySelectorAll('button'))[0],
        buyBtn: Array.from(document.querySelectorAll('button'))[1],
        input: document.querySelectorAll('textarea')[0],
        body: document.querySelector('tbody'),
        output: document.querySelectorAll('textarea')[1]
    }

    html.generateBtn.addEventListener('click', generate);
    html.buyBtn.addEventListener('click', buy);

    function generate(){
        let input = JSON.parse(html.input.value);

        input.forEach(e => {
            let tr = document.createElement('tr');
            let td1 = document.createElement('td');
            let img = document.createElement('img');

            img.src = e.img;
            td1.appendChild(img);
            tr.appendChild(td1);

            let td2 = document.createElement('td');
            let p = document.createElement('p');

            p.textContent = e.name;
            td2.appendChild(p);
            tr.appendChild(td2);

            let td3 = document.createElement('td');
            let p2 = document.createElement('p');

            p2.textContent = Number(e.price);
            td3.appendChild(p2);
            tr.appendChild(td3);

            let td4 = document.createElement('td');
            let p3 = document.createElement('p');

            p3.textContent = Number(e.decFactor);
            td4.appendChild(p3);
            tr.appendChild(td4);

            let td5 = document.createElement('td');
            let input = document.createElement('input');

            input.type = 'checkbox';
            td5.appendChild(input);
            tr.appendChild(td5);

            html.body.appendChild(tr);
        });
    }

    function buy(){
        let checkboxes = Array.from(document.querySelectorAll('tbody input')).filter(c => c.checked);
        let bought = [];
        let price = 0;
        let decoration = 0;

        checkboxes.forEach(e => {
            let parent = e.parentElement.parentElement;
            let data = Array.from(parent.querySelectorAll('p'));

            bought.push(data[0].textContent);
            price += Number(data[1].textContent);
            decoration += Number(data[2].textContent);
        });

        let output = html.output;

        output.textContent += `Bought furniture: ${bought.join(', ')}\r\n`;
        output.textContent += `Total price: ${price.toFixed(2)}\r\n`;
        output.textContent += `Average decoration factor: ${decoration / checkboxes.length}`;
    }
}

function furnitureV3(){
    const [generateBtn, buyBtn] = document.getElementsByTagName("button");
    const [generateInput, buyOutput] = document.getElementsByTagName("textarea");
    const tableBody = document.querySelector("tbody");

    const htmlTemplate = ({ img, name, price, decFactor }) => {
        const row = document.createElement("tr");

        row.innerHTML = `<td><img src=${img}></td>
                         <td><p>${name}</p></td>
                         <td><p>${price}</p></td>
                         <td><p>${decFactor}</p></td>
                         <td><input type="checkbox"/></td>`

        return row;
    }

    const generate = () => JSON.parse(generateInput.value).forEach(x => tableBody.appendChild(htmlTemplate(x)));

    const buy = () => {
        const data = Array.from(tableBody.querySelectorAll("input[type=checkbox]:checked")).map(x => Array.from(x.parentNode.parentNode.children).slice(1, 4).map(x => Number(x.children[0].innerHTML) || x.children[0].innerHTML));
        const getSum = arr => arr.reduce((a, v) => a + v, 0);

        const names = data.map(x => x[0]).join(", ");
        const prices = getSum(data.map(x => x[1]));
        const avFactors = getSum(data.map(x => x[2])) / data.length;

        buyOutput.value = `Bought furniture: ${names}\nTotal price: ${prices.toFixed(2)}\nAverage decoration factor: ${avFactors}`;
    }

    generateBtn.addEventListener("click", generate);
    buyBtn.addEventListener("click", buy);
}