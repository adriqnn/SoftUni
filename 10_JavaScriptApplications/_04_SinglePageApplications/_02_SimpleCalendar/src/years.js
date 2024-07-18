import { hideAllDaysCalendars, hideAllMonthsCalendars } from "./util.js";

function showYear(e){
    hideAllMonthsCalendars();
    hideAllDaysCalendars();

    document.getElementById(`year-${e.target.textContent.trim()}`).style.display = 'block';
}

export { showYear };
