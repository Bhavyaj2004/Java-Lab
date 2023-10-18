import java.util.Scanner;
class Main{
    public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any integer");
            try
            {
                int n= Integer.parseInt(sc.nextLine());
                if(99%n==0)
            System.out.println(n+"is afctor of 99");
            }
            catch(ArithmeticException ex)
            {
            System.out.println("Arithmetic"+ex);
        }
        catch(NumberFormatException ex){
            System.out.println("NumberFormatException= "+ex);
        }
    }
}
