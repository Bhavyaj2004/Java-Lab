import java.util.Scanner;
class Table extends Thread{
    public static void main(String[]rgs){
        
        Table t=new Table();
        Table t2=new Table();
        Table t3=new Table();
        t.start();
        t2.start();
        t3.start();
    }
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any natural no:");
        int n=sc.nextInt();
        for(int i=1;i<=5;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}