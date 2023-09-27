/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//wap to initialize the array and display it.
import java.util.*;
public class Main
{
    public static void main(String[] args){
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter no");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}