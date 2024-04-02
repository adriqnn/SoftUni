function next_dayV1(year, month, day){
    let date = new Date(year, month - 1, day);
    date.setDate(date.getDate() + 1);

    return `${date.getFullYear()}-${date.getMonth() + 1}-${date.getDate()}`;
}

const next_dayV2 = function(year, month, day){
    let date = new Date(year, month - 1, day);
    date.setDate(date.getDate() + 1);

    return `${date.getFullYear()}-${date.getMonth() + 1}-${date.getDate()}`;
}

const next_dayV3 = (year, month, day) => {
    let date = new Date(year, month - 1, day);
    date.setDate(date.getDate() + 1);

    return `${date.getFullYear()}-${date.getMonth() + 1}-${date.getDate()}`;
}

// console.log(next_dayV1(2016, 9, 30));
// console.log(next_dayV1(2020, 3, 25));
