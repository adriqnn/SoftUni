function person_infoV1(firstName, lastName, age){
    return {firstName, lastName, age};
}

const person_infoV2 = function(firstName, lastName, age){
    let person = {firstName, lastName, age};
    return `firstName: ${person.firstName}\nlastName: ${person.lastName}\nage: ${person.age}`;
}

const person_infoV3 = (firstName, lastName, age) => {
    class Person{
        constructor(firstName, lastName, age){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        displayInfo(){
            return `firstName: ${firstName}\nlastName: ${lastName}\nage: ${age}`;
        }
    }

    let person = new Person(firstName, lastName, age);
    return person.displayInfo();
}

// console.log(person_infoV1("Peter", "Pan", 20));