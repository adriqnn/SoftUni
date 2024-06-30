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

        nextStop = await getBusStop(currentStop);
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
        name: undefined,
    };

    async function depart(){
        const url = `http://localhost:3030/jsonstore/bus/schedule/${stop.next}`;
        const response = await fetch(url);
        const data = await response.json();

        stop = data;

        banner.textContent = `Next stop ${stop.name}`;

        departBtn.disabled = true;
        arriveBtn.disabled = false;
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
