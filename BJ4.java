/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner; 
public class Main
{
    public static void main (String[] args) {
    System.out.println("Enter a name");
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    System.out.println("Enter a Enroolment no. last three digit");
    int enroll = sc.nextInt();
    String e =String.valueOf(enroll);
    
    
    System.out.println("Enter a year of admission");
    int year = sc.nextInt();
    String y =String.valueOf(year);
    String id1 = y.concat(e);
    String id = n.concat(id1);
    System.out.println("ID :" + id +"@acropolis.in");
}
}