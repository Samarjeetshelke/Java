/*
	NAME: Samarjeet Suresh Shelke
	RollNo: 196053
*/

import java.io.*;
import java.util.*;

class MonoAlpha{
	public static char normal[]
		= { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static char coded[]
		= { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O',
			'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K',
			'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M' };


	public static String toCipherText(String s)
	{
		
		String ct = "";


		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < 26; j++) {

				
				if (s.charAt(i) == normal[j])
				{
					 ct += coded[j];
					break;
				}

				if (s.charAt(i) < 'a' || s.charAt(i) > 'z')
				{
					 ct += s.charAt(i);
					break;
				}
			}
		}

	
		return ct ;
	}


	public static String toPlainText(String s)
	{
		
		String pt = "";

		
		for (int i = 0; i < s.length(); i++)
		{
			for (int j = 0; j < 26; j++) {

				if (s.charAt(i) == coded[j])
				{
					pt += normal[j];
					break;
				}

				
				if (s.charAt(i) < 'A' || s.charAt(i) > 'Z')
				{
					pt += s.charAt(i);
					break;
				}
			}
		}

		
		return pt;
	}
	public static void main(String args[])
	{
		Scanner sr = new Scanner(System.in);

		System.out.println("\nEnter Your Plain Text:-");
		String str = sr.nextLine();

		
		System.out.println("Plain text: " + str);

		String ct = toCipherText(str.toLowerCase());

		System.out.println("Encrypted message(Cipher Text): "
						+ ct);

		
		System.out.println("Decrypted message: "
			+ toPlainText(ct));
	
	}
}
