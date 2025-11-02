class CommandLineDemo{
	public static void main(String[] args){
	System.out.println("Number of Arguments:"+args.length);
	if(args.length<=0){
	System.out.println("Error: pass minimum 1 parameter");
	}
	else{
	for(int i=0;i<args.length;i++){
	System.out.println("Hello "+args[i]);
}
}
}
}