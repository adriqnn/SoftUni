function recursionV1(num){
    if(num > 1024){
        return;
    }

    console.log(num);
    recursionV1(num * 2);
}

const recursionV2 = function(num) {
    if(num > 1024){
        return;
    }

    console.log(num);
    recursionV2(num * 2);
}

const recursionV3 = (num) => {
    if(num > 1024){
        return;
    }

    console.log(num);
    recursionV3(num * 2);
}

// recursionV1(2);