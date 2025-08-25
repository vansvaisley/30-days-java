import java.util.Scanner;
public class numberGuessingGame {
    public static void main(String[] args) {
        System.out.println("welcome to number guessing game !");
        Scanner input = new Scanner(System.in);
        int num=5 , guess;
        do{
            System.out.println("please enter the number between 1 to 10 :");
            guess= input.nextInt();
        }while(num!=guess);{
        
            System.out.println("you have successfully guessed the number ");
        }
    }
}
