class CmdArg2{
	public static void main(String [] args){

		int n = args.length;
		int i = 1 ;

		if(n==0){
			System.out.println("\nInvalid Argument--");
			return;
		}
		try{
			System.out.println("\nYour Input Is:-"+(args[0]));
		}
		catch(Exception a){
			System.out.println("\nInvalid Arg:"+a);
			return;	
		}
		
	
	}
}