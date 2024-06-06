class LengthLimitV1{
    constructor(string, length){
        this.innerString = string;
        this.innerLength = length;
    }

    increase(num){
        this.innerLength += num;
    }

    decrease(num){
        if(this.innerLength - num < 0){
            this.innerLength = 0;
        }else {
            this.innerLength -= num;
        }
    }

    toString(){
        if(this.innerLength < this.innerString.length){
            return this.innerString.substring(0,this.innerLength) + '...';
        }else{
            return this.innerString;
        }
    }
}

class LengthLimitV2{
    constructor (s, l){
        this.innerString = s;
        this.innerLength = l;
    }

    increase(v){
        this.innerLength += v;
    }

    decrease(v){
        const result = this.innerLength - v;
        this.innerLength = result < 0 ? 0 : result;
    }

    toString(){
        if (this.innerLength === 0) return '...';

        if (this.innerString.length > this.innerLength){
            return `${this.innerString.slice(0, this.innerLength)}...`;
        }

        return this.innerString;
    }
}
