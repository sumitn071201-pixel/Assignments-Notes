import java.util.Scanner;
class AddNumbers{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter numbers for addition:");
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	System.out.println("Add:"+(n1+n2));
}
}