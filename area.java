//Samarjeet Shelke -196053
/*

4.Write a programme to FInd the Area of Rectangle ,Circle,Triangle
Area Of Circle:-PI * R*R;
Area Of Triangle:-l*h/2;
Area Of Rectangle:-l*w;
*/

import java.util.Scanner; //importing class

public class area
{
    public static void main(String[] args)
    {

        Scanner obj = new Scanner(System.in);
        System.out.println("\nMENU\n");
        System.out.println("\n1.Area Of Circle.\n2.Area Of Rectangle.\n3.Area Of Triangle.\nWhat Do You Want?");
        int opt = obj.nextInt();
        switch(opt)
	{
            case 1: circle();
                break;
            case 2: rectangle();
                break;
            case 3: triangle();
                  break;
            default: System.out.println("\nInvalid....");
                break;
        }

    }

    public static void circle()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("\nArea of circle\n");
        System.out.println("\nEnter the Radius:-");
        float r = obj.nextFloat();
        double a = (3.14*r*r)/2;
        System.out.println("\nThe Area Of Circle Is "+a+ "squnit");
    }

    public static void rectangle()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("\nArea of rectangle\n");
        System.out.println("Enter the width:-");
        float w = obj.nextFloat();
        System.out.println("Enter the heigth:-");
        float l = obj.nextFloat();
        float a = l*w;
        System.out.println("\nThe Area Of Rectangle Is "+a+"squnit");
    }

    public static void triangle()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("\nArea of triangle\n");
        System.out.println("Enter the base:-");
        float b = obj.nextFloat();
        System.out.println("Enter the heigth:-");
        float l = obj.nextFloat();
        float a = (l*b)*1/2;
        System.out.println("\nThe Area Of Triangle Is "+a+"squnit");
    }
}