/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class TwoDArr
{
    public static void main(String[] args){
        int[][]a={{30,50},{40,60},{70,90}};
        System.out.println("2D arr elements are: ");
        for(int i[]:a)
        {
            for(int j: i)
            {
                System.out.println(j+" ");
            }
            System.out.println();
	    }
	}
}
