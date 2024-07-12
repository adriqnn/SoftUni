import { sendData } from "./helpers.js";

async function register(e){
    e.preventDefault();
    await sendData(e, 'register');
}

export { register };
