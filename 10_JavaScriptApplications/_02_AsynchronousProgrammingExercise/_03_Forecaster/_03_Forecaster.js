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