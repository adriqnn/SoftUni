document.getElementById('csvFileInput').addEventListener('change', handleFileSelect);

function handleFileSelect(event) {
    const file = event.target.files[0];
    console.log(file);

    if (!file) {
        return;
    }

    const reader = new FileReader();

    reader.onload = function(e) {
        const contents = e.target.result;
        processCSV(contents);
    };

    reader.readAsText(file);
}

function processCSV(csvData) {
    const rows = csvData.split('\n');
    const data = [];

    rows.forEach(row => {
        if (row.trim()) {
            data.push(row.split(','));
        }
    });

    // Now `data` contains an array of arrays representing CSV rows and columns
    // console.log(data);
}