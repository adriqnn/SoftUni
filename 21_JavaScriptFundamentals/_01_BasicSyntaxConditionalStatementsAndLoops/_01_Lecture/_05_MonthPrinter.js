function month_printerV1(num){
    const months = {
        "1": "January",
        "2": "February",
        "3": "March",
        "4": "April",
        "5": "May",
        "6": "June",
        "7": "July",
        "8": "August",
        "9": "September",
        "10": "October",
        "11": "November",
        "12": "December"
    }

    let i = parseInt(num);
    i > 0 && i <= 12 ? console.log(months[i]) : console.log("Error!");
}

const month_printerV2 = function(num){
    const months = {
        "1": "January",
        "2": "February",
        "3": "March",
        "4": "April",
        "5": "May",
        "6": "June",
        "7": "July",
        "8": "August",
        "9": "September",
        "10": "October",
        "11": "November",
        "12": "December"
    }

    let i = +num;
    i > 0 && i <= 12 ? console.log(months[i]) : console.log("Error!");
}

const month_printerV3 = (num) => {
    const months = {
        "1": "January",
        "2": "February",
        "3": "March",
        "4": "April",
        "5": "May",
        "6": "June",
        "7": "July",
        "8": "August",
        "9": "September",
        "10": "October",
        "11": "November",
        "12": "December"
    }

    num > 0 && num <= 12 ? console.log(months[num]) : console.log("Error!");
}

// month_printerV1("2");