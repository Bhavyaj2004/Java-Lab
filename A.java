import java.util.Scanner;
class  A implements Runnable{
    public void run(){
        try{
            System.out.println("eternal sunshine");
            Thread.sleep(100);
        }
        catch(Exception e){
            System.out.println("of nature");
        }
    }
    public static void main(String[]args){
        for(int i=0;i<5;i++){
            Thread t1= new Thread(new A());
            t1.start();
        }
    }
}