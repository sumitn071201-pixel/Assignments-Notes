const num = parseInt(process.argv[2]);
function factorial(n) {
    let result = 1;
    for(let i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}

console.log("Factorial is " + factorial(num));
