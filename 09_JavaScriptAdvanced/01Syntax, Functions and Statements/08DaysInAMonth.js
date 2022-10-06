function lastDay(month,year){
    let date = new Date(year,month);
    date.setDate(1-1);
    let day = date.getDate();
    console.log(day);
}
lastDay(1,2012);
lastDay(2,2021);