function chess_boardV1(number){
    let result = `<div class="chessboard">\n`;

    function line(c1, c2){
        result += `  <div>\n`;

        for (let j = 0; j < number; j++) {
            j % 2 === 0 ? result += `    <span class="${c1}"></span>\n` : result += `    <span class="${c2}"></span>\n`;
        }

        result += `  </div>\n`;
    }

    for (let i = 0; i < number; i++) {
        i % 2 === 0 ? line("black", "white") : line("white", "black");
    }

    result += `</div>`;

    return result;
}

const chess_boardV2 = function(number){
    let result = `<div class="chessboard">\n`;

    function line(c1, c2){
        result += `  <div>\n`;

        for (let j = 0; j < number; j++) {
            j % 2 === 0 ? result += `    <span class="${c1}"></span>\n` : result += `    <span class="${c2}"></span>\n`;
        }

        result += `  </div>\n`;
    }

    for (let i = 0; i < number; i++) {
        i % 2 === 0 ? line("black", "white") : line("white", "black");
    }

    result += `</div>`;

    return result;
}

const chess_boardV3 = (number) => {
    let result = `<div class="chessboard">\n`;

    function line(c1, c2){
        result += `  <div>\n`;

        for (let j = 0; j < number; j++) {
            j % 2 === 0 ? result += `    <span class="${c1}"></span>\n` : result += `    <span class="${c2}"></span>\n`;
        }

        result += `  </div>\n`;
    }

    for (let i = 0; i < number; i++) {
        i % 2 === 0 ? line("black", "white") : line("white", "black");
    }

    result += `</div>`;

    return result;
}

// console.log(chess_boardV1(3));
// console.log(chess_boardV1(5));