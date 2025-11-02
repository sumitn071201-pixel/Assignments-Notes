import java.util.Scanner;
class TestFunction{
	public int factorial(int n){
	if(n<=1)
	return 1;
	else{
	int f=1;
	for(int i=1;i<=n;i++){
	f = f*i;
	}
	return f;
}
}
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number:");
	int n = sc.nextInt();

//	if the function is static function and within sameclas
//	int ans=factorial(n);
//	System.out.println("Factorial:" +ans);


//	if function is static function and in different class
//	ans=TestFunction.factorial(n);

//	if function is not static function
	TestFunction ob=new TestFunction();
	int ans=ob.factorial(n);
	System.out.println("factorial:"+ans);	
}
}