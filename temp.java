//Samarjeet Shelke -196053
/*

5.Write a programme to convert celsius to fahrenheit
f = (celsius × 9/5) + 32 ;
*/

import java.util.Scanner; //importing class

public class temp
{
    public static void main(String[] args)
    {

        Scanner obj = new Scanner(System.in);
        System.out.println("Convert Celsius To Fahrenheit\n");
	System.out.println("\nEnter the tempreture(Celsius):");
	int c = obj.nextInt();
	float f = (c * 9/5) + 32 ;
	System.out.println("\nThe Tempreture in fahrenheit is:- "+f +"F");

     }  
}