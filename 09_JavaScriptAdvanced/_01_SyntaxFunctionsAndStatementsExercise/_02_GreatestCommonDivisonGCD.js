function gcd(number1,number2){
    let gcd;

    if(number1 < number2){
        gcd = number1;
    }else{
        gcd = number2;
    }
    
    while(!(number1%gcd == 0 && number2%gcd == 0)){
        gcd--;
    }
    console.log(gcd);
}