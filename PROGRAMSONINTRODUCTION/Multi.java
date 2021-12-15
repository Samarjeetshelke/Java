//9.	Program to display multiplication of given Number

import java.util.*;

class Multi{
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n;

		System.out.println("\nEnter The Number:-");
		n = sr.nextInt();

		System.out.println("The Table of "+n+" :-");

		for(int i = 1;i<=10;i++){
			System.out.print(" "+(n*i));
		}	
	}
}