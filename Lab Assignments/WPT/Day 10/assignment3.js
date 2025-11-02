const http = require('http')
const server = http.createServer((req,res) =>{
    res.writeHead(200,{'Content-Type':'text/html'});
    res.end("hello from Node JS Server");
    
});
server.listen(8080);
