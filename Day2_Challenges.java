import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        System.out.println(" Enter the value of a :");
        Scanner input=new Scanner(String.in);
         int a = input.nextInt();
        System.out.println(" Enter the value of b :");
        int b = input.nextInt();
        int temp=a;
             a=b;
             b=temp;
        System.out.println("Swapped numbers are :");
        System.out.println("a is"+ a);
        System.out.println("b is"+ b);
    }
}
