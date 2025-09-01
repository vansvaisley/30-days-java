import javax.swing.*;
class car{
    //instance variables;
    int noOfWheels;
    String colour;
    float maxSpeed;
    float currFuelLevelinLiteres;
    int noOfSeats;

    //    constructor
    // Parameterized Constructor
    car(String colour){
        this.colour=colour;
        noOfSeats=6;
        maxSpeed=67;
        currFuelLevelinLiteres=6;
    }
  // Default Constructor
    car(){
        this.colour="blue";
        noOfSeats=6;
        maxSpeed=67;
        currFuelLevelinLiteres=6;
    }
// instance method
    public void drive(){
        System.out.println("car is driving !");
        currFuelLevelinLiteres--;
    }
    public void addFuel(float fuel){
        currFuelLevelinLiteres+=fuel;
    }
    public float getcurrFuelLevel(){
         return currFuelLevelinLiteres;
    }

}
public class OOPs {
    public static void main(String[] args) {
        car lambo = new car();
        car maruti = new car("Red");
        lambo.addFuel(6);
        lambo.drive();
        System.out.println(lambo.getcurrFuelLevel());
        System.out.println(lambo.colour);
        System.out.println(maruti.colour);
    }

}
