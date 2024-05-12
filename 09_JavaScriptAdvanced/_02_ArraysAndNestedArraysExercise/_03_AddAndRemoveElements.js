function add_and_remove_elementsV1(arr){
    let result = [];
    let helper = 1;

    arr.forEach((e) => {
        e === "add" ? result.push(helper) : result.pop();
        helper++
    });

    return result.join("\n") || "Empty";
}

function add_and_remove_elementsV2(arr){
    let newArr = [];
    let num = 0;

    for(let i = 0; i < arr.length; i++){
        num++;
        let command = arr[i];

        if(command === 'add'){
            newArr.push(num);
        }else if(command === 'remove'){
            newArr.pop();
        }
    }

    if(newArr.length === 0){
        return "Empty"
    }else{
        return newArr.join('\n');
    }
}

function add_and_remove_elementsV3(arr){
    let count = 1;
    const temp = [];
    const actions = {
        add: x => temp.push(x),
        remove: () => temp.pop()
    }

    arr.forEach(x => actions[x](count++));
    return temp.length !== 0 ? temp.join("\n") : "Empty";
}
