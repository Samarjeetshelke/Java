
//in this program the main will ends after the execution of the his child thread
class Thread2 extends Thread{

	int no ;
	String nm;
	Thread2(String str,int n){
		super(str);
		no = n;
		nm = str;
	}

	public void begin(){
		start();
	}

	public void run(){//This method will defines a working
		int i =1;

		while (i<=no) {
			System.out.println("Thread "+nm+" ");
			try{
				Thread.sleep(1000);
			}
			catch (Exception e) {
				
			}
			i++;
		}
	}

	public static void main(String[] args) {

		System.out.println("Main Thread");

		Thread2 a = new Thread2("A",3);

		Thread2 b = new Thread2("B",7);
		a.begin();
		b.begin();

		try{
			a.join();
			b.join();
		}
		catch(Exception e){

		}
		System.out.println("Main Ends");
	}
}