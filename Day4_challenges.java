// Q.1 Prime or not
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

// Q.2  ArraySearching
import java.util.Scanner;
public class ArraySearching {
    public static void main(String[] args) {
        System.out.println("array searching");
        int arr[]={2,4,6,7,8,9};
        Scanner input=new Scanner(System.in);
        System.out.print("enter the element you want to search :");
        int num= input.nextInt();
        boolean isFound = ArraySearch(arr , num);
        if(isFound){
            System.out.println("element is found");
        }else{
            System.out.println("element is not found");
        }
    }
    public static boolean ArraySearch(int arr[] , int num){
        int i=0;
        while(i< arr.length){
            if(arr[i]==num){
                return  true;
            }
            i++;
        }
        return false;
    }
}





















