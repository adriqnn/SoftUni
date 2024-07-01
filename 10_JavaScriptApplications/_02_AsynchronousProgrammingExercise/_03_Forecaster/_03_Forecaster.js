function forecasterV1(){
    const html = {
        location: document.getElementById('location'),
        button: document.getElementById('submit'),
        forecast: document.getElementById('forecast'),
        current: document.getElementById('current'),
        upcoming: document.getElementById('upcoming'),
        labelCurrent: document.querySelector('#current .label'),
        labelUpcoming: document.querySelector('#upcoming .label'),
    }

    html.button.addEventListener('click', getWeather);

    const url = `http://localhost:3030/jsonstore/forecaster`;
    const codes = { 'new york': 'ny', 'london': 'london', 'barcelona': 'barcelona' };
    const weatherIcons = { "Sunny": "&#x2600", "Partly sunny": "&#x26C5", "Overcast": "&#x2601", "Rain": "&#x2614", "Degrees": "&#176" };

    async function getWeather(){
        try{
            if(!codes.hasOwnProperty(html.location.value.toLowerCase())){
                throw new Error('Error');
            }

            await displayCurrentWeather(codes[html.location.value.toLowerCase()]);
            await displayUpcomingWeather(codes[html.location.value.toLowerCase()]);

            html.forecast.style.display = 'block';
        }catch(err){
            html.forecast.style.display = 'block';
            html.forecast.innerHTML = "";

            html.labelCurrent.textContent = err.message;
            html.forecast.appendChild(html.current);
        }
    }

    async function displayCurrentWeather(code){
        let res = await fetch(`${url}/today/${codes[code]}`);
        let data = await res.json();

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

        html.forecast.innerHTML = "";
        html.labelCurrent.textContent = 'Current conditions';
        html.current.append(html.labelCurrent, divContainer);
        html.forecast.append(html.current);
    }

    async function displayUpcomingWeather(code){
        html.upcoming.innerHTML = "";
        html.upcoming.appendChild(html.labelCurrent);
        html.labelUpcoming.textContent = 'Three-day forecast';

        let res = await fetch(`${url}/upcoming/${codes[code]}`);
        let data = await res.json();

        console.log(data);
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
