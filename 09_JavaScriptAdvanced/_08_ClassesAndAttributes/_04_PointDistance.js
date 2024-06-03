class PointV1{
    constructor(x, y){
        this.x = x;
        this.y = y;
    }

    static distance(p1, p2){
        return Math.sqrt((p1.x - p2.x) ** 2 + (p1.y - p2.y) ** 2);
    }
}

class PointV2{
    constructor(x, y) {
        this._x = x;
        this._y = y;
    }

    get x () {
        return this._x;
    }
    
    get y () {
        return this._y;
    }

    static distance = (a, b) => Math.hypot(b.x - a.x, b.y - a.y);
}
