//7.	Write a program to find whether given no.is Palindrome or not. 

import java.util.*;

class Palindrome{
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int num,rev=0,n;

		System.out.println("Enter Number to Reverse:-");
		num = n = sr.nextInt();

		for(;num>0;num/=10){
			rev= (rev*10)+(num%10);
		}
		if(rev!=n){
			System.out.print("Not ");
		}
		System.out.println("Palindrome Number");
	
	}
}