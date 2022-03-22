//There always a thread in each program the main thread

class MyThread{
	public static void main(String[] args) {
			System.out.println("Main Start");

			Thread th = Thread.currentThread();
			System.out.println("Name: "+th.getName());//returns a name 
			System.out.println("Alive: "+th.isAlive());//return true or false
			System.out.println("Priority: "+th.getPriority());//return a priority
			try{
				Thread.sleep(2000);//in mlisec //it stops a thread for 2 sec
			}
			catch (Exception e) {
				
			}
			System.out.println(th.toString());//it return all the info like Thread[thread name,Priority,group or from where we call];
			System.out.println("Main Ends");
		}	
}