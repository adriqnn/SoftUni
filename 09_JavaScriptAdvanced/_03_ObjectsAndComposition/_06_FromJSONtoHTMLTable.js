function from_json_to_html_tableV1(str){
    const escapeChar = w => `${w}`.replace(/&/g, "&amp;").replace(/</g, "&lt;").replace(/>/g, "&gt;").replace(/"/g, "&quot;").replace(/'/g, "&#39;");

    let result = `<table>\n`;
    result += `   <tr>${Object.keys(JSON.parse(str)[0]).map(e => `<th>${e}</th>`).join("")}</tr>\n`;
    result += JSON.parse(str).map(e => `   <tr>${Object.entries(e).map(e => `<td>${escapeChar(e[1])}</td>`).join("")}</tr>`).join("\n");
    result += `\n</table>`;

    return result;
}

function from_json_to_html_tableV2(str){
    const parsed = JSON.parse(str);
    const escapeChar = w => `${w}`.replace(/&/g, "&amp;").replace(/</g, "&lt;").replace(/>/g, "&gt;").replace(/"/g, "&quot;").replace(/'/g, "&#39;");
    const makeRow = (tag, data) => `<tr>${data.map(x => `<${tag}>${escapeChar(x)}</${tag}>`).join("")}</tr>`;

    return `<table>\n${makeRow("th", Object.keys(parsed[0]))}\n${parsed.map(x => makeRow("td", Object.values(x))).join("\n")}\n</table>`;
}
