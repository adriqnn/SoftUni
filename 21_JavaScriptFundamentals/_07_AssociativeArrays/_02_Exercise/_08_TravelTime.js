function travel_timeV1(input){
    let destinations = {};

    input.forEach(e => {
        let [country, city, price] = e.split(" > ");

        if(!destinations.hasOwnProperty(country)){
            destinations[country] = {};
        }

        if(destinations[country].hasOwnProperty(city)){
            destinations[country][city] = Math.min(destinations[country][city], price);
        }else{
            destinations[country][city] = Number(price);
        }
    });

    return Object.entries(destinations).sort((a, b) => a[0].localeCompare(b[0])).map(e => `${e[0]} -> ${Object.entries(e[1]).sort((a, b) => a[1] - b[1]).map(e => `${e[0]} -> ${e[1]}`).join(" ")}`).join("\n");
}

const travel_timeV2 = function(input){
    let destinations = {};

    input.forEach(e => {
        let [country, city, price] = e.split(" > ");

        if(!destinations.hasOwnProperty(country)){
            destinations[country] = {};
        }

        if(destinations[country].hasOwnProperty(city)){
            destinations[country][city] = Math.min(destinations[country][city], price);
        }else{
            destinations[country][city] = Number(price);
        }
    });

    return Object.entries(destinations).sort((a, b) => a[0].localeCompare(b[0])).map(e => `${e[0]} -> ${Object.entries(e[1]).sort((a, b) => a[1] - b[1]).map(e => `${e[0]} -> ${e[1]}`).join(" ")}`).join("\n");
}

const travel_timeV3 = (input) => {
    let destinations = {};

    input.forEach(e => {
        let [country, city, price] = e.split(" > ");

        if(!destinations.hasOwnProperty(country)){
            destinations[country] = {};
        }

        if(destinations[country].hasOwnProperty(city)){
            destinations[country][city] = Math.min(destinations[country][city], price);
        }else{
            destinations[country][city] = Number(price);
        }
    });

    return Object.entries(destinations).sort((a, b) => a[0].localeCompare(b[0])).map(e => `${e[0]} -> ${Object.entries(e[1]).sort((a, b) => a[1] - b[1]).map(e => `${e[0]} -> ${e[1]}`).join(" ")}`).join("\n");
}

// console.log(travel_timeV1(["Bulgaria > Sofia > 500", "Bulgaria > Sopot > 800", "France > Paris > 2000", "Albania > Tirana > 1000", "Bulgaria > Sofia > 200"]));