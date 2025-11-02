const http = require('http');
const url = require('url');

const server = http.createServer(function(req, res) {
  const query = url.parse(req.url, true).query;
   const fName = query.fName;
  const lName = query.lName;
  res.writeHead(200, { 'Content-Type': 'text/html' });

  if (fName) {
    res.write("<h1>Hello " + fName + "</h1>");
  } else {
    res.write("<h1>Hello Guest</h1>");
  }

  res.end();
});

server.listen(3000, function() {
  console.log("Server running at http://localhost:3000");
});
