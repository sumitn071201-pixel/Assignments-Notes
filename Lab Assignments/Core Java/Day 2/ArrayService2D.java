import java.util.Scanner;
public class ArrayService2D {

	public static void acceptData(int[][]arr) {
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			System.out.println("enter data for row " + i + " column :" +j);
			arr[i][j]=sc.nextInt();
			}
		}
	}
	
	public static void displayData(int[][]arr) {
	 for(int i=0 ;i<arr.length;i++) {
		 for(int j=0;j<arr.length;j++) {
			 System.out.print(arr[i][j] + "\t");
		 } 
		 System.out.println();
	 }
	}
}
 