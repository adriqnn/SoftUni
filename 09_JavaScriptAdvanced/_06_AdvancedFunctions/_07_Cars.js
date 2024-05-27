function carsV1(input){
    const data = {};

    const commands = {
        create: (name, inherits, parentName) => {
            data[name]  = inherits ? Object.create(data[parentName]) : {};
        },
        set: (name, k, v) => data[name][k] = v,
        print: (name) => {
            const entries = [];
            for (const key in data[name]){
                entries.push(`${key}:${data[name][key]}`);
            }
            
            console.log(entries.join(','));
        },
    }
    
    input.forEach(e => {
        const [command, name, k, v] = e.split(' ');
        commands[command](name, k, v);
    });
}
