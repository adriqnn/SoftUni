function forecasterV1(){
    const html = {
        location: document.getElementById('location'),
        button: document.getElementById('submit'),
        forecast: document.getElementById('forecast'),
        current: document.getElementById('current'),
        upcoming: document.getElementById('upcoming'),
        labelCurrent: document.querySelector('#current .label'),
        labelUpcoming: document.querySelector('#upcoming .label')
    }

    html.button.addEventListener('click', getWeather);

    const url = `http://localhost:3030/jsonstore/forecaster`;
    const codes = { 'new york': 'ny', 'london': 'london', 'barcelona': 'barcelona' };
    const weatherIcons = { "Sunny": "&#x2600", "Partly sunny": "&#x26C5", "Overcast": "&#x2601", "Rain": "&#x2614", "Degrees": "&#176" };

    async function getWeather(){
        html.forecast.style.display = 'block';
        html.forecast.innerHTML = "";

        try{
            if(!codes.hasOwnProperty(html.location.value.toLowerCase())){
                throw new Error('Error');
            }

            await displayCurrentWeather(codes[html.location.value.toLowerCase()]);
            await displayUpcomingWeather(codes[html.location.value.toLowerCase()]);
        }catch(err){
            html.current.innerHTML = "";
            html.current.appendChild(html.labelCurrent);
            html.forecast.appendChild(html.current);
            html.labelCurrent.textContent = err.message;
        }
    }

    async function displayCurrentWeather(code){
        let res = await fetch(`${url}/today/${code}`);
        let data = await res.json();

        let divContainer = createCurrentContainer(data);

        html.current.innerHTML = "";
        html.current.appendChild(html.labelCurrent);
        html.labelCurrent.textContent = "Current conditions";
        html.current.appendChild(divContainer);
        html.forecast.appendChild(html.current);
    }

    async function displayUpcomingWeather(code){
        let res = await fetch(`${url}/upcoming/${code}`);
        let data = await res.json();

        let divContainer = createUpcomingContainer(data);

        html.upcoming.innerHTML = "";
        html.upcoming.appendChild(html.labelUpcoming);
        html.labelUpcoming.textContent = 'Three-day forecast';
        html.upcoming.appendChild(divContainer);
        html.forecast.appendChild(html.upcoming);
    }

    function createCurrentContainer(data){
        let divContainer = document.createElement('div');
        divContainer.classList.add('forecasts');

        let spanCondition = document.createElement('span');
        spanCondition.classList.add('condition', 'symbol');
        spanCondition.innerHTML = weatherIcons[data.forecast.condition];

        let spanConditionContainer = document.createElement('span');
        spanConditionContainer.className = 'condition';

        let spanName = document.createElement('span');
        spanName.className = 'forecast-data';
        spanName.textContent = data.name;

        let spanDegrees = document.createElement('span');
        spanDegrees.className = 'forecast-data';
        spanDegrees.innerHTML = `${data.forecast.low}${weatherIcons.Degrees}/${data.forecast.high}${weatherIcons.Degrees}`;

        let spanInnerCondition = document.createElement('span');
        spanInnerCondition.className = 'forecast-data';
        spanInnerCondition.textContent = data.forecast.condition;

        spanConditionContainer.append(spanName, spanDegrees, spanInnerCondition);
        divContainer.append(spanCondition, spanConditionContainer);

        return divContainer;
    }

    function createUpcomingContainer(data){
        let divContainer = document.createElement('div');
        divContainer.classList.add('forecast-info');

        data.forecast.forEach(e => {
            let spanContainer = document.createElement('upcoming');
            spanContainer.className = 'upcoming';

            let spanOne = document.createElement('span');
            spanOne.className = 'symbol';
            spanOne.innerHTML = weatherIcons[e.condition];

            let spanTwo = document.createElement('span');
            spanTwo.className = 'forecast-data';
            spanTwo.innerHTML = `${e.low}${weatherIcons.Degrees}/${e.high}${weatherIcons.Degrees}`;

            let spanThree = document.createElement('span');
            spanThree.className = 'forecast-data';
            spanThree.textContent = e.condition;

            spanContainer.append(spanOne, spanTwo, spanThree);
            divContainer.appendChild(spanContainer);
        })

        return divContainer;
    }
}

forecasterV1();

function forecasterV2(){
    document.getElementById('submit').addEventListener('click', getWeather);

    async function getWeather(){
        const availableDivCurrent = document.querySelector('.forecasts');
        const availableDivUpcoming = document.querySelector('.forecast-info');

        if (availableDivCurrent){
            availableDivCurrent.remove();
        }

        if (availableDivUpcoming){
            availableDivUpcoming.remove();
        }

        const input= document.getElementById('location');

        const cityName = input.value;
        let code = '';

        try{
            code = await getCode(cityName);
        }catch(error){
            alert('Error');
            document.querySelector('#upcoming').style.display = 'block';
            document.getElementById('current').style.display = 'block';
            input.value = '';
        }

        const [current, upcoming] = await Promise.all([getCurrent(code), getUpcoming(code)]);

        let symbol = '&#x2600;';
        if(current.forecast.condition === 'Partly sunny'){
            symbol = '&#x26C5;';
        }else if(current.forecast.condition === 'Overcast'){
            symbol = '&#x2601;';
        }else if(current.forecast.condition === 'Rain'){
            symbol = '&#x2614;';
        }

        document.querySelector('#forecast').style.display = 'block';

        const divForecasts= createEl('div', 'forecasts');
        const spanSymbol= createEl('span', 'condition symbol', symbol);
        const spanCondition= createEl('span', 'condition');

        const spanFirstData= createEl('span', 'forecast-data', current.name);
        const spanSecondData= createEl('span', 'forecast-data', `${current.forecast.low}&#176;/${current.forecast.high}&#176;`);
        const spanThirdData= createEl('span', 'forecast-data', current.forecast.condition);

        divForecasts.appendChild(spanSymbol);
        divForecasts.appendChild(spanCondition);
        spanCondition.appendChild(spanFirstData);
        spanCondition.appendChild(spanSecondData);
        spanCondition.appendChild(spanThirdData);

        document.querySelector('#current').appendChild(divForecasts);

        const divForecastUpcoming= createEl('div', 'forecast-info');
        document.querySelector('#upcoming').appendChild(divForecastUpcoming);

        upcoming.forecast.map(d => {
            let symbol = '&#x2600;';

            if(d.condition === 'Partly sunny'){
                symbol = '&#x26C5;';
            }else if(d.condition === 'Overcast'){
                symbol = '&#x2601;';
            }else if(d.condition === 'Rain'){
                symbol = '&#x2614;';
            }

            const spanUpcoming= createEl('span', 'upcoming');
            const spanSymbol= createEl('span', 'symbol', symbol);
            const spanFirstData= createEl('span', 'forecast-data', `${d.low}&#176;/${d.high}&#176;`);
            const spanSecondData= createEl('span', 'forecast-data', d.condition);

            divForecastUpcoming.appendChild(spanUpcoming);
            spanUpcoming.appendChild(spanSymbol);
            spanUpcoming.appendChild(spanFirstData);
            spanUpcoming.appendChild(spanSecondData);

            input.value = '';
        });
    }

    function createEl(type, className, text){
        const el = document.createElement(type);
        if(className){
            el.className = className;
        }

        if (text){
            el.innerHTML = text;
        }

        return el;
    }

    async function getCode(cityName){
        const url = 'http://localhost:3030/jsonstore/forecaster/locations';
        const response = await fetch(url);
        const data = await response.json();

        return data.find(x => x.name.toLowerCase() === cityName.toLowerCase()).code;
    }

    async function getCurrent(code){
        const url = `http://localhost:3030/jsonstore/forecaster/today/${code}`;
        const response = await fetch(url);
        const data = await response.json();

        return data;
    }

    async function getUpcoming(code){
        const url = `http://localhost:3030/jsonstore/forecaster/upcoming/${code}`;
        const response = await fetch(url);
        const data = await response.json();

        return data;
    }
}

function forecasterV3(){
    const inputField = document.getElementById('location');
    document.getElementById('submit').addEventListener('click', () => displayData(inputField.value));

    const getData = async (uri) => {
        const data = await fetch(`http://localhost:3030/jsonstore/forecaster/${uri}`);

        if(!data.ok) {
            throw new Error();
        }

        const deserialized = data.json();

        if(!deserialized) {
            throw new Error();
        }

        return deserialized;
    }

    const getCode = (arr, n) => {
        const location = arr.find(x => x.name === n);

        if (location === undefined) {
            throw new Error();
        }

        return location.code;
    }

    const symbols = {
        'Sunny': '&#x2600;',
        'Partly sunny': '&#x26C5;',
        'Overcast': '&#x2601;',
        'Rain': '&#x2614;',
        'Degrees': '&#176;'
    }

    function tomorrowTemplate({ forecast, name }){
        const wrapper = document.createElement('div');
        wrapper.className = 'forecasts';

        wrapper.innerHTML = `<span class="condition symbol">${
            symbols[forecast.condition]}</span><span class="condition"><span class="forecast-data">${
            name}</span><span class="forecast-data">${
            forecast.low}&#176;/${forecast.high}&#176;</span><span class="forecast-data">${
            forecast.condition}</span></span>`;

        return wrapper;
    }

    function dayTemplate({ condition, high, low }){
        const wrapper = document.createElement('span');
        wrapper.className = 'upcoming';

        wrapper.innerHTML = `<span class="symbol">${
            symbols[condition]}</span><span class="forecast-data">${
            low}&#176;/${high}&#176;</span><span class="forecast-data">${condition}</span>`;

        return wrapper;
    }

    const outputVisibility = (display) => document.getElementById('forecast').style.display = display;

    const clearSections = () => {
        document.getElementById('current').innerHTML = `<div class="label">Current conditions</div>`;
        document.getElementById('upcoming').innerHTML = `<div class="label">Three-day forecast</div>`;
    }

    async function displayData (name){
        const html = {
            tmrwOutput: document.getElementById(`current`),
            threeDayOutput: document.getElementById(`upcoming`),
            forecastMain: document.getElementById('forecast')
        }

        outputVisibility('block');
        clearSections();

        try{
            const initialNfo = await getData('locations');
            const code = getCode(initialNfo, name);
            const tomorrowNfo = await getData(`today/${code}`);
            const threeDayNfo = await getData(`upcoming/${code}`);

            html.tmrwOutput.appendChild(tomorrowTemplate(tomorrowNfo));

            Object.values(threeDayNfo.forecast).forEach(x => html.threeDayOutput.appendChild(dayTemplate(x)));

        }catch(err){
            html.tmrwOutput.appendChild(document.createTextNode('Error'));
        }
    }
}

function forecasterV4(){
    const html = {
        location: document.getElementById('location'),
        button: document.getElementById('submit'),
        forecast: document.getElementById('forecast')
    }

    html.button.addEventListener('click', getWeather);

    const url = `http://localhost:3030/jsonstore/forecaster`;
    const codes = { 'new york': 'ny', 'london': 'london', 'barcelona': 'barcelona' };
    const weatherIcons = { "Sunny": "&#x2600", "Partly sunny": "&#x26C5", "Overcast": "&#x2601", "Rain": "&#x2614", "Degrees": "&#176" };

    async function getWeather(){
        html.forecast.style.display = 'block';
        html.forecast.innerHTML = "";

        try{
            if(!codes.hasOwnProperty(html.location.value.toLowerCase())){
                throw new Error('Error');
            }

            let c = await displayWeatherInfo(codes[html.location.value.toLowerCase()], 'today');
            let u = await displayWeatherInfo(codes[html.location.value.toLowerCase()], 'upcoming');

            html.forecast.innerHTML =  c + u;
        }catch(err){
            html.forecast.innerHTML = `<div id="current"><div class="label">${err.message}</div></div>`;
        }
    }

    async function displayWeatherInfo(code, req){
        let res = await fetch(`${url}/${req}/${code}`);
        let data = await res.json();

        return req === 'today' ? createCurrentDiv(data) : createUpcomingContainer(data);
    }

    function createCurrentDiv(data){
        return `<div id="current">
                    <div class="label">Current conditions</div>
                    <div class="forecasts">
                        <span class="condition symbol">${weatherIcons[data.forecast.condition]}</span>
                        <span class="condition">
                            <span class="forecast-data">${data.name}</span>
                            <span class="forecast-data">${data.forecast.low}${weatherIcons.Degrees}/${data.forecast.high}${weatherIcons.Degrees}</span>
                            <span class="forecast-data">${data.forecast.condition}</span>
                        </span>
                    </div>
                </div>`;
    }

    function createUpcomingContainer(data){
        let upcoming = data.forecast.map(e => {
            return eWeather = `<upcoming class="upcoming">
                                        <span class="symbol">${weatherIcons[e.condition]}</span>
                                        <span class="forecast-data">${e.low}${weatherIcons.Degrees}/${e.high}${weatherIcons.Degrees}</span>
                                        <span class="forecast-data">${e.condition}</span>
                                    </upcoming>`;
        }).join("");

        return `<div id="upcoming">
                    <div class="label">Three-day forecast</div>
                        ${upcoming}
                    </div>
                </div>`;
    }
}
