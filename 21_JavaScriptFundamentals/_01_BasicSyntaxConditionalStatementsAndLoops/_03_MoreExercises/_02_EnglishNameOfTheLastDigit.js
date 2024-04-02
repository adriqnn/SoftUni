function english_name_of_the_last_digitV1(number){
    const array = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
    const num = number % 10;

    return array[num];
}

const english_name_of_the_last_digitV2 = function(number){
    const array = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
    const num = number % 10;

    return array[num];
}

const english_name_of_the_last_digitV3 = (number) => {
    const array = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
    const num = number % 10;

    return array[num];
}