import java.util.*;

class exp{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the x: ");
		int x=sc.nextInt();

		System.out.println("Enter the y: ");
		int y=sc.nextInt();

		if(x>0 && y>0){
			System.out.println("First Quadrant.");
		}
		else if(x>0 && y<0){
			System.out.println("Second Quadrant.");
		}
		else if(x<0 && y<0){
			System.out.println("Third Quadrant.");
		}
		else if(x<0 && y>0){
			System.out.println("Fourth Quadrant.");
		}
		else if(x==0&&y!=0){
			 System.out.println("On y axis");
		}
		else if(y==0&&x!=0){
			System.out.println("On z axis");
		}
		else{
			System.out.println("Center");
		}

			
	}
}