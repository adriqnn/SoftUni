function inventoryV1(input){
    let heroes = [];

    input.forEach(e => {
        const [name, level, items] = e.split("/");
        heroes.push({
            name, level: Number(level), items: items.split(", ").map(e => e.trim()).join(", ")
        });
    });

    return heroes.sort((a, b) => a.level - b.level).map(e => `Hero: ${e.name}\nlevel => ${e.level}\nitems => ${e.items}`).join("\n");
}

const inventoryV2 = function(input){
    let heroes = [];

    input.forEach(e => {
        const [name, level, items] = e.split("/");
        heroes.push({
            name, level: Number(level), items: items.split(", ").map(e => e.trim()).join(", ")
        });
    });

    return heroes.sort((a, b) => a.level - b.level).map(e => `Hero: ${e.name}\nlevel => ${e.level}\nitems => ${e.items}`).join("\n");
}

const inventoryV3 = (input) => {
    let heroes = [];

    input.forEach(e => {
        const [name, level, items] = e.split("/");
        heroes.push({
            name, level: Number(level), items: items.split(", ").map(e => e.trim()).join(", ")
        });
    });

    return heroes.sort((a, b) => a.level - b.level).map(e => `Hero: ${e.name}\nlevel => ${e.level}\nitems => ${e.items}`).join("\n");
}