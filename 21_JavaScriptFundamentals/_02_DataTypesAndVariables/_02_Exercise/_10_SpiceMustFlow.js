function spice_must_flowV1(number){
    let spice = 0;
    let days = 0;

    function isEnoughSpice() {
        return spice - 26 > 0;
    }

    while (n >= 100) {
        spice += n;
        n -= 10;
        days += 1;
        isEnoughSpice() ? (spice -= 26) : (spice = 0);
    }

    return `${days}\n${isEnoughSpice() ? spice - 26 : 0}`;
}

const spice_must_flowV2 = function (){
    let spice = 0;
    let days = 0;

    function isEnoughSpice() {
        return spice - 26 > 0;
    }

    while (n >= 100) {
        spice += n;
        n -= 10;
        days += 1;
        isEnoughSpice() ? (spice -= 26) : (spice = 0);
    }

    return `${days}\n${isEnoughSpice() ? spice - 26 : 0}`;
}

const spice_must_flowV3 = () => {
    let spice = 0;
    let days = 0;

    function isEnoughSpice() {
        return spice - 26 > 0;
    }

    while (n >= 100) {
        spice += n;
        n -= 10;
        days += 1;
        isEnoughSpice() ? (spice -= 26) : (spice = 0);
    }

    return `${days}\n${isEnoughSpice() ? spice - 26 : 0}`;
}
