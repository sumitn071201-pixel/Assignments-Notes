const input = process.argv[2];
const n = parseInt(input);

if (input < 1 || input > 5) {
  console.error('Error: Please enter a number between 1 and 5.');
 
}
else{   
printPattern(n);
}

function printPattern(n) {
  for (let i = 0; i < n; i++) {
    let line = '';
    for (let j = 0; j < n - i; j++) {
      line += '* ';
    }
    console.log(line.trim());
  }
}

