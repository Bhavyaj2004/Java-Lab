/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//wap to find max and min of a given aray in minimum lines.
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    int a[] = { 40, 55, 67, 38 };
    Arrays.sort(a);
  System.out.println("Min"+ a[0]);
  System.out.println("Max"+a[a.length-1]);
  }

}
