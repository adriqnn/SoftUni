function calculator(){
    let field1 = null;
    let field2 = null;
    let result = null;

    return{
        init,
        add,
        subtract
    };

    function init(f1,f2,fr){
        field1 = document.querySelector(f1);
        field2 = document.querySelector(f2);
        result = document.querySelector(fr);
    }

    function add(){
        result.value = Number(field1.value) + Number(field2.value);
    }

    function subtract(){
        result.value = Number(field1.value) - Number(field2.value);
    }
}

function calculator2(){
    function init(s1,s2,rs){
        this.num1 = document.querySelector(s1);
        this.num2 = document.querySelector(s2);
        this.result = document.querySelector(rs);
    }
    function add(){
        this.result.value = NUmber(this.num1.value) + Number(this.num2.value);
    }
    function subtract(){
        this.result.value = Number(this.num1.value) - Number(this.num2.value);
    }
    return {
        init,
        add,
        subtract
    }
}