//1. Write a program to accept two numbers as command line arguments
//and print the addition of those numbers.

class CmdArg{
	public static void main(String [] args){

		int n = args.length;
		int dig1,dig2;
		int i = 1 ;
		if(n!=2){
			System.out.println("\nInvalid Argument--");
			return;
		}
		try{
			dig1 = Integer.parseInt(args[0]);
		
			dig2 = Integer.parseInt(args[1]);

			System.out.println("\nAddition:-\n"+dig1+"+"+dig2+"="+(dig1+dig2));
			
		}
		catch(Exception a){

			System.out.println("\nInvalid Arg:"+a);	
		}
		
		
	}
}