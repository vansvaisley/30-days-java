import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        System.out.println(" enter the first number");
        Scanner input=new Scanner(String.in);
         int a = input.nextInt();
        System.out.println(" enter the second number");
        int b = input.nextInt();
        int temp=a;
             a=b;
             b=temp;
        System.out.println("swapped numbers are :");
        System.out.println("a is"+ a);
        System.out.println("b is"+ b);
    }
}
