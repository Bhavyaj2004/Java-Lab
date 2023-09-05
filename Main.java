public class Main
{  
   
    public String name; 
    String division;  
    private int age;    
    public Main(String sname)  
    {  
        name = sname;  
    }  
  
    public void setDiv(String sdiv)  
    {  
        division = sdiv;  
    }  
       
    public void setAge(int sage)  
    {  
        age = sage;  
    }  
  

    public void printstud()  
    {  
        System.out.println("Student Name: " + name );  
        System.out.println("Student Division: " + division);   
        System.out.println("Student Age: " + age);  
    }  

    public static void main(String args[])  
    {  
        Main s = new Main("Monica");  
        s.setAge(14);  
        s.setDiv("B");  
        s.printstud();  
    }  
}  