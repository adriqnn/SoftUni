function day_of_weekV1(day){
    let week = ["Invalid day!", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"];
    return day >= 1 && day <=7 ? week[day] : week[0];
}

const day_of_weekV2 = function(day){
    let week = ["Invalid day!", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"];
    return day >= 1 && day <=7 ? week[day] : week[0];
}

const day_of_weekV3 = (day) => {
    let week = ["Invalid day!", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"];
    return day >= 1 && day <=7 ? week[day] : week[0];
}