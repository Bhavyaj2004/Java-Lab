import java.util.*;
import java.util.Collections;
public class Main
{
  public static void main (String[]args)
  {
    String a[]={"Dagdi","chawl","Kahani"};boolean g=true;
    Scanner sc=new Scanner(System.in);
    String search =sc.next();
    for(String i:a){
        if(g=i.equals(search))
        break;
    }
    System.out.println(g);
}
}
