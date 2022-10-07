function validate(num1,num2,num3,num4){
    let x1 = num1;
    let y1 = num2;
    let x2 = num3;
    let y2 = num4;

    // x1 y1 0 0
    // x2 y2 0 0
    // x1 y1 x2 y2

    let validate1 = (Math.sqrt((0-x1)**2 + (0-y1)**2));
    let validate2 = (Math.sqrt((0-x2)**2 + (0-y2)**2));
    let validate3 = (Math.sqrt((x2-x1)**2 + (y2-y1)**2));

    console.log(`{${x1}, ${y1}} to {0, 0} is ${validate1 % 1 === 0 ? 'valid' : 'invalid'}`);
    console.log(`{${x2}, ${y2}} to {0, 0} is ${validate2 % 1 === 0 ? 'valid' : 'invalid'}`);
    console.log(`{${x1}, ${y1}} to {${x2}, ${y2}} is ${validate3 % 1 === 0 ? 'valid' : 'invalid'}`);
}