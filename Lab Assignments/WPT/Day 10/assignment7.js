function isPrime(num) {
  if (num <= 1) return false;
  for (let i = 2; i <= num / 2; i++) {
    if (num % i === 0) return false;
  }
  return true;
}

function data() {
  if (process.argv.length !== 12) {
    console.log("Please enter exactly 10 numbers.");
    return;
  }

  let arr = [];
  for (let i = 2; i < 12; i++) {
    arr.push(parseInt(process.argv[i], 10));
  }

  let sumEvenNumbers = 0;
  let sumEvenIndices = 0;
  let sumPrimeNumbers = 0;

  for (let i = 0; i < arr.length; i++) {
    let num = arr[i];

    if (num % 2 === 0) 
        {
            sumEvenNumbers += num;
        }

    if (i % 2 === 0)
        {
          sumEvenIndices += num;
        } 
    if (isPrime(num))
        {
           sumPrimeNumbers += num;
        } 
  }

  console.log("Array:", arr);
  console.log("Sum of even numbers:", sumEvenNumbers);
  console.log("Sum of numbers at even indices:", sumEvenIndices);
  console.log("Sum of prime numbers:", sumPrimeNumbers);
}

data();
