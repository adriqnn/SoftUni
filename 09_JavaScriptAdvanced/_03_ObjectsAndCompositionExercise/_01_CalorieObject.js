function calorieObject(input){
    const calories = {};

    for(let i = 0; i < input.length -1; i = i+2){
        let first = input[i];
        let second = input[i+1]
        calories[input[i]] = Number(input[i +1]);
    }

    console.log(calories);
}