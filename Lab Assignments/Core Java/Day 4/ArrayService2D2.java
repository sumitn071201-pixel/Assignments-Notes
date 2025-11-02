import java.util.Scanner;

public class ArrayService2D2 {
	
	public static void acceptData(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
		//allocate columns dynamically for eveey row
		System.out.println("enter number of columns for row " +i);
		int col=sc.nextInt();
		arr[i]= new int[col];
		//accept data for each row 
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("enter value for "+i+" ,"+ j);
			arr[i][j]=sc.nextInt();	
         }
			
		}
		
	}
	
	public static void displayData(int [][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("-----------------");
	}
	
	public static int findMax(int [][]arr) {
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
			}
		}
		
		return max;
		
	}
	
	public static int[] findMaxRowwise(int [][] arr) {
         int [] temp =new int[arr.length];
         for(int i=0;i<arr.length;i++) {
        	 temp[i]=arr[i][0];
        	 for(int j=0;j<arr[i].length;j++) {
        		 if(temp[i]<arr[i][j]) {
        			 temp[i]=arr[i][j];
        		 }
             	 
              }
         }
         return temp;
       
	}
	
	public static int [] findMaxColumnwise(int [][] arr) {
		int maxlength=arr[0].length;
		for(int i=1;i<arr.length;i++) {
			if(maxlength<arr[i].length) {
				maxlength=arr[i].length;
			}
		}
		int[] temp=new int[maxlength];
		for(int i=0;i<arr.length;i++) {     
			for(int j=0;j<arr[i].length;j++) {
				if(temp[j]<arr[i][j]) {
					temp[j]=arr[i][j];
				}
				
			}
		}
		
    	return temp;
		
		
	}
	public static int[] addRowwise(int[][] arr) {
		int[] temp=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i]=0;
			for(int j=0;j<arr[i].length;j++) {
				temp[i]+=arr[i][j];
			}
		}
		return temp;
	}

	public static int[] addColumnwise(int[][] arr) {
		int[] temp=new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++) {  
			for(int j=0;j<arr.length;j++) {  
				temp[i]+=arr[j][i];
			}
		}
		return temp;
	}
	
		


}
