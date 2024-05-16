function hells_kitchenV1(){
    document.querySelector('#btnSend').addEventListener('click', onClick);

    function onClick(){
        let input = JSON.parse(document.querySelector('#inputs textarea').value);
        let avgSalary = 0;
        let totalSalary = 0;
        let currAvgSalary = 0;
        let bestName = '';
        let output = {};

        for (let inputElement of input) {
            let restaurantInfo = inputElement.split(' - ');
            let restaurantName = restaurantInfo.shift();
            let workersData = restaurantInfo[0].split(', ');

            for (let worker of workersData) {
                let[name, salary] = worker.split(' ');
                if(!output.hasOwnProperty(restaurantName)){
                    output[restaurantName] = {};
                }

                if(output.hasOwnProperty(restaurantName)){
                    output[restaurantName][name] = Number(salary);
                }
            }
        }

        let entries = Object.entries(output);

        for (let entry of entries) {
            let key = entry[0];
            let values = Object.entries(entry[1]);

            for(let [name,salary] of values){
                totalSalary += salary;
            }

            avgSalary = totalSalary / values.length;

            if(avgSalary > currAvgSalary){
                currAvgSalary = avgSalary;
                bestName = key;
                totalSalary = 0;
            }
        }

        let result = Object.entries(output[bestName]).sort((a,b) => b[1] - a[1]);
        let print = '';

        result.forEach(w => print += `Name: ${w[0]} With Salary: ${w[1]} `);

        document.querySelector('#bestRestaurant p').textContent = `Name: ${bestName} Average Salary: ${currAvgSalary.toFixed(2)} Best Salary: ${result[0][1].toFixed(2)}`;
        document.querySelector('#workers p').textContent = print;
    }
}

function hells_kitchenV2() {
    const html = {
        inputField: document.querySelector("#inputs textarea"),
        outputBestName: document.querySelector("#bestRestaurant p"),
        outputBestWorkers: document.querySelector("#workers p"),
    }

    const getBest = data => Object.entries(data).sort((x, y) => getAverage(y[1]) - getAverage(x[1]))[0];

    const getAverage = workersData => workersData.reduce((a, v) => a + v[1], 0) / workersData.length;

    function deserialize(data) {
        const getWorkers = data => data.split(", ").map(x => x.split(" ").map(y => (isNaN(y) ? y : Number(y))));

        return JSON.parse(data).map(x => x.split(" - "))
            .reduce((a, v) => {
                const [name, workers] = v;
                a[name] = a[name] ? [...a[name], ...getWorkers(workers)] : getWorkers(workers);

                return a;
            }, {});
    }

    function displayResult(data) {
        let [name, workers] = data;
        workers = workers.sort((x, y) => y[1] - x[1]);

        html.outputBestName.innerHTML = `Name: ${name} Average Salary: ${getAverage(workers).toFixed(2)} Best Salary: ${workers[0][1].toFixed(2)}`;
        html.outputBestWorkers.innerHTML = `${workers.map(x => `Name: ${x[0]} With Salary: ${x[1]}`).join(" ")}`;
    }

    document.getElementById("btnSend").addEventListener("click", () => displayResult(getBest(deserialize(html.inputField.value))));
}