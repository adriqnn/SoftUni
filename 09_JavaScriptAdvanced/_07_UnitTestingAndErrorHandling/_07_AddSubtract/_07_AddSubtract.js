function add_subtractV1() {
    let value = 0;

    return {
        add: function(num) { value += Number(num); },
        subtract: function(num) { value -= Number(num); },
        get: function() { return value; }
    }

}

export { add_subtractV1 };