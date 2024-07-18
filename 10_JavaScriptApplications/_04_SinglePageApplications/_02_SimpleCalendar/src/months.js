import { hideAllDaysCalendars } from "./util.js";

function showMonth(e){
    hideAllDaysCalendars();

    let target = e.target;

    if(target.classList.contains('date')){
        target = target.parentElement;
    }

    const months = { Jan: 1, Feb: 2, Mar: 3, Apr: 4, May: 5, Jun: 6, Jul: 7, Aug: 8, Sept: 9, Oct: 10, Nov: 11, Dec: 12 };

    const year = target.parentElement.parentElement.parentElement.firstElementChild.textContent;
    const month = months[target.firstElementChild.textContent];

    document.getElementById(`month-${year}-${month}`).style.display = 'block';
}

export { showMonth };
