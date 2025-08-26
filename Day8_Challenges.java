public class carbo {
        int noOfWheels;
        String company;
        String modelNumber;
        int maxSpeed;
        int noOfDoors;

    public carbo(int maxSpeed ,int noOfWheels, String company , String modelNumber, int noOfDoors ) {
        this.maxSpeed = maxSpeed;
        this.company=company;
        this.modelNumber=modelNumber;
        this.noOfWheels=noOfWheels;
        this.noOfDoors=noOfDoors;

    }

    public static void main(String[] args) {
        carbo yaho=new carbo(120, 4, "MARUTI", "SWE345", 4);
        System.out.println(yaho.toString());
    }
}
