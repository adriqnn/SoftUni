function tic_tac_toeV1(commands){
    const board = [0, 0, 0].map(x => ["false", "false", "false"]);
    let player = "X";

    function isWinningMove(board, row, place){
        return(
            board[row].every(x => x === player) || board.reduce((a, v) => {
                a.push(v[place]);
                return a;
            }, [])
                .every(x => x === player) || [board[0][0], board[1][1], board[2][2]].every(x => x === player) || [board[0][2], board[1][1], board[2][0]].every(x => x === player)
        );
    }

    let result = "";
    const printBoard = board => board.map(x => result += `${x.join("\t")}\n` );

    for (let i = 0; i < commands.length; i++) {
        const [row, place] = commands[i].split(" ").map(Number);

        if(board[row][place] !== "false"){
            result += `This place is already taken. Please choose another!\n`;
            continue;
        }

        board[row][place] = player;

        if(isWinningMove(board, row, place)){
            result += `Player ${player} wins!\n`;
            printBoard(board);
            break;
        }

        if(board.every(x => x.every(y => y !== "false"))){
            result += `The game ended! Nobody wins :(\n`;
            printBoard(board);
            break;
        }

        player = player === "X" ? "O" : "X";
    }

    return result;
}
