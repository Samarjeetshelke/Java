//3. Program to find odd or even number.

import java.util.*;

class OddEven{
	public static void main(String[] args){
		
		Scanner sr = new Scanner(System.in);
		int num;

		System.out.println("\nEnter The Number:-");
		num = sr.nextInt();

		if(num%2==0){
			System.out.println(" "+num+" is Even Number.");
		}	
		else{
			System.out.println(" "+num+" is Odd Number.");
		}	
	}	
}