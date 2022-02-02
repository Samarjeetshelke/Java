import java.io.*;

class WChar{
	 public static void main(String[] args) {
		int val=0;
		FileWriter fw = null;
		try{
			fw = new FileWriter("abc.txt");
		}	
		catch(Exception e){
			System.out.println("Type Character: ");
			while(true){
				try{
					val = System.in.read();
					System.in.skip(5);
				}
				catch(Exception e){

				}
				if((char)val=="*"){
					break;
				}
				try{
					fw.write(val);
				}
				catch(Exception e){}
			}
			fw.close();
		
			
		}
	}
}