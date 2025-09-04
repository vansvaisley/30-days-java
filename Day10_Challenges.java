package in.kgcoding.Exception;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("division");
        System.out.print("please enter the value of a:");
        int a= input.nextInt();
        System.out.print("enter the value of  b:");
        int b= input.nextInt();
       try{
           int ans=a/b;
           System.out.println(ans);

       }catch (ArithmeticException exception){
           System.out.println("you are dividing with 0 , please enter the valid value");
       }
    }
}
