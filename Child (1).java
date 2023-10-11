/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*************************************************************************/
class Parent {
    void display(){
        System.out.println("This is  a parent class");
    }
    void show(int num){
        System.out.println("The number is the parent class is:"+ num);
    }
}
class Child extends Parent{
    void display(){
        System.out.println("this is child class.");
    }
    void show(double num){
        num =9;
        System.out.println("The number is in child class"+num);
    }
}
public class Main(){
    public static void main(String []args){
        Parent parent=new Parent();
        Child child=new Child();
        parent.show(5);
        child.show(7.5);
        parent.display();
        child.display();
    }
}
