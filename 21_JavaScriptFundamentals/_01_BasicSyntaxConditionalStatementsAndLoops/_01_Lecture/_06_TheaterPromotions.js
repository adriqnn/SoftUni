function theater_promotionV1(day, age){
    let msg = "";

    if(day === "Weekday" && age >= 0 && age <= 122){
        if(age <= 18){
            msg = "12$";
        }else if(age >= 19 && age <= 64){
            msg = "18$";
        }else{
            msg = "12$";
        }
    }else if(day === "Weekend" && age >= 0 && age <= 122){
        if(age <= 18){
            msg = "15$";
        }else if(age >= 19 && age <= 64){
            msg = "20$";
        }else{
            msg = "15$";
        }
    }else if(day === "Holiday" && age >= 0 && age <= 122){
        if(age <= 18){
            msg = "5$";
        }else if(age >= 19 && age <= 64){
            msg = "12$";
        }else{
            msg = "10$";
        }
    }else{
        msg = "Error!";
    }

    console.log(msg);
}

const theater_promotionV2 = function(day, age){
    let msg = "";

    if(day === "Weekday" && age >= 0 && age <= 122){
        if(age <= 18){
            msg = "12$";
        }else if(age >= 19 && age <= 64){
            msg = "18$";
        }else{
            msg = "12$";
        }
    }else if(day === "Weekend" && age >= 0 && age <= 122){
        if(age <= 18){
            msg = "15$";
        }else if(age >= 19 && age <= 64){
            msg = "20$";
        }else{
            msg = "15$";
        }
    }else if(day === "Holiday" && age >= 0 && age <= 122){
        if(age <= 18){
            msg = "5$";
        }else if(age >= 19 && age <= 64){
            msg = "12$";
        }else{
            msg = "10$";
        }
    }else{
        msg = "Error!";
    }

    console.log(msg);
}

const theater_promotionV3 = (day, age) => {
    let msg = "";

    if(day === "Weekday" && age >= 0 && age <= 122){
        if(age <= 18){
            msg = "12$";
        }else if(age >= 19 && age <= 64){
            msg = "18$";
        }else{
            msg = "12$";
        }
    }else if(day === "Weekend" && age >= 0 && age <= 122){
        if(age <= 18){
            msg = "15$";
        }else if(age >= 19 && age <= 64){
            msg = "20$";
        }else{
            msg = "15$";
        }
    }else if(day === "Holiday" && age >= 0 && age <= 122){
        if(age <= 18){
            msg = "5$";
        }else if(age >= 19 && age <= 64){
            msg = "12$";
        }else{
            msg = "10$";
        }
    }else{
        msg = "Error!";
    }

    console.log(msg);
}
