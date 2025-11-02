// server.js
const http = require('http');
const url = require('url');

const server = http.createServer((req, res) => {
    // Parse the URL and query parameters
    const parsedUrl = url.parse(req.url, true); // true to parse query
    const query = parsedUrl.query;

    const fName = query.fName || 'Guest';
    const lName = query.lName || '';

    // Set content type
    res.writeHead(200, { 'Content-Type': 'text/html' });

    // Send HTML response
    res.end(`<h1>Hello ${fName} ${lName}</h1>`);
});

// Server listens on port 8080
server.listen(8080, () => {
    console.log('Server running at http://localhost:8080');
});
