const http = require('http');
const fs = require('fs');
const path = require('path');

const port = 3000;

const server = http.createServer(function(req, res) {
    const url = req.url;
    let filePath;

    // Determine the file path based on the requested URL
    if (url === '/' || url === '/home') {
        filePath = './views/main.html';
    } else if (url === '/styles/main-style.css') {
        filePath = './styles/main-style.css';
    } else if (url === '/js/main-js.js') {
        filePath = './js/main-js.js';
    } else {
        res.writeHead(404, { 'Content-Type': 'text/plain' });
        res.end('404 Not Found');
        return;
    }

    // Read the file content based on the file path
    fs.readFile(filePath, 'utf8', (err, content) => {
        if (err) {
            res.writeHead(500, { 'Content-Type': 'text/plain' });
            res.end('Internal Server Error');
            return;
        }

        let contentType = 'text/html';

        if (filePath.endsWith('.css')) {
            contentType = 'text/css';
        } else if (filePath.endsWith('.js')) {
            contentType = 'application/javascript';
        }

        // Set the appropriate content type header
        res.writeHead(200, { 'Content-Type': contentType });
        res.write(content);
        res.end();
    });
});

server.listen(port, () => {
    console.log(`My custom web server listening on port: ${port}!`);
});