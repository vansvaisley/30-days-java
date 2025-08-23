import java.util.Scanner;
public class fahrenheitToCelsius {
    public static void main(String[] args) {
        System.out.println("Converting temperature ");
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the temp in fahrenheit : ");
        float fah= input.nextFloat();
        float cel = (fah - 32) * 5 / 9;
        System.out.println(" Temp in celsius is : " + cel + "C");
        }

}
