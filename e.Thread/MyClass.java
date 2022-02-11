class Th extends Thread {
    public void run(){
        System.out.println("This is Thread!");
    }
}
public class MyClass{
    public static void main(String args[]) {
        Th a = new Th();
        a.start();
    }
}
