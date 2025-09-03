public class car {
//instance variables
    int noOfWheels;
    String colour;
    float maxSpeed;
    float currentFuelInLitres;
//    default constructor
    car(){
        noOfWheels=4;
        colour="blue";
        maxSpeed=160;
    }
//    parametrized constructor
    car(String colour){
        noOfWheels=5;
        maxSpeed=90;
    }


//methods
    public car start(){
        System.out.println("car is starting.....");
        return this;
    }
    public void drive(){
        System.out.println("car is driving..");
        currentFuelInLitres--;
    }
public void addFuel( float fuel){
        currentFuelInLitres+=fuel;
}
public float getCurrentFuelLevel(){
        return currentFuelInLitres;
}

    public static void main(String[] args) {
        car Mycar=new car(); // default constructor call
        car thar=new car("red"); // parametrized constructor call
        Mycar.addFuel(7);
        Mycar.start().drive();  //chaining because of this keyword!
        System.out.println(Mycar.getCurrentFuelLevel());
    }
}
