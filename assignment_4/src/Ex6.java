import java.util.ArrayList;
import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {

        //6.Write a Java program to find all of the longest word in a given dictionary.

        String[] array = {"cat", "dog", "red", "is", "am"};
        ArrayList<String> longestWords = new ArrayList();

        int maxLength = 0;
        for (String s: array) {
            int length = s.length();
            if (length > maxLength) {
                maxLength = length;
                longestWords.clear();
                longestWords.add(s);
            } else if (length == maxLength) {
                longestWords.add(s);
            }
        }
        System.out.print("Result: ");
        for (String s:longestWords) {
            System.out.print(s+" ");

        }

    }
}
