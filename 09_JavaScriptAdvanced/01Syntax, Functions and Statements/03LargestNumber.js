function largestNumber(num1,num2,num3){
let result;
let result2 = Math.max(num1,num2,num3);
    if(num1 > num2 && num1 > num3){
        result = num1;
    }else if(num2 > num1 && num2 > num3){
        result = num2;
    }else if(num3 > num2 && num3 > num1){
        result = num3;
    }
    console.log(`The largest number is ${result}.`);
}

largestNumber(5,-3,16);
largestNumber(1,-3,16);
largestNumber(2,-3,16);
largestNumber(3,-3,16);
largestNumber(4,-3,16);
largestNumber(6,-3,16);
