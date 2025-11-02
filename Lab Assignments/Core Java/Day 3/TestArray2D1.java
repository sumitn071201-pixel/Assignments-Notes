import java.util.Scanner;

public class TestArray2D1 {

	public static void main(String[] args) {
		int[][] arr= {{4,5,6},{3,4,5},{1,2,3}};
		int[][] arr1= {{1,5,6},{3,2,7},{10,20,30}};
		Scanner sc=new Scanner(System.in);
		//ArrayService2D1.acceptData(arr);
		ArrayService2D1.displayData(arr);
		ArrayService2D1.displayData(arr1);
		int choice=0;
		do {
		System.out.println("1. add all numbers\n2. add rowwise\n3.columnwise addition");
		System.out.println("4. find max of all numbers\n 5. maximum rowwise\n6. find maximum columnwise");
		System.out.println("7. add 2 arrays\n8. multiply array\n9. find transpose of array");
		System.out.println("10. check identity matrix\n11. rotate matrix rows\n 12. rotate matrix columns");
		System.out.println("13. convert to 1D array\n 14. exit\nchoice : ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			int ans=ArrayService2D1.addAllNumbers(arr);
			System.out.println("Addition : "+ans);
			break;
		case 2:
			int[] arradd=ArrayService2D1.addRowwise(arr);
			for(int val:arradd) {  
				System.out.println(val);
			}
			break;
		case 3:
			 arradd=ArrayService2D1.addColumnwise(arr);
			for(int val:arradd) {  
				System.out.println(val);
			}
			break;
		case 4:
			 int all=ArrayService2D1.findMaxAllNumbers(arr);
			 System.out.println("Maximum number of all :" + all);
			break;
		case 5:
			int[]maxrow=ArrayService2D1.findRowwiseMax(arr);
			for(int val1:maxrow) {  
				System.out.println(val1);
			}
			break;
		case 6:
			int[]maxcol=ArrayService2D1.findColumnwiseMax(arr);
			for(int val2:maxcol) {  
				System.out.println(val2);
			}

			break;
		case 7:
			int[][] addition=ArrayService2D1.add2Darrays(arr,arr1);
			ArrayService2D1.displayData(addition);
			break;
		case 8:
			int[][] multiply=ArrayService2D1.multiplyArray(arr,arr1);
			if(multiply!=null) {
				ArrayService2D1.displayData(multiply);
			}else {
				System.out.println("multiplication not possible");
			}
			break;
		case 9:
			int[][] temp=ArrayService2D1.findTranspose(arr);
			ArrayService2D1.displayData(temp);
			break;
		case 10:
			boolean status=ArrayService2D1.checkIdentity(arr);
			if(status)  ///status==true
				System.out.println("It is identity matrix");
			else
				System.out.println("It is not identity matrix");
			break;
		case 11:
			System.out.println("Enter number of rotation");
			int n=sc.nextInt();
			int[][] newarr=ArrayService2D1.rotateRow(arr,n);
			ArrayService2D1.displayData(newarr);
			break;
		case 12:
			System.out.println("Enter number of rotation for column");
			n=sc.nextInt();
			newarr=ArrayService2D1.rotateColumn(arr,n);
			ArrayService2D1.displayData(newarr);
			break;
		case 13:
			int[] arr2=ArrayService2D1.convertTo1DArray(arr);
			for(int val:arr2) {
				System.out.print(val+",");
			}
			System.out.println();
			break;
		case 14:
			System.out.println("Thank you for visiting.....");
			break;
		default:
			System.out.println("choice is wrong");
			break;
		}
		}while(choice!=14);

	}

}
