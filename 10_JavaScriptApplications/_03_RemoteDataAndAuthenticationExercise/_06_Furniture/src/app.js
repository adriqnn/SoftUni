import { commonLoadContent } from "./common.js";

const html = {
    table: document.querySelector('.table tbody')
}

document.addEventListener('DOMContentLoaded', loadContent);

async function loadContent(){
    await commonLoadContent(html.table, 'home');
}
