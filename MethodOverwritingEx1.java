/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
// to demonstrate method overiding and inheritance.
*******************************************************************************/
class Shape{
    public void area(){
    System.out.println("It is Shape");   
   

}
}
class Circle extends Shape
{
    public void area(int r){
        System.out.println("Area of circle:"+r*3.14);
}
}
class Rectangle extends Shape
{
public void area(int a,int b){
    System.out.println("Area of rectangle:"+a*b);
    }
}
public class  MethodOverwritingEx1{
    public static void main(String [] args){
        Shape a = new Shape();
        Circle b = new Circle();
        Rectangle c=new Rectangle();
        a.area();
        b.area(5);
        c.area(5,8);
    }
}




    
       

