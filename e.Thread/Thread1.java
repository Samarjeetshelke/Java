

class Thread1 extends Thread{
	
	int no ;
	String nm;
	Thread1(String str,int n){
		super(str);
		no = n;
		nm = str;
	}

	public void begin(){
		start();
	}

	public void run(){//This method will defines a working
		int i =1;

		while (i<=10) {
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

		Thread1 a = new Thread1("A",3);

		Thread1 b = new Thread1("B",7);
		a.begin();
		b.begin();
		System.out.println("Main Ends");
	}
}