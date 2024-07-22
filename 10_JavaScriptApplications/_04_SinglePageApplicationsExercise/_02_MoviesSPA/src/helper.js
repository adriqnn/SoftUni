import { authenticateReq } from "./requests.js";

async function sendData(e, where){
    const formData = new FormData(e.target);
    const data = Object.fromEntries([...formData.entries()]);

    const user = {
        email: data.email,
        password: data.password
    }

    await authenticateReq(user, e, where);
}

export { sendData };