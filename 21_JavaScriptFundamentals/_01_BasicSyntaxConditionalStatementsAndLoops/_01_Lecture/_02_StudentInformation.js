function student_informationV1(name, age, grade){
    console.log(`Name: ${name}, Age: ${age}, Grade: ${grade.toFixed(2)}`);
}

const student_informationV2 = function(name, age, grade) {
    console.log(`Name: ${name}, Age: ${age}, Grade: ${grade.toFixed(2)}`);
}

const student_informationV3 = (name, age, grade) => {
    console.log(`Name: ${name}, Age: ${age}, Grade: ${grade.toFixed(2)}`);
}

// student_informationV1('peter', 6, 5.232323);