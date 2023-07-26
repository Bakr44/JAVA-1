import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
//        3.Write a Java program to find the numbers greater than the average of the numbers of a given array.
        int[] array = {1, 4, 17, 7, 25, 3, 100};

        int sum = 0;
        ArrayList<Integer> large = new ArrayList<>();
        for (int j : array) {
            sum += j;
        }
        double avg = sum / array.length;

        for (int n : array) {
            if (n > avg) {
                large.add(n);
            }
        }
        System.out.print("The average of the said array is: " + avg + " The numbers in the said array that are greater than the average are: ");
        for (int n : large) {
            System.out.print(" " + n);

        }

    }
}
