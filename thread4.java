// Multiple Thread
public class Main extends Thread{
    public static void main(String []args){
        Main thread1 =new Main();
        Main thread2 = new Main();
        Main thread3= new Main();
        
        Thread t1= new Thread(thread1);
        Thread t2=new Thread(thread2);
        Thread t3=new Thread(thread3);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("This code is outside of thread:");
    }
    public void run(){
        System.out.println("This code is running in a thread:");
    }
}