import java.util.Scanner;

public class TestArray2D2 {
	
	public static void main (String [] args) {

	int[][] arr=new int[3][];
	
	ArrayService2D2.acceptData(arr);
	ArrayService2D2.displayData(arr);
	Scanner sc=new Scanner(System.in);
	int choice=0;
	do {
	System.out.println("1. find max of all data\n2. find max rowwise");
	System.out.println("3. find max column wise\n4. find addition rowwise");
    System.out.println("5. find addition columnwise\n6.exit\n choice:");
    choice=sc.nextInt();
    switch(choice) {
    case 1:
    	int max=ArrayService2D2.findMax(arr);
    	System.out.println("Maximum of array : "+max);
    	break;
    case 2:
    	int[] maxrow=ArrayService2D2.findMaxRowwise(arr);
    	for(int x:maxrow) {
    		System.out.println("Max : "+x);
    	}
    	
    	break;
    case 3:
    	int[] maxcol=ArrayService2D2.findMaxColumnwise(arr);
    	for(int x:maxcol) {
    		System.out.println("Max : "+x);
    	}
    	
    	break;
   
    case 4:
    	int[] arradd=ArrayService2D2.addRowwise(arr);
		for(int val:arradd) {  
			System.out.println(val);
		}
    	
    	break;
    case 5:
    	 arradd=ArrayService2D1.addColumnwise(arr);
			for(int val:arradd) {  
				System.out.println(val);
			}
    	break;
    case 6:
    	System.out.println("Thank you for visiting......");
    	sc.close();
    	break;
    default:
    	System.out.println("wrong choice");
    		
    }
	}while(choice!=6);


}
}
