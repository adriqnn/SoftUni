function ticketsV1(arr, criteria){
    class Ticket{
        constructor(destination, price, status){
            this.destination = destination;
            this.price = price;
            this.status = status;
        }
    }

    let tickets = [];

    for (const line of arr) {
        let [destination, price, status] = line.split('|');
        price = Number(price);
        tickets.push(new Ticket(destination, price, status));
    }

    tickets.sort((a, b) => {
        if(criteria === 'destination'){
            return a.destination.localeCompare(b.destination);
        }else if(criteria === 'status'){
            return a.status.localeCompare(b.status);
        }else{
            return a.price - b.price;
        }
    });

    return tickets;
}

function ticketsV2(data, criteria){
    class Ticket{
        constructor(destination, price, status){
            this.destination = destination;
            this.price = price;
            this.status = status;
        }
    }

    return data.slice().map(x => x.split('|')).map(([d, p, s]) => new Ticket(d, Number(p), s)).sort((a, b) => {
        return typeof a[criteria] === 'number' ? a[criteria] - b[criteria] : a[criteria].localeCompare(b[criteria]);
    });
}
