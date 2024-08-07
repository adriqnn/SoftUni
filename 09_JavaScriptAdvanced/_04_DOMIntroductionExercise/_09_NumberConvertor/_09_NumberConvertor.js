function number_convertorV1(){
    const html = {
        numberField: document.getElementById("input"),
        convertTo: document.getElementById("selectMenuTo"),
        output: document.getElementById("result"),
        button: document.querySelector("#container > button"),
    }

    const makeOptions = arr => arr.map(x => {
            const option = document.createElement("option");
            x = x.toLocaleLowerCase();
            option.value = x;
            option.text = `${x.charAt(0).toLocaleUpperCase()}${x.slice(1)}`;

            return option;
        });
    const print = n => (html.output.value = n);
    makeOptions(["binary", "hexadecimal"]).forEach(x => html.convertTo.add(x));

    function convert(to, n) {
        n = Number(n) || 0;
        const formats = {
            binary: n => (n >>> 0).toString(2),
            hexadecimal: n => n.toString(16).toLocaleUpperCase(),
        }

        return formats[to](n);
    }

    html.button.addEventListener("click", () => print(convert(html.convertTo.value, html.numberField.value)));
}

function number_convertorV2(){
    const html = {
        numberField: document.getElementById("input"),
        convertTo: document.getElementById("selectMenuTo"),
        out: document.getElementById("result"),
        button: document.querySelector("#container > button")
    }

    const createOptions = (arr) => arr.map(x => {
        const option = document.createElement("option");
        x = x.toLocaleLowerCase();
        option.value = x;
        option.text = `${x.charAt(0).toLocaleUpperCase()}${x.slice(1)}`;

        return option;
    });

    createOptions(["BINARY", "HEXADECIMAL", "SAME"]).forEach(x => html.convertTo.add(x));

    const showAnswer = (n) => { html.out.value = n };
    const convert = (format, n) => {
        n = Number(n) || 0;

        const formats = {
            binary: (n) => (n >>> 0).toString(2),
            hexadecimal: (n) => n.toString(16).toLocaleUpperCase(),
            same: (n) => n
        }

        return formats[format](n);
    }

    html.button.addEventListener("click", () => showAnswer(convert(html.convertTo.value, html.numberField.value)));
}

function number_convertorV3(){
    const html = {
        numberField: document.getElementById("input"),
        convertTo: document.getElementById("selectMenuTo"),
        out: document.getElementById("result"),
        button: document.querySelector("#container > button")
    }

    const createOptions = (arr) => arr.map(x => {
        const option = document.createElement("option");
        x = x.toLocaleLowerCase();
        option.value = x;
        option.text = `${x.charAt(0).toLocaleUpperCase()}${x.slice(1)}`;

        return option;
    });

    createOptions(["BINARY", "HEXADECIMAL", "SAME"]).forEach(x => html.convertTo.add(x));

    const showAnswer = (n) => { html.out.value = n };
    const convert = () => {
        const format = html.convertTo.value;
        const n = Number(html.numberField.value) || 0;

        const formats = {
            binary: (n) => (n >>> 0).toString(2),
            hexadecimal: (n) => n.toString(16).toLocaleUpperCase(),
            same: (n) => n
        }

        showAnswer(formats[format](n));

    }

    html.button.addEventListener("click", convert);
}

function number_convertorV3(){
    const html = {
        numberField: document.getElementById("input"),
        convertTo: document.getElementById("selectMenuTo"),
        out: document.getElementById("result"),
        button: document.querySelector("#container > button")
    }

    const createOptions = (arr) => arr.map(x => {
        const option = document.createElement("option");
        x = x.toLocaleLowerCase();
        option.value = x;
        option.text = `${x.charAt(0).toLocaleUpperCase()}${x.slice(1)}`;

        return option;
    });

    createOptions(["BINARY", "HEXADECIMAL", "SAME"]).forEach(x => html.convertTo.add(x));

    const showAnswer = (n) => { html.out.value = n };
    const convert = () => {
        const format = html.convertTo.value;
        const n = Number(html.numberField.value) || 0;

        const formats = {
            binary: (n) => (n >>> 0).toString(2),
            hexadecimal: (n) => {
                if (n < 0) {
                    n = 0xFFFFFFFF + n + 1;
                }
                
                return n.toString(16).toUpperCase();
            },
            same: (n) => n
        }

        showAnswer(formats[format](n));

    }

    html.button.addEventListener("click", convert);
}
