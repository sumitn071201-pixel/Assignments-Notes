import java.util.Scanner;

public class ArrayService1D {

    public static void acceptData(int[] arr, int size) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter " + size + " integer elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element [" + i + "]: ");
            arr[i] = sc.nextInt();
        }
    }

    public static void displayData(int[] arr) {
        System.out.println("\n--- Array Elements ---");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void displayPrimes(int[] arr) {
        boolean found = false;
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No prime numbers found in the array.");
        }
        System.out.println();
    }

    public static void sumOfDigitsOfOddNumbers(int[] arr) {
        for (int num : arr) {
            if (num % 2 != 0) {
                int originalNum = num;
                int sum = 0;
                int temp = Math.abs(num);
                while (temp != 0) {
                    sum += temp % 10;
                    temp /= 10;
                }
                System.out.println("Number: " + originalNum + ", Sum of Digits: " + sum);
            }
        
    }
    }

    public static void factorialsOfNumbersLessThanSeven(int[] arr) {
        boolean found = false;
        for (int num : arr) {
            if (num >= 0 && num < 7) {
                long factorial = 1;
                for (int i = 2; i <= num; i++) {
                    factorial *= i;
                }
                System.out.println("Number: " + num + ", Factorial: " + factorial);
                found = true;
            }
        }
        if (!found) {
             System.out.println("No non-negative numbers less than 7 found in the array.");
        }
    }


        public static void findNthMaxPrime(int[] arr, int n) {
            int primeCount = 0;
            int[] uniquePrimesTemp = new int[arr.length];

            for (int num : arr) {
                if (isPrime(num)) {
                    boolean isDuplicate = false;
                    for (int i = 0; i < primeCount; i++) {
                        if (num == uniquePrimesTemp[i]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        uniquePrimesTemp[primeCount] = num;
                        primeCount++;
                    }
                }
            }

            if (primeCount == 0) {
                System.out.println("No prime numbers found in the array.");
                return;
            }

            int[] uniquePrimes = new int[primeCount];
            for (int i = 0; i < primeCount; i++) {
                uniquePrimes[i] = uniquePrimesTemp[i];
            }

            for (int i = 0; i < primeCount - 1; i++) {
                for (int j = 0; j < primeCount - i - 1; j++) {
                    if (uniquePrimes[j] < uniquePrimes[j + 1]) {
                        int temp = uniquePrimes[j];
                        uniquePrimes[j] = uniquePrimes[j + 1];
                        uniquePrimes[j + 1] = temp;
                    }
                }
            }

            if (n > 0 && n <= primeCount) {
                int nthMaxPrime = uniquePrimes[n - 1];
                System.out.println("The " + n + "th maximum prime is: " + nthMaxPrime);
            } else {
                System.out.println("Error: The array has only " + primeCount + " unique prime number(s). Cannot find the " + n + "th maximum.");
            }
        }

        public static void findNthMinPrime(int[] arr, int n) {
            int primeCount = 0;
            int[] uniquePrimesTemp = new int[arr.length];

            for (int num : arr) {
                if (isPrime(num)) {
                    boolean isDuplicate = false;
                    for (int i = 0; i < primeCount; i++) {
                        if (num == uniquePrimesTemp[i]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        uniquePrimesTemp[primeCount] = num;
                        primeCount++;
                    }
                }
            }

            if (primeCount == 0) {
                System.out.println("No prime numbers found in the array.");
                return;
            }

            int[] uniquePrimes = new int[primeCount];
            for (int i = 0; i < primeCount; i++) {
                uniquePrimes[i] = uniquePrimesTemp[i];
            }

            for (int i = 0; i < primeCount - 1; i++) {
                for (int j = 0; j < primeCount - i - 1; j++) {
                    if (uniquePrimes[j] > uniquePrimes[j + 1]) {
                        int temp = uniquePrimes[j];
                        uniquePrimes[j] = uniquePrimes[j + 1];
                        uniquePrimes[j + 1] = temp;
                    }
                }
            }

            if (n > 0 && n <= primeCount) {
                int nthMinPrime = uniquePrimes[n - 1];
                System.out.println("The " + n + "th minimum prime is: " + nthMinPrime);
            } else {
                System.out.println("Error: The array has only " + primeCount + " unique prime number(s). Cannot find the " + n + "th minimum.");
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
