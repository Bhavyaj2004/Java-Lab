/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Animal{
    protected void display()
{
    System.out.println("I am an animal");
}
}
class Dog extends Animal {
    public static void main(String [] args) {
        Dog  dog=new Dog();
        dog.display();
    }
}

