import java.util.*;

class facto{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nEnter the Number: ");
		int n=sc.nextInt();

		int facto=1;

		System.out.println("the Series: ");
		for(int i=1;i<=n;i++)
		{
			
			facto*=i;
			System.out.println(facto);	

		}
		System.out.println("\nThe factorial of "+n+" is :"+facto);

	}
}