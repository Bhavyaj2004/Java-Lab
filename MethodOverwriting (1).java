/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
// to demonstrate method overiding and inheritance.
*******************************************************************************/
class Animal{
    public void init(){
    System.out.println("I am an animal");   
   

}
}
class Dog extends Animal
{
    public void init(){
        super.init();
        System.out.println("I am a dog");
}
public void bark(){
    System.out.println("bark!");
    }
}
public class  MethodOverwriting{
    public static void main(String [] args){
        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal c=new Dog();
        animal.init();
        dog.init();
        c.init();
        dog.bark();
    }
}




    
       

