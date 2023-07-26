import java.util.ArrayList;
import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        //5.Write a Java program to swap the first and last elements of an array and create a new array.
        int[] array = {20, 30, 40};

        int[] newArray = Arrays.copyOf(array, array.length);

        int temp = newArray[0];
        newArray[0] = newArray[array.length - 1];
        newArray[array.length - 1] = temp;
        System.out.print("The array elements before swapping are: ");
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println(" ");

        System.out.print("The array elements after swapping are: ");
        for (int n : newArray) {
            System.out.print(n + " ");
        }
//        int firstnum =array[0],secondNum=array[array.length-1];
//        int temp;
//
//        temp =firstnum;
//        firstnum=secondNum;
//        secondNum=temp;


    }
}
