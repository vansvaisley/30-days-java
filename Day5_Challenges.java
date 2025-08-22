// maximum and minimum in an array
import java.util.Scanner;
public class maximumAndMinimum {
    public static void main(String[] args) {
        System.out.println("maximum and minimum in an array ");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the no. of elements :");
        int size = input.nextInt();
        int[]nums=new int[size];
        int i=0;
        while(i<size){
            System.out.print("enter element no " + (i+1) + " :" );
            nums[i]= input.nextInt();
            i++;
        }
       int max=maximum(nums);
        System.out.println("maximum number is is :" + max);
        int min=minimum(nums);
        System.out.println("minimum number is is :" + min);
    }
    public  static  int maximum(int[] numArr) {
        int max=numArr[0];
        for(int i=1;i<numArr.length;i++){
            if(max<numArr[i]){
                max=numArr[i];
            }
        }
        return max;
    }
    public  static  int minimum(int[] numArr) {
        int min=numArr[0];
        for(int i=1;i<numArr.length;i++){
            if(min>numArr[i]){
                min=numArr[i];
            }
        }

        return min;
    }
}

// no. of occurrences

import java.util.Scanner;

public class noOfOccurrences {
    public static void main(String[] args) {
        System.out.println("number os occurrences ");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the no. of elements :");
        int size = input.nextInt();
        int[]nums=new int[size];
        int i=0;
        while(i<size){
            System.out.print("enter element no " + (i+1) + " :" );
            nums[i]= input.nextInt();
            i++;
        }
        System.out.print("enter the number you want to find :");
        int num= input.nextInt();
        int occ= occurrences(nums,num);
        System.out.println("no of occurrences are :" + occ);
    }
    public static int occurrences(int numarr[], int num){
        int i=0;
        int count=0;
        while(i<numarr.length){
           if(numarr[i]==num){
               count++;
           }
           i++;
        }
        return  count;
    }

}

