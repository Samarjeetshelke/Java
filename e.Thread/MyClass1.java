class Th implements Runnable {
    public void run(){
        System.out.println("This is Thread! using Runnable Interface");
    }
}
public class MyClass1{
    public static void main(String args[]) {
        Th a = new Th();
        Thread t = new Thread(a);
        t.start();
    }
}

//Using Runnable Interface
