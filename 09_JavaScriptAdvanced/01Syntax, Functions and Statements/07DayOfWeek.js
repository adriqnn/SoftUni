function day(d) {
    const days = {
        Monday: 1,
        Tuesday: 2,
        Wednesday: 3,
        Thursday: 4,
        Friday: 5,
        Saturday: 6,
        Sunday: 7,
    }
    return days[d] || "error"
}

console.log(day('Monday'));
console.log(day('Friday'));
console.log(day('Invalid'));