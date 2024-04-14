function school_registerV1(students){
    let register = {};

    students.forEach(e => {
        let [studentArray, gradeArray, graduatedArray] = e.split(", ");
        let studentName = studentArray.split(" ")[2];
        let studentGrade = gradeArray.split(" ")[1];
        let averageScore = graduatedArray.split(" ")[5];

        let o = { [studentName]: averageScore };

        if(!register.hasOwnProperty(studentGrade) && averageScore >= 3){
            register[studentGrade] = [];
        }

        if(averageScore >= 3){
            register[studentGrade].push(o);
        }
    });

    let result = ``;
    Object.entries(register).sort((a, b) => a[0] - b[0]).forEach(([k, v]) => {
        result += `${Number(k) + 1} Grade\n`;
        result += `List of students: ${v.filter(e => Object.values(e)[0] >= 3).map(e => Object.keys(e)[0]).join(", ")}\n`;
        result += `Average annual score from last year: ${v.filter(e => Object.values(e)[0] >= 3).reduce((a, v, i, arr) => {
            a.sum += Number(Object.values(v)[0]);
            a.count++;
            
            if (i === arr.length - 1) {
                a.average = a.sum / a.count;
            }
            
            return a;
        } , {sum: 0, count: 0, average: 0}).average.toFixed(2)}\n\n`;
    });

    return result;
}

const school_registerV2 = function(students){
    let register = {};

    students.forEach(e => {
        let [studentArray, gradeArray, graduatedArray] = e.split(", ");
        let studentName = studentArray.split(" ")[2];
        let studentGrade = gradeArray.split(" ")[1];
        let averageScore = graduatedArray.split(" ")[5];

        let o = { [studentName]: averageScore };

        if(!register.hasOwnProperty(studentGrade) && averageScore >= 3){
            register[studentGrade] = [];
        }

        if(averageScore >= 3){
            register[studentGrade].push(o);
        }
    });

    let result = ``;
    Object.entries(register).sort((a, b) => a[0] - b[0]).forEach(([k, v]) => {
        result += `${Number(k) + 1} Grade\n`;
        result += `List of students: ${v.filter(e => Object.values(e)[0] >= 3).map(e => Object.keys(e)[0]).join(", ")}\n`;
        result += `Average annual score from last year: ${v.filter(e => Object.values(e)[0] >= 3).reduce((a, v, i, arr) => {
            a.sum += Number(Object.values(v)[0]);
            a.count++;

            if (i === arr.length - 1) {
                a.average = a.sum / a.count;
            }

            return a;
        } , {sum: 0, count: 0, average: 0}).average.toFixed(2)}\n\n`;
    });

    return result;
}

const school_registerV3 = (students) => {
    let register = {};

    students.forEach(e => {
        let [studentArray, gradeArray, graduatedArray] = e.split(", ");
        let studentName = studentArray.split(" ")[2];
        let studentGrade = gradeArray.split(" ")[1];
        let averageScore = graduatedArray.split(" ")[5];

        let o = { [studentName]: averageScore };

        if(!register.hasOwnProperty(studentGrade) && averageScore >= 3){
            register[studentGrade] = [];
        }

        if(averageScore >= 3){
            register[studentGrade].push(o);
        }
    });

    let result = ``;
    Object.entries(register).sort((a, b) => a[0] - b[0]).forEach(([k, v]) => {
        result += `${Number(k) + 1} Grade\n`;
        result += `List of students: ${v.filter(e => Object.values(e)[0] >= 3).map(e => Object.keys(e)[0]).join(", ")}\n`;
        result += `Average annual score from last year: ${v.filter(e => Object.values(e)[0] >= 3).reduce((a, v, i, arr) => {
            a.sum += Number(Object.values(v)[0]);
            a.count++;

            if (i === arr.length - 1) {
                a.average = a.sum / a.count;
            }

            return a;
        } , {sum: 0, count: 0, average: 0}).average.toFixed(2)}\n\n`;
    });

    return result;
}

// console.log(school_registerV1(["Student name: Mark, Grade: 8, Graduated with an average score: 4.75", "Student name: Ethan, Grade: 9, Graduated with an average score: 5.66", "Student name: George, Grade: 8, Graduated with an average score: 2.83", "Student name: Steven, Grade: 10, Graduated with an average score: 4.20", "Student name: Joey, Grade: 9, Graduated with an average score: 4.90", "Student name: Angus, Grade: 11, Graduated with an average score: 2.90", "Student name: Bob, Grade: 11, Graduated with an average score: 5.15", "Student name: Daryl, Grade: 8, Graduated with an average score: 5.95", "Student name: Bill, Grade: 9, Graduated with an average score: 6.00", "Student name: Philip, Grade: 10, Graduated with an average score: 5.05", "Student name: Peter, Grade: 11, Graduated with an average score: 4.88", "Student name: Gavin, Grade: 10, Graduated with an average score: 4.00"]));
// console.log(school_registerV1(['Student name: George, Grade: 5, Graduated with an average score: 2.75', 'Student name: Alex, Grade: 9, Graduated with an average score: 3.66', 'Student name: Peter, Grade: 8, Graduated with an average score: 2.83', 'Student name: Boby, Grade: 5, Graduated with an average score: 4.20', 'Student name: John, Grade: 9, Graduated with an average score: 2.90', 'Student name: Steven, Grade: 2, Graduated with an average score: 4.90', 'Student name: Darsy, Grade: 1, Graduated with an average score: 5.15']));
