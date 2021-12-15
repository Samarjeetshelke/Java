
import java.util.*;

class Reverse{
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int num,rev=0;

		System.out.println("Enter Number to Reverse:-");
		num = sr.nextInt();

		for(;num>0;num/=10){
			rev= (rev*10)+(num%10);
		}
		System.out.println("The Reverse Number:- "+rev);
	}
}