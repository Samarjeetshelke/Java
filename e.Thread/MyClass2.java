class Th implements Runnable {
    public void run(){
        System.out.println("This is Thread! using Runnable Interface");
        
    }
}
public class MyClass2{
    public static void main(String args[]) {
        Th a = new Th();
        Thread t = new Thread(a,"First Thread");//Name to Thread
        t.start();
        System.out.println(t.getName());
    }
}
//getName():- To get The Name of Thrad
