  interface solution{
     public void Hello();
     public void Welcome();
     public void Name(String n);
 }
  class A implements solution{
     public void Hello(){
         java.lang.System.out.println("Hello World");
     }
 
    public void Welcome()
    {
        System.out.println("Welcome to Edureka");
    }
    public void Name(String n){
    System.out.println("I am " + n);
 }
 }
    public class Main{
    public static  void main (String[] args){
        A a= new A();
        a.Hello();
        a.Welcome();
        a.Name("BHavya Jain");
    }
 }
        
  