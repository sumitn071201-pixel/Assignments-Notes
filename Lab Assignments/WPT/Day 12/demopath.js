const p = require('path');
const fs = require('fs');

console.log("Name " + __dirname);

const db = {
    properties: 'config.properties'
};


let config = p.join(__dirname, 'config', db.properties);

fs.readFile(config, 'utf8', (err, data) => {
      
    if (err) {
        console.error("Error reading file:", err);
        return;
    }
    console.log("File content:", data);
});