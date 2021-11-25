

class CmdArg{
	public static void main(String [] args){

		int n = args.length;
		int i = 1 ;
		if(n!=1){
			System.out.println("\nInvalid Argument--");
			return;
		}
		try{
			n = Integer.parseInt(args[0]);
			System.out.println("\nTables:-");
			for (;i<=10 ;i++){
				System.out.println("\n"+(n*i));
			}

		}
		catch(Exception a){
			System.out.println("\nInvalid Arg:"+a);	
		}
		
		
	}
}