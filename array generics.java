/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//wap to find max and min of a given aray in minimum lines.
import java.util.*;
import java.util.Collections;
public class Main
{
  public static void main (String[]args)
  {
    int a[]={1,2,3,4,5,6,7,8};
    Arrays.sort(a);
    for(int i:a)
    System.out.println(i);
    Collections.sort(a.Collections.reverseOrder());
    for(int i:a)
    System.out.println(i);
  }

}
