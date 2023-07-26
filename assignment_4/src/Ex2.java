import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //2.Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a K:");
        int K = input.nextInt();
        int[] array = {1, 4, 17, 7, 25, 3, 100};
        Arrays.sort(array);
        if (K > array.length) {
            System.out.println("Error: k is larger than the length of the array.");

        }else {

            int[] Klargest = new int[K];
            for (int i = array.length - 1, j = 0; i >= 0 && j < K; i--, j++) {
                Klargest[j] = array[i];
            }
//        System.out.println(Arrays.toString(Klargest));

            System.out.print(K + " largest elements of the said array are: ");
            for (int j : Klargest) {
                System.out.print(" " + j);

            }
        }
    }
}
