function lastDay(month,year){
    let date = new Date(year,month);
    date.setDate(1-1);
    let day = date.getDate();
    console.log(day);
}