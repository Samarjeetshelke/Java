
import java.util.*;

class Fibonacci{
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int a = 0,b = 1,c,num;

		System.out.println("Enter The Number:-");
		num = sr.nextInt();

		System.out.println("\nThe Fibonacci Serise:-\n"+a+"\n"+b);
		for(int i = 0;i<num;i++){
			c = a+b;
			System.out.println("\n"+c);
			a = b;
			b = c;
		}

	}
}