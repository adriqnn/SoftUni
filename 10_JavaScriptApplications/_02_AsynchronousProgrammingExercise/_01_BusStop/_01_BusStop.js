async function bus_stopV1(){
    const url = `http://localhost:3030/jsonstore/bus/businfo/`;
    const html = {
        busStopId: document.getElementById("stopId"),
        result: document.getElementById("result")
    }

    async function getBusInfoByID(){
        try{
            const res = await fetch(`${url}${html.busStopId.value}`);

            if(res.status !== 200){
                throw new Error(`Error`);
            }

            return await res.json();
        }catch(err){
            return 'Error';
        }
    }

    function addInfo(obj){
        html.result.innerHTML = "";

        const div = document.createElement('div');
        div.setAttribute('id', 'stopName');

        const ul = document.createElement('ul');
        ul.setAttribute('id', 'buses');

        if(typeof obj === 'string'){
            div.textContent = 'Error';
        }else{
            div.textContent = obj.name;
            Object.entries(obj.buses).forEach(e => {
                const li = document.createElement('li');

                li.textContent = `Bus ${e[0]} arrives in ${e[1]} minutes`;
                ul.appendChild(li);
            });
        }

        html.result.append(div, ul);
    }

    addInfo(await getBusInfoByID());
}

async function bus_stopV2(){
    const url = `http://localhost:3030/jsonstore/bus/businfo/`;
    const html = {
        busStopId: document.getElementById("stopId"),
        result: document.getElementById("result")
    }

    async function getBusInfoByID(){
        try{
            const res = await fetch(`${url}${html.busStopId.value}`);

            if(res.status !== 200){
                throw new Error(`Error`);
            }

            return res.json();
        }catch(err){
            return 'Error';
        }
    }

    function addInfo(obj){
        html.result.innerHTML = "";

        const div = document.createElement('div');
        div.setAttribute('id', 'stopName');

        const ul = document.createElement('ul');
        ul.setAttribute('id', 'buses');

        if(typeof obj === 'string'){
            div.textContent = 'Error';
        }else{
            div.textContent = obj.name;
            Object.entries(obj.buses).forEach(e => {
                const li = document.createElement('li');

                li.textContent = `Bus ${e[0]} arrives in ${e[1]} minutes`;
                ul.appendChild(li);
            });
        }

        html.result.appendChild(div);
        html.result.appendChild(ul);
    }

    addInfo(await getBusInfoByID());
}

async function bus_stopV3(){
    const url = `http://localhost:3030/jsonstore/bus/businfo/`;
    const html = {
        busStopId: document.getElementById("stopId"),
        result: document.getElementById("result")
    };

    async function getBusInfoByID(){
        try{
            const res = await fetch(`${url}${html.busStopId.value}`);

            if(!res.ok){
                throw new Error(`Error: ${res.status} ${res.statusText}`);
            }

            return await res.json();
        }catch(err){
            console.error(err);
            return 'Error';
        }
    }

    function createBusStopInfoElement(obj){
        const fragment = document.createDocumentFragment();
        const div = document.createElement('div');

        div.id = 'stopName';
        div.textContent = obj === 'Error' ? 'Error' : obj.name;
        fragment.appendChild(div);

        if(obj !== 'Error'){
            const ul = document.createElement('ul');
            ul.id = 'buses';

            Object.entries(obj.buses).forEach(([busNumber, arrivalTime]) => {
                const li = document.createElement('li');
                li.textContent = `Bus ${busNumber} arrives in ${arrivalTime} minutes`;
                ul.appendChild(li);
            });

            fragment.appendChild(ul);
        }

        return fragment;
    }

    async function updateBusStopInfo(){
        const busInfo = await getBusInfoByID();
        const busStopInfoElement = createBusStopInfoElement(busInfo);

        html.result.innerHTML = "";
        html.result.appendChild(busStopInfoElement);
    }

    await updateBusStopInfo();
}

async function bus_stopV4(){
    const input = document.getElementById('stopId');
    const id = input.value;
    const url = `http://localhost:3030/jsonstore/bus/businfo/${id}`;

    try{
        const ul = document.getElementById('buses');
        ul.innerHTML = '';
        const response = await fetch(url);
        const data = await response.json();

        document.getElementById('stopName').textContent = data.name;

        Object.entries(data.buses).map(([bus, time]) => {
            const result = document.createElement('li');
            result.textContent = `Bus ${bus} arrives in ${time} minutes`;
            ul.appendChild(result);
        });

        input.value = '';

    }catch(error){
        document.getElementById('stopName').textContent = 'Error';
    }
}

async function bus_stopV5(){
    const input = document.getElementById('stopId');
    const id = input.value;
    const url = `http://localhost:3030/jsonstore/bus/businfo/${id}`;

    try{
        const ul = document.getElementById('buses');
        ul.innerHTML = '';
        const response = await fetch(url);
        const data = await response.json();

        document.getElementById('stopName').textContent = data.name;

        Object.entries(data.buses).map(([bus, time]) => {
            const result = document.createElement('li');
            result.textContent = `Bus ${bus} arrives in ${time} minutes`;
            ul.appendChild(result);
        });

        input.value = '';

    }catch(error){
        document.getElementById('stopName').textContent = 'Error';
    }
}

async function bus_stopV6(){
    const html = {
        input: document.getElementById('stopId'),
        ul: document.getElementById('buses'),
        divStop: document.getElementById('stopName'),
    };

    const id = html.input.value;
    const url = `http://localhost:3030/jsonstore/bus/businfo/${id}`;

    try{
        html.ul.innerHTML = '';
        const response = await fetch(url);
        const data = await response.json();

        html.divStop.textContent = data.name;

        Object.entries(data.buses).map(([bus, time]) => {
            const result = document.createElement('li');
            result.textContent = `Bus ${bus} arrives in ${time} minutes`;
            html.ul.appendChild(result);
        });

        html.input.value = '';
    }catch(error){
        document.getElementById('stopName').textContent = 'Error';
        html.input.value = '';
    }
}

async function bus_stopV7(){
    const html = {
        stopName: document.getElementById(`stopName`),
        busses: document.getElementById(`buses`),
        stopID: document.getElementById(`stopId`)
    }

    html.stopName.innerHTML = '';
    html.busses.innerHTML = '';

    try{
        const data = await fetch(`http://localhost:3030/jsonstore/bus/businfo/${html.stopID.value}`);
        if(!data.ok){
            throw new Error();
        }

        const deserialized = await data.json();
        html.stopName.innerHTML = deserialized.name;

        Object.entries(deserialized.buses).forEach(([bus, time]) => {
            const e = document.createElement('li');
            e.innerHTML = `Bus ${bus} arrives in ${time}`;

            html.busses.appendChild(e);
        });
    }catch(e){
        html.stopName.innerHTML = 'Error';
    }
}

async function bus_stopV8(){
    let baseUrl = 'http://localhost:3030/jsonstore/bus/businfo';

    let inputElement = document.getElementById('stopId');
    let ulElements = document.getElementById('buses');
    let divElement = document.getElementById('stopName');

    fetch(`${baseUrl}/${inputElement.ariaValueMax}`).then(response => response.json()).then(data => {
        let buses = data.buses;
        let name = data.name;

        divElement.textContent = name;
        ulElements.innerHTML = '';

        Object.keys(buses).forEach(bus => {
            let liElement = document.createElement('li');
            liElement.textContent = `Bus ${bus} arrives in ${buses[bus]} minutes`;
            ulElements.appendChild(liElement);
        });
    }).catch(error => {
        divElement.textContent = 'Error';
    });
}
