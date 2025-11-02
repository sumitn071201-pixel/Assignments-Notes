import java.util.Scanner;

public class ArrayService {
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
	
	public static int[] findAllOccurences(int arr[],int num) {
		int[] temp=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i] = -1;
		}
		int cnt =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				temp[cnt]=i;
				cnt++;
			}
		}
		if(cnt>0) {
			return temp;
		}
		else {
			return null;
		}
	}
	
	public static int findNthMin(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			int pos=findMinPos(arr,i);
			int temp = arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		return arr[n-1];
	}

	public static int findMinPos(int[] arr, int start) {
		int pos=start;
		int min=arr[pos];
		for(int i=start+1;i<arr.length;i++) {
			if(min>arr[i]) {
				pos=i;
				min=arr[i];
			}
		}
		return pos;
	}
	public static int findNthMax(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			int pos=findMaxPos(arr,i);
			int temp = arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		return arr[n-1];
	}

	public static int findMaxPos(int[] arr, int start) {
		int pos=start;
		int max=arr[pos];
		for(int i=start+1;i<arr.length;i++) {
			if(max<arr[i]) {
				pos=i;
				max=arr[i];
			}
		}
		return pos;
	}
	

}
