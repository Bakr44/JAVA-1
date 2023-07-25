import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine().toLowerCase();

        boolean isPalindrome=true;

        for (int i = 0,j=word.length()-1; i <j ; i++,j--) {
            if (word.charAt(i) != word.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
            if (isPalindrome) {
                System.out.println(word +" is a palindrome");

            }else {
                System.out.println(word+" is not a palindrome");
            }



    }
    }

