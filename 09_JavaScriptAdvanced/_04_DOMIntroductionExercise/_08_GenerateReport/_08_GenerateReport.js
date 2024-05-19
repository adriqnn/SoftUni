function generate_reportV1() {
    const html = {
        checkboxes: document.querySelectorAll("input[type='checkbox']"),
        rows: document.getElementsByTagName("tr"),
        output: document.getElementById("output"),
    }

    const selected = Array.from(html.checkboxes)
        .map((x, i) => [x, i])
        .filter(x => x[0].checked)
        .map(x => [x[0].name, x[1]]);

    const rowData = Array.from(html.rows).slice(1).map(x => Array.from(x.children).map(y => y.innerHTML));

    html.output.value = JSON.stringify(rowData.map(x => selected.reduce((a, v) => {
        const [sColName, sColIndex] = v;
        a[sColName] = x[sColIndex];

        return a;
    }, {})));
}

function generate_reportV2(){
    const html = {
        checkboxes: document.querySelectorAll("input[type='checkbox']"),
        rows: document.querySelectorAll("tbody tr"),
        out: document.getElementById("output")
    }

    const selected = Array.from(html.checkboxes).map((e, i) => [e, i]).filter(e => e[0].checked).map(e => [e[0].name, e[1]]);
    const data = Array.from(html.rows).map(x => Array.from(x.children).map(e => e.textContent));

    html.out.value = JSON.stringify(data.map(x => {
        let result = {};
        selected.forEach(e => result[e[0]] = x[e[1]]);

        return result;
    }));
}
