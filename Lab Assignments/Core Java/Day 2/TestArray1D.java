import java.util.Scanner;

public class TestArray1D {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size =sc.nextInt();
		int arr[]=new int[size];
		ArrayService1D.acceptData(arr, size);
		ArrayService1D.displayData(arr);
		int choice;

        do {
     
            System.out.println("1) Display all prime numbers from the array");
            System.out.println("2) Find addition of digits of odd numbers");
            System.out.println("3) Find factorial of all numbers which are less than 7");
            System.out.println("4) Find nth max prime number");
            System.out.println("5) Find nth min prime number");
            System.out.println("6) Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ArrayService1D.displayPrimes(arr);
                    break;
                case 2:
                	ArrayService1D.sumOfDigitsOfOddNumbers(arr);
                    break;
                case 3:
                	ArrayService1D. factorialsOfNumbersLessThanSeven(arr);
                    break;
                case 4:
                    System.out.print("Enter 'n' for nth maximum prime: ");
                    int nMax = sc.nextInt();
                    ArrayService1D.findNthMaxPrime(arr, nMax);
                    break;
                case 5:
                    System.out.print("Enter 'n' for nth minimum prime: ");
                    int nMin = sc.nextInt();
                    ArrayService1D.findNthMinPrime(arr, nMin);
                    break;
                case 6:
                    System.out.println("Exiting program. ");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }

	
	}


