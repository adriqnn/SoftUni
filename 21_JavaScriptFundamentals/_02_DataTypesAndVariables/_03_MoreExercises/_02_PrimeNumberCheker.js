function prime_number_checkerV1(number){
    if (number <= 1){
        return false;
    }

    for (let i= 2; i < number; i++) {
        if(number % i === 0){
            return false;
        }
    }

    return true;
}

const prime_number_checkerV2 = function(number){
    if (number <= 1){
        return false;
    }

    for (let i= 2; i < number; i++) {
        if(number % i === 0){
            return false;
        }
    }

    return true;
}

const prime_number_checkerV3 = (number) => {
    if (number <= 1){
        return false;
    }

    for (let i= 2; i < number; i++) {
        if(number % i === 0){
            return false;
        }
    }

    return true;
}