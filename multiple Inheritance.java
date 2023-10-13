 class Automobile{
    public void start()
    {
        System.out.println("Engine starts running:");
    }
    public void stop()
    {
        System.out.println("Engine stops running:");
    }
    public void seatings(){}
}
class Car extends Automobile{
    public void No_of_tyres()
    {
        System.out.println("There are 4 tyres:");
    }
    public void fuel(){
        System.out.println("Petrol");
    }
    public void fuel(String fuel){
        System.out.println("also runs on diesel ");
    }
    public void seatings(){
        System.out.println("4 seatings");
    }
}
class Bike extends Automobile{
    public void No_of_tyres()
    {
        System.out.println("Thereare 2 tyres:");
    }
    public void fuel(){
        System.out.println("Petrol");
    }
    public void seatings(){
        System.out.println("2 seatings");
    }
}
public class Main{
    public static void main(String []args)
    {
        Automobile a= new Automobile();
        Car c= new Car();
        Bike b= new Bike();
        a.start();
        b.No_of_tyres();
        b.fuel();
        b.seatings();
        c.No_of_tyres();
        c.fuel();
        c.seatings();
}
}
