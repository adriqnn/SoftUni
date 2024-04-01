function vacationV1(number, type, day){
    const types = {
        Students: {
            Friday: 8.45,
            Saturday: 9.8,
            Sunday: 10.46,
        },
        Business: {
            Friday: 10.9,
            Saturday: 15.6,
            Sunday: 16,
        },
        Regular: {
            Friday: 15,
            Saturday: 20,
            Sunday: 22.5,
        }
    };

    function showPrice(number){
        return `Total price: ${number.toFixed(2)}`;
    }

    const result = types[type][day] * number;

    if(type === "Students" && number >= 30){
        return showPrice(result * 0.85);
    }

    if(type === "Business" && number >= 100){
        return showPrice(result - (10 * types[type][day]));
    }

    if(type === "Regular" && number >= 10 && number <= 20){
        return showPrice(result * 0.95);
    }

    return showPrice(result);
}

const vacationV2 = function (number, type, day){
    const types = {
        Students: {
            Friday: 8.45,
            Saturday: 9.8,
            Sunday: 10.46,
        },
        Business: {
            Friday: 10.9,
            Saturday: 15.6,
            Sunday: 16,
        },
        Regular: {
            Friday: 15,
            Saturday: 20,
            Sunday: 22.5,
        }
    };

    const showPrice = function(number){
        return `Total price: ${number.toFixed(2)}`;
    }

    const result = types[type][day] * number;

    if(type === "Students" && number >= 30){
        return showPrice(result * 0.85);
    }

    if(type === "Business" && number >= 100){
        return showPrice(result - (10 * types[type][day]));
    }

    if(type === "Regular" && number >= 10 && number <= 20){
        return showPrice(result * 0.95);
    }

    return showPrice(result);
}

const vacationV3 = (number, type, day) => {
    const types = {
        Students: {
            Friday: 8.45,
            Saturday: 9.8,
            Sunday: 10.46,
        },
        Business: {
            Friday: 10.9,
            Saturday: 15.6,
            Sunday: 16,
        },
        Regular: {
            Friday: 15,
            Saturday: 20,
            Sunday: 22.5,
        }
    };

    const showPrice = (number) => {
        return `Total price: ${number.toFixed(2)}`;
    }

    const result = types[type][day] * number;

    if(type === "Students" && number >= 30){
        return showPrice(result * 0.85);
    }

    if(type === "Business" && number >= 100){
        return showPrice(result - (10 * types[type][day]));
    }

    if(type === "Regular" && number >= 10 && number <= 20){
        return showPrice(result * 0.95);
    }

    return showPrice(result);
}

// console.log(vacationV3(10, "Students", "Friday"));