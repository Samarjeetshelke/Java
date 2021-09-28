//Samarjeet Shelke -196053
/*

3.Write a programme to calculate simple interest.
si = (p*r*t)/100

*/

import java.util.Scanner; //importing class

public class simpleinterest
{
	public static void main(String[] args)
	{
		int si;
		Scanner obj = new Scanner(System.in);
		System.out.println("\nEnter Principle Amount:-");
		int p = obj.nextInt();
		System.out.println("\nEnter Rate of interest:-");
		int r = obj.nextInt();
		System.out.println("\nEnter Time(year):-");
		int t = obj.nextInt();
		si = (p*r*t)/100;
		System.out.println("\nThe SImple Interest is:-"+si);	
		
	}
}