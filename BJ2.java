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
    System.out.println("Enter a string");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println("Enter choice 0 for Uppercase 1 for Lowercase:");
    int i = sc.nextInt();
    switch(i){
        case 0:{
            System.out.println(s.toUpperCase());
            break;
        }
        case 1:{
            System.out.println(s.toLowerCase());
            break;
        }
        default:{
            System.out.println("Invalid Choice");
        }
    }
}
}