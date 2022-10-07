function num(number){
    let input = String(number);
    let isSame = true;
    let firstDigit = input[0];
    let sum = 0;

    for(i = 0;i < input.length;i++){
        if(input[i] != firstDigit){
            isSame = false;
        }
        sum += Number(input[i]);
    }
    console.log(isSame);
    console.log(sum);
}