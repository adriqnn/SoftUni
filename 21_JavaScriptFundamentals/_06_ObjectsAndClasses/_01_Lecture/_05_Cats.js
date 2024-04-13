function catsV1(array){
    class Cat{
        constructor(name, age) {
            this.name = name;
            this.age = age;
        }

        string(){
            return `${this.name}, age ${this.age} says Meow`;
        }
    }

    let cats = [];

    for (let i = 0; i < array.length; i++) {
        let [cat, age] = array[i].split(" ");
        cats.push(new Cat(cat, age));
    }

    return cats.map(e => e.string()).join("\n");
}

const catsV2 = function(array){
    class Cat{
        constructor(name, age) {
            this.name = name;
            this.age = age;
        }

        string(){
            return `${this.name}, age ${this.age} says Meow`;
        }
    }

    let cats = [];

    for (let i = 0; i < array.length; i++) {
        let [cat, age] = array[i].split(" ");
        cats.push(new Cat(cat, age));
    }

    return cats.map(e => e.string()).join("\n");
}

const catsV3 = (array) => {
    class Cat{
        constructor(name, age) {
            this.name = name;
            this.age = age;
        }

        string(){
            return `${this.name}, age ${this.age} says Meow`;
        }
    }

    let cats = [];

    for (let i = 0; i < array.length; i++) {
        let [cat, age] = array[i].split(" ");
        cats.push(new Cat(cat, age));
    }

    return cats.map(e => e.string()).join("\n");
}