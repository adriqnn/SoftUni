function factory(lib, list){
    const result = [];

    for(let order of list){
        const object = {};
        const template = order.template;
        //result.push(template);
        for(let prop in template){
            object[prop] = template[prop];
        }

        const parts = order.parts;
        for (let part of parts){
            object[part] = lib[part];
        }
        result.push(object);
    }
    //console.log(JSON.stringify(result));
    return result;
}