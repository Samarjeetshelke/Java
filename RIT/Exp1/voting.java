import java.util.*;

class voting{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;

		System.out.println("\nEnter your age: ");
		age=sc.nextInt();


		if(age>18){
			System.out.println("\nYou are eligible for voting..");
		}
		else{
			System.out.println("\nYou are not eligible for voting..");
		}
	}
}
