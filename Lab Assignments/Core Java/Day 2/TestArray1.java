import java.util.Scanner;
public class TestArray1 {
	public static void acceptData(int arr[],int n) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Data: ");
			arr[i]=sc.nextInt();
		}
	}
	
	//return smallest number from array
	public static int findMinNumber(int arr[]) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}return min;
		
	}
	
	public static int findMaxNumber(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}return max;
	}

	public static void displayData(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Array :"+arr[i]);
		}
	}
	
	public static int addData(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}return sum;
	}
	
	public static int searchByValue(int arr[],int f) {
		for(int i=0;i<arr.length;i++) {
			if(f==arr[i]) {
				return i;
			}
		}return -1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size =sc.nextInt();
		int arr[]=new int[size];
		acceptData(arr, size);
		displayData(arr);
		System.out.println("Addition:"+addData(arr));
		System.out.println("Min number in array: "+findMinNumber(arr));
		System.out.println("Max number in array: "+findMaxNumber(arr));
		System.out.println("Enter number for searching: ");
		int f=sc.nextInt();
		int pos=searchByValue(arr,f);
		if(pos!=-1) {
			System.out.println(f+" found at position "+pos);
		}
		else {
			System.out.println(f+" not found");
		}
		
		sc.close();
	}

}
