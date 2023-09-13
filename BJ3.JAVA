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
    String s1 ="Hello";
    String s2 ="World";
    System.out.println("First String: " +s1);
    System.out.println("Second String: " +s2);
    String j1 = s1.concat(s2);
    String j2 = s2.concat(s1);
    System.out.println("Joined first "+j1+"\n"+j2);
}
}