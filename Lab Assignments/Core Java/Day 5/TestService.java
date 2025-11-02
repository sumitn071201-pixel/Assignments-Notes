import java.util.Scanner;

public class TestService {
    
    static Test[] tarr;
    static int testCount;
    static int nextTestId = 101;
    
    static Scanner scanner; 
   
    

    static {
        tarr = new Test[10]; 
        testCount = 0;
        
        scanner = new Scanner(System.in); 
        
        Test sampleTest1 = new Test( nextTestId++,"Java Basics Quiz", "2025-10-15 10:00", 5);
        sampleTest1.addQuestion(new Question("1. What is a JVM?", "Virtual Machine", "Java Maker", "Java Module", "JavaScript VM", "A", 5));
        sampleTest1.addQuestion(new Question("2. Keyword for inheritance?", "this", "new", "extends", "implements", "C", 10));
        sampleTest1.addQuestion(new Question("3. Which is primitive type?", "String", "Integer", "char", "Object", "C", 2));
        sampleTest1.addQuestion(new Question("4. Final variable is a/an:", "Constant", "Method", "Class", "Package", "A", 3));
        sampleTest1.addQuestion(new Question("5. The default value for int is:", "null", "0", "1", "undefined", "B", 2));
        tarr[testCount++] = sampleTest1;
        
        Test sampleTest2 = new Test(nextTestId++,"Data Structures Test", "2025-11-01 14:30", 5);
        sampleTest2.addQuestion(new Question("6. LIFO principle is used in?", "Queue", "Stack", "List", "Tree", "B", 8));
        sampleTest2.addQuestion(new Question("7. An array is a collection of:", "Different types", "Same data types", "Objects", "Methods", "B", 5));
        sampleTest2.addQuestion(new Question("8. The time complexity of accessing an element in an array is:", "O(n)", "O(n^2)", "O(1)", "O(log n)", "C", 5));
        tarr[testCount++] = sampleTest2;

        Test sampleTest3 = new Test(nextTestId++, "Database Concepts", "2025-11-10 09:00", 5);
        sampleTest3.addQuestion(new Question("9. SQL stands for:", "Structured Query Language", "Simple Query Logic", "Sequential Query Link", "Standard Question Logic", "A", 4));
        sampleTest3.addQuestion(new Question("10. Primary key must be:", "Duplicate", "Unique", "Null", "Foreign", "B", 3));
        tarr[testCount++] = sampleTest3;
    }

    public static boolean addNewTest() {
        if (testCount >= tarr.length) { 
            System.out.println("\nError: Maximum test limit reached (" + tarr.length + "). Cannot add new test.");
            return false;
        }

        System.out.println("\n--- Add New Test ---");
        int currentId = nextTestId++;
        
        System.out.print("Enter Test Name: ");
        String name = scanner.nextLine(); 
        System.out.print("Enter Test Date/Time (e.g., 2025-10-15 10:00): ");
        String date = scanner.nextLine(); 

        System.out.print("How many questions will be in this test (Max 50)? ");
        int maxQuestions = 0;
        try {
            maxQuestions = Integer.parseInt(scanner.nextLine().trim()); 
            if (maxQuestions > 50) { 
                System.out.println("Warning: Limiting to maximum of 50 questions.");
                maxQuestions = 50; 
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Assuming 0 questions.");
        }
        
        Test newTest = new Test(currentId, name, date, maxQuestions);
        
        String addMoreQuestions = "y";
        int i = 0;
        
      
            System.out.println("\n--- Adding Question " + (i + 1) + " of " + maxQuestions + " ---");
            
            System.out.print("Enter Question Text: ");
            String qText = scanner.nextLine(); 
            System.out.print("Enter Option A: ");
            String optA = scanner.nextLine(); 
            System.out.print("Enter Option B: ");
            String optB = scanner.nextLine(); 
            System.out.print("Enter Option C: ");
            String optC = scanner.nextLine(); 
            System.out.print("Enter Option D: ");
            String optD = scanner.nextLine(); 
            System.out.print("Enter Correct Answer (A/B/C/D): ");
            String answer = scanner.nextLine().toUpperCase().trim(); 
            System.out.print("Enter Marks for this question: ");
            int marks = 0;
            try {
                marks = Integer.parseInt(scanner.nextLine().trim()); 
            } catch (NumberFormatException e) {
                marks = 1;
            }

            Question q = new Question(qText, optA, optB, optC, optD, answer, marks);
            newTest.addQuestion(q);
            i++;

            if (i < maxQuestions) {
                System.out.print("Do you want to add more questions (y/n)? ");
                addMoreQuestions = scanner.nextLine();
            } else {
                System.out.println("Maximum questions for this test reached.");
                addMoreQuestions = "n";
            }
        
        tarr[testCount] = newTest;
        testCount++;
        System.out.println("\nTest '" + name + "' (ID: " + currentId + ") added successfully!");
        return true;
    }

    public static void displayAllTests() {
     
    	for(Test t:tarr) {
			if (t!=null)
			{
				System.out.println(t);
			}else {
				break;
			}
		}
    }
    
   
}