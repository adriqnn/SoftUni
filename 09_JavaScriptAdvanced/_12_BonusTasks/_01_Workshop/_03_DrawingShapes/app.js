const canvas = document.getElementById("canvas");
/** @type { CanvasRenderingContext2D } */
let ctx = canvas.getContext('2d');

window.ctx = ctx;

const width = canvas.width;
const height = canvas.height;
const hSize = 20;
const vSize = 20;
const gridSize = width / hSize;

function drawGrid(){
    ctx.beginPath();

    for (let x = 1; x < hSize; x++) {
        ctx.moveTo(x * gridSize, 0);
        ctx.lineTo(x * gridSize, height);
    }

    for (let y = 1; y < vSize; y++) {
        ctx.moveTo(0, y * gridSize);
        ctx.lineTo(y * gridSize, width);
    }

    for (let y = 1; y < vSize; y++) {
        ctx.moveTo(width, y * gridSize);
        ctx.lineTo(width - y * gridSize, width);  
    }

    ctx.closePath();
    ctx.stroke();
}

drawGrid();
