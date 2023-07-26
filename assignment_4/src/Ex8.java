import java.util.ArrayList;
import java.util.Collections;

public class Ex8 {


    public static void main(String[] args) {
        //8. Write a program thats displays the number of occurrences of an element in the array.

        int[] array = {1,1,1,3,3,5};
        int[] num = {3,1,9};
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        for (int n : array) {
            newArray.add(n);
        }

        for (int n : num) {
            int count = Collections.frequency(newArray, n);
            System.out.println(n + " occurs " + count + " time" + (count != 1 ? "s" : ""));
        }
    }
}

