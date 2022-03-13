//13 march
//Samarjeet Shelke
import java.io.*;
class ss{
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		try{
				System.out.println("Your Laptop Is About To Shutdown");
				runtime.exec("shutdown -r -t 5");
	
		}
		catch (Exception e) {
			
		}
	}
}