class HexV1{
    constructor(x){
        this.param = x;
    }

    valueOf(){
        return this.param;
    }

    plus(obj){
        let result = this.param + Number(obj.valueOf());
        return new HexV1(result);
    }

    minus(obj){
        let result = this.param - Number(obj.valueOf());
        return new HexV1(result);
    }

    toString(){
        return '0x' + this.param.toString(16).toUpperCase();
    }

    parse(str){
        return parseInt(str, 16);
    }
}
