/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class TwoDArr
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[][]a=new int[2][2];
        System.out.println("2D arr elements are: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println();
	    }
	    for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
	    }
	}
}
