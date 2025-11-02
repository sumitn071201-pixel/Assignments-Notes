const http = require('http');
const { URL } = require('url');

let todos = [
    { id: 1, task: 'Read Carefully' },
    { id: 2, task: 'Implement' }
];

    const server = http.createServer(function (req, res) {
    const { method, url } = req;
    const parsedUrl = new URL(url, `http://${req.headers.host}`);
    const pathname = parsedUrl.pathname;

    if (method === 'GET' && pathname === '/todos') {
        res.writeHead(200, { 'Content-Type': 'application/json' });
        res.end(JSON.stringify(todos));
    } else if (method === 'GET' && pathname.startsWith('/todos/')) {
        const idStr = pathname.split('/')[2];
        const id = parseInt(idStr);

        const todo = todos.find(t => t.id === id);
        if (todo) {
            res.writeHead(200, { 'Content-Type': 'text/html' });
            res.end('<h1>Todo ID: ' + todo.id + '</h1><p>Task: ' + todo.task + '</p>');
        } else {
            res.writeHead(404, { 'Content-Type': 'text/html' });
            res.end('<h1>Todo not found</h1>');
        }
    } else {
        res.writeHead(404, { 'Content-Type': 'text/html' });
        res.end('<h1>Page not found</h1>');
    }
});

server.listen(3409, () => {
    console.log("server started on port 3409");
});
