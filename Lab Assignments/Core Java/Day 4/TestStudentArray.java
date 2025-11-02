import java.util.Scanner;

public class TestStudentArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. add new student\n2. display all\n3. search by id");
		System.out.println("4. search by name\n5. update marks\n6.exit\nchoice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			boolean status =StudentService.addNewStudent();
			if(status) {
				System.out.println("Student added successfully");
			}else {
				System.out.println("Error : Not added");
			}
		case 2:
			StudentService.displayAll();
			
		case 3:
			int id=sc.nextInt();
			Student s=StudentService.findById(id);
			 if (s != null) {
		            System.out.println("Found Student: " + s);
		        } else {
		            System.out.println("Student not found.");
		        }
		case 4 :
			sc.nextLine();
			String nm=sc.nextLine();
			 Student []s1=StudentService.findByName(nm);
			 if (s1 != null) {
		            System.out.println("Found Student: " + s1);
		        } else {
		            System.out.println("Student not found.");
		        }
		case 5:
			System.out.println("Enter id ");
			id=sc.nextInt();
			System.out.println("Enter marks1 ");
			float m1=sc.nextFloat();
			System.out.println("Enter marks2 ");
			float m2=sc.nextFloat();
			boolean status1=StudentService.updateMarks(id, m1, m2);
			if (status1) {
	            System.out.println("Marks updated successfully .");
	        } else {
	            System.out.println("Failed to update marks.");
	        }
			
		case 6:
			sc.close();
			System.out.println("Thankyou for visiting .... ");
		default:
			System.out.println("wrong choice");
			
		}
		
		
		}while(choice!=6);
	}

}
