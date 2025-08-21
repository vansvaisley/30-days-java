import java.util.Scanner;
public class primeOrNOt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" prime or not ");
        System.out.print("enter a  number : ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
      if(isPrime){
          System.out.println("number is prime");
      }else{
          System.out.println("number is not prime");
      }

    }
//    make function
    public static boolean isPrime(int num) {
        int i = 2;
        if (num < 2) {
            return true;
        }
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
