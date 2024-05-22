function distance_converterV1(){
    let buttonConvert = document.getElementById('convert');
    buttonConvert.addEventListener('click', onClick);

    let metricUnits = {
        km: 1000,
        m: 1,
        cm: 0.01,
        mm: 0.001,
        mi: 1609.34,
        yrd: 0.9144,
        ft: 0.3048,
        in: 0.0254
    }

    function onClick(e){
        let fromValue = document.getElementById('inputUnits').value;
        let toValue = document.getElementById('outputUnits').value;

        let inputDistance = Number(document.getElementById('inputDistance').value);
        let outputDistanceElement = document.getElementById('outputDistance');

        let valueInMeters = inputDistance * metricUnits[fromValue];
        let convertedValue = valueInMeters / metricUnits[toValue];

        outputDistanceElement.value = convertedValue;
    }
}

function distance_converterV2(){
    const html = {
        button: document.getElementById('convert'),
        inputUnits: document.getElementById('inputUnits'),
        outputUnits: document.getElementById('outputUnits'),
        inputDistance: document.getElementById('inputDistance'),
        outputDistance: document.getElementById('outputDistance')
    }

    html.button.addEventListener('click', onClick);

    let metricUnits = {
        km: 1000,
        m: 1,
        cm: 0.01,
        mm: 0.001,
        mi: 1609.34,
        yrd: 0.9144,
        ft: 0.3048,
        in: 0.0254
    }

    function onClick(){
        let fromValue = html.inputUnits.value;
        let toValue = html.outputUnits.value;

        let inputDistance = Number(html.inputDistance.value);
        let outputDistanceElement = html.outputDistance;

        let valueInMeters = inputDistance * metricUnits[fromValue];
        outputDistanceElement.value = valueInMeters / metricUnits[toValue];
    }
}

function distance_converterV3(){
    const fields = {
        unitsFrom: document.getElementById("inputUnits"),
        unitsTo: document.getElementById("outputUnits"),
        inputValue: document.getElementById("inputDistance"),
        output: document.getElementById("outputDistance")
    }
    const convert = (v, to, sign) => {
        const signs = { "/": (a, b) => a / b, "*": (a, b) => a * b };

        return signs[sign](v, to);
    }

    const values = {
        km: 1,
        m: 1000,
        cm: 100000,
        mm: 1000000,
        mi: 0.621371,
        yrd: 1093.61,
        ft: 3280.84,
        in: 39370.1
    }

    document.body.addEventListener("click", e => {
        if (e.target.id === "convert") {
            const [from, to, inputValue] = [fields.unitsFrom.value, fields.unitsTo.value, Number(fields.inputValue.value)];

            fields.output.value = convert(convert(inputValue, values[from], "/"), values[to], "*");
        }
    });
}