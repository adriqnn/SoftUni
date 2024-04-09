function format_gradeV1(grade){
    let result;

    if(grade < 3){
        result = "Fail";
        grade = 2;
    }else if(grade >= 3 && grade < 3.5){
        result = "Poor";
    }else if(grade >= 3.5 && grade < 4.5){
        result = "Good";
    }else if(grade >= 4.5 && grade < 5.5){
        result = "Very good";
    }else{
        result = "Excellent"
    }

    return result === "Fail" ? `${result} (${grade})` : `${result} (${grade.toFixed(2)})`;
}

const format_gradeV2 = function(grade){
    let result;

    if(grade < 3){
        result = "Fail";
        grade = 2;
    }else if(grade >= 3 && grade < 3.5){
        result = "Poor";
    }else if(grade >= 3.5 && grade < 4.5){
        result = "Good";
    }else if(grade >= 4.5 && grade < 5.5){
        result = "Very good";
    }else{
        result = "Excellent"
    }

    return result === "Fail" ? `${result} (${grade})` : `${result} (${grade.toFixed(2)})`;
}

const format_gradeV3 = (grade) => {
    let result;

    if(grade < 3){
        result = "Fail";
        grade = 2;
    }else if(grade >= 3 && grade < 3.5){
        result = "Poor";
    }else if(grade >= 3.5 && grade < 4.5){
        result = "Good";
    }else if(grade >= 4.5 && grade < 5.5){
        result = "Very good";
    }else{
        result = "Excellent"
    }

    return result === "Fail" ? `${result} (${grade})` : `${result} (${grade.toFixed(2)})`;
}