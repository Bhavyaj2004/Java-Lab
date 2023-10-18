import java.util.Scanner;
class Main{
    public static void main(String []args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int n=sc.nextInt();
            int divideByZero =5/0;
            System.out.println("REst of code in try block");
        }
        catch(ArithmeticException e){
            System.out.println("ArithematicException= "+e.getMessage());
        }
    }
}
