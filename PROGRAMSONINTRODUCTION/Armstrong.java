//6.	Write a program to find whether given no.is Armstrong or not. 
import java.util.*;

class Armstrong{
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int num,sum = 0,dig,n;

		System.out.println("\nEnter The Number:-");
		num =n = sr.nextInt();

		for(;num>0;num/=10){
			dig =  (num%10);
			sum = sum+(dig*dig*dig);
		}
		if(n!=sum){
			System.out.println(" \nNot");
		}
		System.out.println(" Armstrong Number.");
	}
}