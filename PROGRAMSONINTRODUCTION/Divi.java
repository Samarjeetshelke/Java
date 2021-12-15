//11.	Write a program to check whether the given number is divisible by 5 or not. 
import java.util.*;

class Divi{
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int num;

		System.out.println("\nEnter The Number:-");
		num = sr.nextInt();

		if(num%5!=0){
			System.out.println("\nNot");	
		}
		System.out.println("Divisible by 5");
	}
}