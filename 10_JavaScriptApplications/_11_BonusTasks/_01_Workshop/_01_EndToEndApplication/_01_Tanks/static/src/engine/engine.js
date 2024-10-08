document.addEventListener('keydown', event => { engine?.onKey(event.code, true); });
document.addEventListener('keyup', event => { engine?.onKey(event.code, false); });

let engine = null;

export function closeEngine(){
    if(engine){
        engine.going = false;
    }
}

export async function createRenderer(){
    const images = {};
    const imgList = [ 'tank-body.png', 'tracks0.png', 'tracks1.png' ];
    for(let img of imgList){
        images[img] = await createImageBitmap(await (await fetch(`/assets/${img}`)).blob());
    }

    const canvas = document.querySelector('canvas');
    /** @type {CanvasRenderingContext2D} */
    const ctx = canvas.getContext('2d');

    ctx.font = '20px Consolas, sans-serif';
    ctx.imageSmoothingEnabled = false;

    engine = {
        going: true,
        STEP_SIZE: 1000 / 50,
        STEP_SIZE_S: 1 / 50,
        WIDTH: canvas.width,
        HEIGHT: canvas.height,
        clear,
        drawGrid,
        drawImage,
        drawCircle,
        drawText,
        onKey(){},
        registerMain(render, tick){
            let last = performance.now();
            let delta = 0;

            main(last);

            function main(time){
                delta += time - last;
                last = time;

                if(delta > 1000){
                    delta = engine.STEP_SIZE;
                }

                while(delta >= engine.STEP_SIZE){
                    delta -= engine.STEP_SIZE;
                    tick();
                }

                render();

                if(engine.going){
                    requestAnimationFrame(main);
                }
            }
        }
    };

    return engine;

    function clear(){
        ctx.clearRect(0, 0, engine.WIDTH, engine.HEIGHT);
    }

    function drawGrid(){
        for(let x = 50; x < engine.WIDTH; x += 50){
            ctx.beginPath();

            ctx.moveTo(x, 0);
            ctx.lineTo(x, engine.HEIGHT);

            if(x % 200 === 0){
                ctx.strokeStyle = 'rgba(128, 128, 128, 0.5)';
            }else{
                ctx.strokeStyle = 'rgba(128, 128, 128, 0.25)';
            }

            ctx.stroke();
            ctx.closePath();
        }

        for(let y = 50; y < engine.HEIGHT; y += 50){
            ctx.beginPath();
            ctx.moveTo(0, y);
            ctx.lineTo(engine.WIDTH, y);

            if(y % 200 === 0){
                ctx.strokeStyle = 'rgba(128, 128, 128, 0.3)';
            }else{
                ctx.strokeStyle = 'rgba(128, 128, 128, 0.15)';
            }

            ctx.stroke();
            ctx.closePath();
        }
    }

    function drawImage(imgName, x, y, scale, rotation){
        ctx.save();

        ctx.translate(x, y);
        ctx.rotate(rotation);

        const img = images[imgName];
        const w = img.width * scale;
        const h = img.height * scale;

        ctx.drawImage(img, -(w / 2), -(h / 2), w, h);
        ctx.restore();
    }

    function drawCircle(x, y, radius, color = 'red'){
        ctx.beginPath();
        ctx.fillStyle = color;
        ctx.moveTo(x, y);
        ctx.ellipse(x, y, radius, radius, 0, 0, Math.PI * 2);
        ctx.fill();

        ctx.closePath();
    }

    function drawText(text, x, y, color = 'black'){
        ctx.fillStyle = color;
        ctx.fillText(text, x, y);
    }
}
