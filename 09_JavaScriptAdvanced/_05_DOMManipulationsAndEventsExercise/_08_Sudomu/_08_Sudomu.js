function sudomuV1(){
    const html = {
        row: r => document.querySelector(`#exercise > table > tbody > tr:nth-child(${r})`).querySelectorAll("td > input"),
        outputDiv: document.querySelector("#check p"),
        table: document.querySelector("#exercise > table"),
        inputs: document.getElementsByTagName("input")
    }

    const getDataMatrix = () => {
        const cell = [];

        for (let i = 0; i < 3; i++) {
            const values = Array.from(html.row(i + 1)).map(x => Number(x.value) || 0);
            cell.push(values);
        }

        return cell;
    }

    const isValid = m => {

        const checkRepeatingOccurrences = arr => arr.some((x, i) => arr.slice(i + 1).some(y => y === x));

        for (let i = 0; i < m[0].length; i++) {
            let column = [];

            for (let j = 0; j < m.length; j++) {
                column.push(m[j][i]);
            }

            if (checkRepeatingOccurrences(m[i]) || checkRepeatingOccurrences(column)){
                return false;
            }

            column = [];
        }

        return true;
    }

    document.addEventListener("click", e => {
        if (e.target.tagName === "BUTTON") {

            const changeOutput = (b = "", m = "", c = "") => {
                html.table.style.border = b;
                html.outputDiv.innerHTML = m;
                html.outputDiv.style.color = c;
            }

            if (e.target.innerHTML.includes("Check")) {
                isValid(getDataMatrix()) ? changeOutput("2px solid green", "You solve it! Congratulations!", "green") : changeOutput("2px solid red", "NOP! You are not done yet...", "red");
            } else {
                changeOutput();
                Array.from(html.inputs).map(x => (x.value = ""));
            }
        }
    });
}

function sudomuV2(){
    const html = {
        check: document.querySelectorAll('button')[0],
        clear: document.querySelectorAll('button')[1],
        rows: document.querySelectorAll('tbody tr'),
        out: document.querySelector('#check p'),
        inputs: Array.from(document.getElementsByTagName('input'))
    }

    html.clear.addEventListener('click', clearFields);
    html.check.addEventListener('click', check);

    function clearFields(){
        html.inputs.forEach(e => e.value = "");
    }

    function check(){
        let set = new Set;
        let count = 0;

        html.inputs.forEach(e => {
            count++;

            if(e.value.toString() !== ""){
                set.add(e.value);
            }
        });

        set.size === count ? changeStyle(html.out, "2px solid green", "You solve it! Congratulations!", "green") : changeStyle(html.out, "2px solid red","NOP! You are not done yet...", "red");

        function changeStyle(el, border, text, color){
            el.style.border = border;
            el.textContent = text;
            el.style.color = color;
        }
    }
}
