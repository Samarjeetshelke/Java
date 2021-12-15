//2. Program to find maximum number between two numbers.

import java.util.*;


class Max{
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int num1,num2;

		System.out.println("\nEnter First NO:-");
		num1 = sr.nextInt();
		System.out.println("\nEnter Second NO:-");
		num2 = sr.nextInt();

		if(num1>num2){
			System.out.println("From "+num1+" And "+num2+ " ,The Maximun No Is:- "+num1);
		}
		else{
			System.out.println("From "+num1+" And "+num2+ " ,The Maximun No Is:- "+num2);
		}


		
	}
}