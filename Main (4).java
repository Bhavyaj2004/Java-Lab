/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Animal{
    public void eat(){
        System.out.println("I can eat");
    }
}
class Dog extends Animal{
    public void eat(){
        super.eat();
        System.out.println("I can eat dog food");
    }
    public void bark(){
        System.out.println("I can bark");
    }
}
class Main{
    public static void main(String []args){
        Dog labrador=new Dog();
        labrador.eat();
        labrador.bark();
    }
}
