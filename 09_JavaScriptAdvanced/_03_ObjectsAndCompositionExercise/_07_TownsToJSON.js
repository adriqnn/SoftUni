function towns_to_jsonV1(arr){
    let result = [];

    class Town{
        constructor(town, latitude, longitude) {
            this.Town = town;
            this.Latitude = Number(latitude);
            this.Longitude = Number(longitude);
        }
    }

    for (let index = 1; index < arr.length; index++) {
        let array = arr[index].split('|').map(t => t.trim()).filter(x => x.length !== 0);

        let townName = array[0];
        let latitude = Number(array[1]).toFixed(2);
        let longitude = Number(array[2]).toFixed(2);
        let town = new Town(townName,latitude,longitude);

        result.push(town);
    }

    return JSON.stringify(result);
}

function towns_to_jsonV2(arr){
    const parser = str => str.split("|").filter(x => x !== "").map(x => x.trim()).map(x => (isNaN(x) ? x : Number(Number(x).toFixed(2))));
    const headings = parser(arr[0]);

    return JSON.stringify(arr.slice(1).map(x => {
        const line = parser(x);

        return headings.reduce((row, heading, entry) => {
            row[heading] = line[entry];

            return row;
        }, {});
    }));
}
