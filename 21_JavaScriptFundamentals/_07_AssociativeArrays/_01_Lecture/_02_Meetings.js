function meetingsV1(input){
    let result = ``;
    let meetings = {};

    input.forEach(e => {
        let [day, name] = e.split(" ");

        if(!meetings.hasOwnProperty(day)){
            meetings[day] = name;
            result += `Scheduled for ${day}\n`;
        }else{
            result += `Conflict on ${day}!\n`;
        }
    });

    Object.entries(meetings).forEach(e => result +=`${e[0]} -> ${e[1]}\n`);
    return result;
}

const meetingsV2 = function(input){
    let result = ``;
    let meetings = {};

    input.forEach(e => {
        let [day, name] = e.split(" ");

        if(!meetings.hasOwnProperty(day)){
            meetings[day] = name;
            result += `Scheduled for ${day}\n`;
        }else{
            result += `Conflict on ${day}!\n`;
        }
    });

    Object.entries(meetings).forEach(e => result +=`${e[0]} -> ${e[1]}\n`);
    return result;
}

const meetingsV3 = (input) => {
    let result = ``;
    let meetings = {};

    input.forEach(e => {
        let [day, name] = e.split(" ");

        if(!meetings.hasOwnProperty(day)){
            meetings[day] = name;
            result += `Scheduled for ${day}\n`;
        }else{
            result += `Conflict on ${day}!\n`;
        }
    });

    Object.entries(meetings).forEach(e => result +=`${e[0]} -> ${e[1]}\n`);
    return result;
}

console.log(meetingsV1(['Monday Peter', 'Wednesday Bill', 'Monday Tim', 'Friday Tim']));