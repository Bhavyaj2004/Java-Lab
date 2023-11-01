import java.util.Scanner;
class ThreadCount extends Thread{
    ThreadCount(String s){
        super(s);
        System.out.println("New thread created:"+this);
        start();
    }
    public void run(){
        try{
            for(int i=0;i<10;i++)
            {
                System.out.println("New thred created:");
                Thread.sleep(1200);
            }
        }
        catch(Exception e){
            System.out.println("Currentley executed thread is intruppted.");
        }
        System.out.println("Before Sunrise");
    }
    public static void main(String[]args){
        ThreadCount t1= new ThreadCount("Midnight");
        ThreadCount t2= new ThreadCount("Sunset");
        ThreadCount t3= new ThreadCount("After Sunset");
        
    }
        
        }