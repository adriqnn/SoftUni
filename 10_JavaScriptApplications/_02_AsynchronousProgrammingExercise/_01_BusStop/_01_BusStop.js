async function bus_stopV1() {
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

async function bus_stopV2() {
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
        try {
            const res = await fetch(`${url}${html.busStopId.value}`);

            if(!res.ok){
                throw new Error(`Error: ${res.status} ${res.statusText}`);
            }

            return await res.json();
        } catch (err) {
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

        if (obj !== 'Error') {
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
