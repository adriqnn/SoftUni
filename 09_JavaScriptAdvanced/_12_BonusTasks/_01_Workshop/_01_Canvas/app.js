const canvas = document.getElementById('canvas');
const ctx = canvas.getContext('2d');

window.ctx = ctx;

ctx.fillStyle = 'red';
ctx.fillRect(75, 75, 100, 200);

ctx.strokeStyle = 'purple';
ctx.strokeRect(100, 100, 100, 200);