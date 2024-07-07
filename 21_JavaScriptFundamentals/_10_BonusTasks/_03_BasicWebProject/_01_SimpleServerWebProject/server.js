const http = require('http');
const fs = require('fs');

const port = 3000;

const server = http.createServer(function(req, res){
    let htmlPage = fs.readFileSync('./views/home.html', 'utf8');
    const url = req.url;
    console.log(url);

    if(url === '/login'){
        htmlPage = fs.readFileSync('./views/login.html', 'utf8');
    }else if(url === '/register'){
        htmlPage = fs.readFileSync('./views/register.html', 'utf8');
    }

    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.write(htmlPage);
    res.end();
});

server.listen(port);
console.log(`My custom web server listening on port: ${port}!`);
