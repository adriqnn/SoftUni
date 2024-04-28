const p = document.getElementById("asd");
p.textContent = 'waiting';

// Retrieve DOM elements
const fileInput = document.getElementById('fileInput');
const fileInputLabel = document.getElementById('fileInputLabel');
const submitButton = document.getElementById('submitButton');


fileInput.addEventListener('change', function(e) {
    e.preventDefault();
    if (fileInput.files.length > 0) {
        const selectedFile = e.target.files[0].name;
        fileInputLabel.textContent = `File Selected   ->   ${selectedFile}`;
    } else {
        fileInputLabel.textContent = 'Drag and drop files here or click to choose 🌩:';
    }
});

submitButton.addEventListener('change', function(e) {
    e.preventDefault();
    if (fileInput.files.length > 0) {
        const selectedFile = e.target.files[0].name;
        fileInputLabel.textContent = `File Selected   ->   ${selectedFile}`;
    } else {
        fileInputLabel.textContent = 'Drag and drop files here or click to choose 🌩:';
    }
});

submitButton.addEventListener('click', function() {
    const files = fileInput.files;

    if (files.length === 0) {
        alert('Please select at least one file.');
        return;
    }

    const file = files[0];
    const reader = new FileReader();
    let csvDataArray = [];
    let json;

    console.log(`File ${1}: ${file.name} (${file.type}, ${file.size} bytes)`);

    reader.onload = function (e){
        const csvData = e.target.result;
        processCSV(csvData);
    }

    reader.readAsText(file);

    function processCSV(csvData) {
        const rows = csvData.split('\n');
        const data = [];

        rows.forEach(row => {
            if (row.trim()) {
                data.push(row.split(','));
            }
        });

        csvDataArray = data;
        json = JSON.stringify(data);
        console.log(json);
    }


    fileInput.type = 'text';
    fileInput.type = 'file';

    fileInputLabel.textContent = 'Drag and drop files here or click to choose 🌩:';
});

