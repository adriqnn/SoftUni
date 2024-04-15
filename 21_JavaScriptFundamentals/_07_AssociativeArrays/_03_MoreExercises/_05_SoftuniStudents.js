function softuni_studentsV1(input){
    let courses = {};

    input.forEach(e => {
        if(e.includes(": ")){
            let [courseName, capacity] = e.split(": ");
            if(!courses.hasOwnProperty(courseName)){
                courses[courseName] = { students: {}, spots: 0, members: 0 };
            }

            courses[courseName].spots += Number(capacity);
        }else{
            let [userInfo, moreInfo] = e.split(" with email ");
            let [username, preCredits] = userInfo.split("[");
            let credits = Number(preCredits.slice(0, -1));
            let [email, courseName] = moreInfo.split(" joins ");

            if(courses.hasOwnProperty(courseName) && courses[courseName].spots !== 0){
                if(!courses[courseName].students.hasOwnProperty(credits)){
                    courses[courseName].students[credits] = {username, email};
                    courses[courseName].spots--;
                    courses[courseName].members++;
                }
            }
        }
    });

    let result = "";
    let sorted = Object.entries(courses).sort((a, b) => b[1].members - a[1].members);

    sorted.forEach(([course, information]) => {
        result += `${course}: ${information.spots} places left\n`;
        // result += `${Object.entries(information['students']).sort((a, b) => Number(b[0]) - Number(a[0])).map(element => `--- ${element[0]}: ${element[1]['username']}, ${element[1]['email']}`).join("\n")}\n`;
        Object.entries(information['students']).sort((a, b) => Number(b[0]) - Number(a[0])).map(element => result += `--- ${element[0]}: ${element[1]['username']}, ${element[1]['email']}\n`).join("\n");
    });

    return result;
}

const softuni_studentsV2 = function(input){
    let courses = {};

    input.forEach(e => {
        if(e.includes(": ")){
            let [courseName, capacity] = e.split(": ");
            if(!courses.hasOwnProperty(courseName)){
                courses[courseName] = { students: {}, spots: 0, members: 0 };
            }

            courses[courseName].spots += Number(capacity);
        }else{
            let [userInfo, moreInfo] = e.split(" with email ");
            let [username, preCredits] = userInfo.split("[");
            let credits = Number(preCredits.slice(0, -1));
            let [email, courseName] = moreInfo.split(" joins ");

            if(courses.hasOwnProperty(courseName) && courses[courseName].spots !== 0){
                if(!courses[courseName].students.hasOwnProperty(credits)){
                    courses[courseName].students[credits] = {username, email};
                    courses[courseName].spots--;
                    courses[courseName].members++;
                }
            }
        }
    });

    let result = "";
    let sorted = Object.entries(courses).sort((a, b) => b[1].members - a[1].members);
    for (let [course, information] of sorted) {
        result += `${course}: ${information.spots} places left\n`;
        let sortedStudents = Object.entries(information['students'])
            .sort((a, b) => Number(b[0]) - Number(a[0]))
            .map(element => {
                result +=`--- ${element[0]}: ${element[1]['username']}, ${element[1]['email']}\n`;
            });
    }

    return result;
}

const softuni_studentsV3 = (input) => {
    let courses = {};

    input.forEach(e => {
        if(e.includes(": ")){
            let [courseName, capacity] = e.split(": ");
            if(!courses.hasOwnProperty(courseName)){
                courses[courseName] = { students: [], spots: 0 };
            }

            courses[courseName].spots += Number(capacity);
        }else{
            let [userInfo, moreInfo] = e.split(" with email ");
            let [username, preCredits] = userInfo.split("[");
            let credits = Number(preCredits.slice(0, -1));
            let [email, courseName] = moreInfo.split(" joins ");

            if(courses.hasOwnProperty(courseName) && courses[courseName].spots > 0 && courses[courseName].students.indexOf(`${credits}: ${username}, ${email}`) === -1){
                courses[courseName].students.push(`${credits}: ${username}, ${email}`);
                courses[courseName].spots--;
            }
        }
    });

    return Object.entries(courses).sort((a, b) => b[1].students.length - a[1].students.length).map(e => {
        return  `${e[0]}: ${e[1].spots} places left\n${e[1].students.sort((a, b) => Number(b.split(":")[0]) - Number(a.split(":")[0])).map(e => `--- ${e}`).join("\n")}`;
    }).join("\n");
}

// console.log(softuni_studentsV1(['JavaBasics: 2', 'user1[25] with email user1@user.com joins C#Basics', 'C#Advanced: 3', 'JSCore: 4', 'user2[30] with email user2@user.com joins C#Basics', 'user13[50] with email user13@user.com joins JSCore', 'user1[25] with email user1@user.com joins JSCore', 'user8[18] with email user8@user.com joins C#Advanced', 'user6[85] with email user6@user.com joins JSCore', 'JSCore: 2', 'user11[3] with email user11@user.com joins JavaBasics', 'user45[105] with email user45@user.com joins JSCore', 'user007[20] with email user007@user.com joins JSCore', 'user700[29] with email user700@user.com joins JSCore', 'user900[88] with email user900@user.com joins JSCore']));
// console.log(softuni_studentsV1(['JavaBasics: 15', 'user1[26] with email user1@user.com joins JavaBasics', 'user2[36] with email user11@user.com joins JavaBasics', 'JavaBasics: 5', 'C#Advanced: 5', 'user1[26] with email user1@user.com joins C#Advanced', 'user2[36] with email user11@user.com joins C#Advanced', 'user3[6] with email user3@user.com joins C#Advanced', 'C#Advanced: 1', 'JSCore: 8', 'user23[62] with email user23@user.com joins JSCore']));
// console.log(softuni_studentsV1(['JavaBasics: 15', 'JavaBasics: 15', 'JavaBasics: 15', 'user1[26] with email user1@user.com joins JavaBasics', 'user2[36] with email user11@user.com joins JavaBasics', 'JavaBasics: 5', 'C#Advanced: 5', 'user1[26] with email user1@user.com joins C#Advanced', 'user2[36] with email user11@user.com joins C#Advanced', 'user3[6] with email user3@user.com joins C#Advanced', 'C#Advanced: 1', 'JSCore: 8', 'user23[62] with email user23@user.com joins JSCore', 'user1[26] with email user1@user.com joins C#Advanced', 'user1[26] with email user1@user.com joins C#Advanced', 'user1[26] with email user1@user.com joins C#Advanced','user1[26] with email user1@user.com joins C#Advanced', 'user1[26] with email user1@user.com joins C#Advanced']));