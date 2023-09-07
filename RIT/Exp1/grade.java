import java.util.*;

class grade{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("\nEnter the grade to gate the range: ");
		char ch =sc.next().charAt(0);//to get only one character form input

		switch(ch){
			case 'A':System.out.println("The range is: 89-100");
					break;

			case 'B':System.out.println("The range is: 79-88");
					break;

			case 'C':System.out.println("The range is: 69-78");
					break;

			case 'D':System.out.println("The range is: 40-68");
					break;
			default:System.out.println("below 40: Fail");
					break;
		}

		
	}
}