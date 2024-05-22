function time_converterV1(){
    let daysBtn = document.getElementById('daysBtn');
    let hoursBtn = document.getElementById('hoursBtn');
    let minutesBtn = document.getElementById('minutesBtn');
    let secondsBtn = document.getElementById('secondsBtn');

    let days = document.getElementById('days');
    let hours = document.getElementById('hours');
    let minutes = document.getElementById('minutes');
    let seconds = document.getElementById('seconds');

    let rations = {
        days: 1,
        hours: 24,
        minutes: 1440,
        seconds: 86400
    }

    daysBtn.addEventListener('click', onConvert);
    hoursBtn.addEventListener('click', onConvert);
    minutesBtn.addEventListener('click', onConvert);
    secondsBtn.addEventListener('click', onConvert);

    function convert(value, unit){
        let days = value / rations[unit];
        return{
            days: days,
            hours: days * rations.hours,
            minutes: days * rations.minutes,
            seconds: days * rations.seconds
        }
    }

    function onConvert(event){
        let input = event.target.parentElement.querySelector('input[type="text"]');
        let time = convert(Number(input.value), input.id);

        days.value = time.days;
        hours.value = time.hours;
        minutes.value = time.minutes;
        seconds.value = time.seconds;
    }
}

function time_converterV2(){
    const html = {
        daysBtn: document.getElementById('daysBtn'),
        hoursBtn: document.getElementById('hoursBtn'),
        minutesBtn: document.getElementById('minutesBtn'),
        secondsBtn: document.getElementById('secondsBtn'),

        days: document.getElementById('days'),
        hours: document.getElementById('hours'),
        minutes: document.getElementById('minutes'),
        seconds: document.getElementById('seconds')
    }

    let rations = {
        days: 1,
        hours: 24,
        minutes: 1440,
        seconds: 86400
    }

    html.daysBtn.addEventListener('click', onConvert);
    html.hoursBtn.addEventListener('click', onConvert);
    html.minutesBtn.addEventListener('click', onConvert);
    html.secondsBtn.addEventListener('click', onConvert);

    function convert(value, unit){
        let days = value / rations[unit];

        return {
            days: days,
            hours: days * rations.hours,
            minutes: days * rations.minutes,
            seconds: days * rations.seconds
        };
    }

    function onConvert(event){
        let input = event.target.parentElement.querySelector('input[type="text"]');
        let time = convert(Number(input.value), input.id);

        html.days.value = time.days;
        html.hours.value = time.hours;
        html.minutes.value = time.minutes;
        html.seconds.value = time.seconds;
    }
}

function time_converterV3(){
    const htmlData = {
        buttons: Array.from(document.querySelectorAll("input[type='button']")),
        fields: Array.from(document.querySelectorAll("input[type='text']"))
    }

    const fillObj = (seconds, minutes, hours, days) => ({seconds, minutes, hours, days,});
    const types = {
        seconds: v => fillObj(v, v / 60, v / 3600, v / 86400),
        minutes: v => fillObj(v * 60, v, v / 60, v / 1440),
        hours: v => fillObj(v * 3600, v * 60, v, v / 24),
        days: v => fillObj(v * 86400, v * 1440, v * 24, v)
    }

    htmlData.buttons.forEach(x => x.addEventListener("click", () => {
        const [typeOfUnits, value] = [x.previousElementSibling.id, x.previousElementSibling.value];
        const data = types[typeOfUnits](value);

        htmlData.fields.map(y => (y.value = data[y.id]));
    }));
}