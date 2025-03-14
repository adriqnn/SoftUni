function bus_scheduleV1(){
    const html = {
        info: document.getElementById('info'),
        busDepart: document.getElementById('depart'),
        busArrive: document.getElementById('arrive')
    }

    let nextStop;
    let currentStop = 'depot';

    async function depart(){
        html.busDepart.disabled = true;
        html.busArrive.disabled = false;

        try{
            nextStop = await getBusStop(currentStop);
        }catch(err){
            console.log(err);
        }

        html.info.textContent = `Next stop ${nextStop.name}`;
    }

    function arrive(){
        html.busDepart.disabled = false;
        html.busArrive.disabled = true;

        html.info.innerHTML = `Arriving at ${nextStop.name}`;
        currentStop = nextStop.next;
    }

    return {
        depart,
        arrive
    };

    async function getBusStop(stopName){
        try{
            let res = await fetch(`http://localhost:3030/jsonstore/bus/schedule/${stopName}`);

            if(res.status !== 200){
                throw new Error('Error');
            }

            return await res.json();
        }catch(err){
            html.info.textContent = `${err.message}`;
            html.busDepart.disabled = true;
            html.busArrive.disabled = true;
        }
    }
}

let result = bus_scheduleV1();

function bus_scheduleV2(){
    const departBtn = document.getElementById('depart');
    const arriveBtn = document.getElementById('arrive');
    const banner = document.querySelector('#info span');

    let stop = {
        next: 'depot',
        name: undefined
    };

    async function depart(){
        const url = `http://localhost:3030/jsonstore/bus/schedule/${stop.next}`;

        try{
            const response = await fetch(url);
            stop = await response.json();

            banner.textContent = `Next stop ${stop.name}`;

            departBtn.disabled = true;
            arriveBtn.disabled = false;
        }catch(err){
            console.log(err);
        }
    }

    function arrive(){
        banner.textContent = `Arriving at ${stop.name}`;

        departBtn.disabled = false;
        arriveBtn.disabled = true;
    }

    return {
        depart,
        arrive
    };
}

function bus_scheduleV3(){
    const html = {
        info: document.getElementById(`info`),
        depart: document.getElementById(`depart`),
        arrive: document.getElementById(`arrive`)
    }

    const getStop = async (name) => {
        try {
            const stop = await fetch(`http://localhost:3030/jsonstore/bus/schedule/${name}`);
            return await stop.json();
        } catch (e) {
            html.info.innerHTML = 'Error';

            html.arrive.disabled = true;
            html.depart.disabled = true;
        }
    }

    let nextStop;
    let nextStopName = 'depot';

    async function depart(){
        html.depart.disabled = true;
        html.arrive.disabled = false;

        nextStop = await getStop(nextStopName);
        html.info.innerHTML = `Next stop ${nextStop.name}`;
    }

    function arrive() {
        html.depart.disabled = false;
        html.arrive.disabled = true;

        html.info.innerHTML = `Arriving at ${nextStop.name}`;
        nextStopName = nextStop.next;
    }

    return {
        depart,
        arrive
    }
}

function bus_scheduleV4(){
    let infoElement = document.querySelector('.info');
    let departButton = document.getElementById('depart');
    let arriveButton = document.getElementById('arrive');

    let busStop = {
        next: 'depot'
    }

    function depart(){
        departButton.disabled = true;
        let url = `http://localhost:3030/jsonstore/bus/schedule/${busStop.next}`;

        fetch(url).then(response => response.json()).then(data => {
                busStop = JSON.parse(JSON.stringify(data)); // Object.assign(data) breaks the reference so we dont change the data
                infoElement.textContent = `Next stop ${busStop.name}`;
            }).catch(error => {
                infoElement.textContent = "Error";
                departButton.disabled = true;
                arriveButton.disabled = true;
            });
        
        arriveButton.disabled = false;
    }

    function arrive(){
        infoElement.textContent = `Arriving at ${busStop.name}`;
        departButton.disabled = false;
        arriveButton.disabled = true;
    }

    return {
        depart,
        arrive
    };
}
