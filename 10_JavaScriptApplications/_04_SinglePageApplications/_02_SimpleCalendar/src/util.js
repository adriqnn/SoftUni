const html = {
    monthCalendars: document.querySelectorAll('section.monthCalendar'),
    dayCalendars: document.querySelectorAll('section.daysCalendar')
}

function hideAllMonthsCalendars(){
    html.monthCalendars.forEach(e => e.style.display = 'none');
}

function hideAllDaysCalendars(){
    html.dayCalendars.forEach(e => e.style.display = 'none');
}

export { hideAllMonthsCalendars, hideAllDaysCalendars };
