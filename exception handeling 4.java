import java.util.Scanner;
class Main{
    public static void main(String []args){
        String s= null;
        int a[]={10,20,30};
            try
    {System.out.println(a[2]);
            System.out.println(s.length());
            
            }
            catch(ArrayIndexOutOfBoundsException   e)
        {
            System.out.println("Exception Index Out Of Bounds "+e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("Exception Null Pointer :"+e.getMessage());
        }
    }
}
