import java.util.Scanner;

public class TestArray {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add New Test\n2. Display All Tests\n3. Exit\n choice :");
             choice = sc.nextInt();
            switch (choice) {
                case 1:
                    boolean status = TestService.addNewTest();
                    if (status)
                        System.out.println("\nTest added successfully!");
                    else
                        System.out.println("\nError: Test not added");
                    break;
                case 2:
                    TestService.displayAllTests();
                    break;
                case 3:
                    sc.close();
        
                    System.out.println("Thank you for visiting.......");
                    break;
                default:
                    {
                        System.out.println("Wrong choice.");
                    }
                    break;
            }
        } while (choice != 3);
    }
}