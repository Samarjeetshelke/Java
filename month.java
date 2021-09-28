//Samarjeet Shelke -196053
/*

6.Write a programme to convert days into the month and days
month = (days/30);
days = (days%30);
*/

import java.util.Scanner; //importing class

public class month
{
    public static void main(String[] args)
    {

        Scanner obj = new Scanner(System.in);
        System.out.println("Convert Celsius To Fahrenheit\n");
	System.out.println("\nEnter the Days:");
	int d = obj.nextInt();
	int month = (d/30);
	int day = (d%30);
	System.out.println("\n\n"+month+" Months And "+day+" Days");

     }  
}