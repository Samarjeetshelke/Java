public class MyClass3 extends Thread{    
 public void run(){    
  for(int i=1;i<5;i++){   
  // the thread will sleep for the 500 milli seconds   
    try{Thread.sleep(500);}
    catch(InterruptedException e){System.out.println(e);}    
    System.out.println(i);    
  }    
 }    
 public static void main(String args[]){    
  MyClass3 t1=new MyClass3();    
  MyClass3 t2=new MyClass3();    
     
  t1.start();    
  t2.start();    
 }    
}    
//SO it will run the first iteraion of thread 1 and then first iteration of thread2//#if we call the start() method
/*
Output:
1
1
2
2
3
3
4
4


*/
