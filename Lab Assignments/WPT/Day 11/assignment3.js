const fs = require('fs');

console.log('--- Synchronous File Handling ---');

try {
  fs.writeFileSync('example_sync.txt', 'Hello, this is synchronous write!');
  const dataSync = fs.readFileSync('example_sync.txt', 'utf8');
  console.log('Synchronous read:', dataSync);

} catch (err) {
  console.error('Synchronous error:', err);
}

console.log('\n--- Asynchronous File Handling ---');

fs.writeFile('example_async.txt', 'Hello, this is asynchronous write!', (writeErr) => {
  if (writeErr) {
    console.error('Asynchronous write error:', writeErr);
    return;
  }

  fs.readFile('example_async.txt', 'utf8', (readErr, dataAsync) => {
    if (readErr) {
      console.error('Asynchronous read error:', readErr);
      return;
    }
    console.log('Asynchronous read:', dataAsync);
  });
});
