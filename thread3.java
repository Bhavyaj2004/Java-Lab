// Multiple Thread
public class Main extends Thread{
    public static void main(String []args){
        Main thread1 =new Main();
        Main thread2 = new Main();
        Main thread3= new Main();
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("This code is outside of thread:");
    }
    public void run(){
        System.out.println("This code is running in a thread:");
    }
}