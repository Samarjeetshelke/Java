
import java.util.*;

class Greet{

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int mrk;

		System.out.println("\nEnter Your Marks:-");
		mrk = sr.nextInt();

		if(mrk >= 90){
			System.out.println("Excellent");
		}
		else if(mrk >=80){
			System.out.println("Very Good");
		}
		else if(mrk >=70){
			System.out.println("Good");
		}
		else if(mrk >=60){
			System.out.println("Work Hard");
		}
		else if(mrk >=50){
			System.out.println("Poor");
		}
		else if(mrk >= 35){
			System.out.println("Vrey Poor");
		}
		else if(mrk >=1){
			System.out.println("Fail");
		}
		else{
			System.out.println("Invalid Input");
		}
	}

}