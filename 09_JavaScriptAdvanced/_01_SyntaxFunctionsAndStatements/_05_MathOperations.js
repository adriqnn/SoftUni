function math(n1,n2,opperand){
    let result;
    
    if(opperand == '+'){
        result = n1+n2;
    }else if(opperand == '-'){
        result = n1-n2;
    }else if(opperand == '*'){
        result = n1*n2;
    }else if(opperand == '/'){
        result = n1/n2;
    }else if(opperand == '%'){
        result = n1%n2;
    }else if(opperand == '**'){
        result = n1**n2;
    }
    console.log(result);
}