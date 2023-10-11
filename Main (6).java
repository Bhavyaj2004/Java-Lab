/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.


    *******************************************************************************/
 class FinalDemo{   
public final void display(){
        System.out.println("This is final method.");
    }
}
class Main extends FinalDemo{
    public final void display(){
        System.out.println("the final method is overriden.");
    }
    public static void main(String[]args){
        Main m=new Main();
        m.display();
    }
}