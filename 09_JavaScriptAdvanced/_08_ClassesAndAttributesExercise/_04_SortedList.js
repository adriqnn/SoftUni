class SortedListV1{
    constructor(){
        this.arr = [];
        this.size = this.arr.length;
    }

    add(element){
        this.arr.push(element);
        this.arr = this.arr.sort((a, b) => a - b);
        this.size = this.arr.length;
    }

    remove(index){
        if(index >= 0 && index < this.arr.length){
            this.arr.splice(index,1);
            this.size = this.arr.length;
        }else{
            throw new Error("invalid index!");
        }
    }

    get(index){
        if(index >= 0 && index < this.arr.length){
            return this.arr[index];
        }else{
            throw new Error("invalid index!");
        }
    }
}

class SortedListV2{
    constructor(){
        this.list = [];
        this.size = this.list.length;
    }

    updateSize = () => this.size = this.list.length;
    orderList = () => this.list.sort((a, b) => a - b);

    add(e){
        this.list.push(e);
        this.updateSize();
        this.orderList();
    }

    remove(i){
        if (this.list[i] !== undefined){
            this.list.splice(i, 1);
            this.updateSize();
            this.orderList();
        }
    }

    get(i){
        if (this.list[i] !== undefined){
            this.updateSize();
            this.orderList();
            return this.list[i];
        }
    }
}
