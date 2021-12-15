//10.	Write a program to find a given Number is Prime or not. 

import java.util.*;

class Prime{
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n,i=2;

		System.out.println("\nEnter The Number:-");
		n = sr.nextInt();

		while(i<n){
			if(n%i==0){
				break;
			}
			i++;
		}	
		if(i != n){
			System.out.print("\nNot");
		}
		System.out.print("Prime Number");
	}
}