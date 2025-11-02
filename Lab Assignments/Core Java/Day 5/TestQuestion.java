
public class TestQuestion {

	public static void main(String[] args) {
	
		        Question[] qlst = {
		            new Question("1. What is a JVM?", "Virtual Machine", "Java Maker", "Java Module", "JavaScript VM", "A", 5),
		            new Question("2. Keyword for inheritance?", "this", "new", "extends", "implements", "C", 10),
		            new Question("3. Which is primitive type?", "String", "Integer", "char", "Object", "C", 2)
		        };
		        
		        Test t1 = new Test( 1001,"Software Basics Test", "2025-12-10 10:00", 3 );
		        
		        t1.addQuestion(qlst[0]);
		        t1.addQuestion(qlst[1]);
		        t1.addQuestion(qlst[2]);

				System.out.println(t1);
		        
		  
		        TestService.displayAllTests();
			}
		
	}


