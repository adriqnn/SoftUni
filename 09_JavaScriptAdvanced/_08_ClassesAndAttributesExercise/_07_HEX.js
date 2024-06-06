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

class HexV2{
    #value

    constructor(n){
        this.#value = n;
    }
    
    valueOf(){ 
        return this.#value;
    }
    
    plus(number){
        let result = this.#value + Number(number.valueOf());
        return new HexV2(result);
    }
    
    minus(number){
        let result = this.#value - Number(number.valueOf());
        return new HexV2(result);
    }
    
    toString(){
        return `0x${(this.#value.toString(16)).toUpperCase()}`;
    }

    parse(text){
        return parseInt(text, 16);
    }
}
