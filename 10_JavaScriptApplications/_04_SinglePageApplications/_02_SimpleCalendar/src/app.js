import { showYear } from "./years.js";
import { showMonth } from "./months.js";
import { hideAllDaysCalendars, hideAllMonthsCalendars } from "./util.js";

function run(){
    const html = {
        yearsTableRows: document.querySelectorAll('section#years table tbody tr.days'),
        monthsTableRows: document.querySelectorAll('section.monthCalendar td.day')
    }

    hideAllMonthsCalendars();
    hideAllDaysCalendars();

    html.yearsTableRows.forEach(e => e.addEventListener('click', showYear));
    html.monthsTableRows.forEach(e => e.addEventListener('click', showMonth));
}

run();
