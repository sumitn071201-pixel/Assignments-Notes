import java.util.Scanner;

public class TestArray2 {
	
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of array :");
	     int size=sc.nextInt();
		int arr[]=new int[size];
		ArrayService.acceptData(arr, size);
		ArrayService.displayData(arr);
		int choice;
		do {
		System.out.println("1. Search a number\n2. find max\n3. find min \n4. add all numbers\n5. find all occurances\n6. find nth maximum\n7. find nth minimum\n8.exit\n choice :");
		choice =sc.nextInt();
		
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter number for searching: ");
				int f=sc.nextInt();
				int pos=ArrayService.searchByValue(arr,f);
				if(pos!=-1) {
					System.out.println(f+" found at position "+pos);
				}
				else {
					System.out.println(f+" not found");
				}
			break;
				
			case 2:
				int max=ArrayService.findMaxNumber(arr);
				System.out.println("Maximum :"+ max);
			break;
			
			case 3:
				int min=ArrayService.findMinNumber(arr);
				System.out.println("Minimum :"+ min);
			break;
			
			case 4:
				int sum=ArrayService.addData(arr);
				System.out.println("Addition :" +sum);
			break;
				
			case 5:
				
				System.out.println("enter data to search");
				int num=sc.nextInt();
				int[] arrpos=ArrayService.findAllOccurences(arr, num);
				if(arrpos!=null) {
					System.out.println("all positions are : ");
					ArrayService.displayData(arrpos);
				}else {
					System.out.println("not found");
				}
			break;
				
			case 6:
				System.out.println("enter n");
				int n=sc.nextInt();
				int maxnum=ArrayService.findNthMax(arr,n);
				System.out.println(n+" Maximum value :  "+maxnum);
			break;
			
			case 7:
				System.out.println("enter n");
				n=sc.nextInt();
				int minnum=ArrayService.findNthMin(arr,n);
				System.out.println(n+" Maximum value :  "+minnum);
			break;
			
			case 8:
				System.out.println("thank you for visiting....");
				//System.gc();
				System.exit(0);
				
				
			 default:
				 System.out.println("Wrong choice");
			
			}
			
		   }
		while(choice!=8);
		
		sc.close();
		
	}

}
