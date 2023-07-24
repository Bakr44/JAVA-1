import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        //2.Write a Java program to convert a given string into lowercase.
        System.out.println("please enter a string:");
        //Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
        String sentence = input.nextLine();
        System.out.println(sentence.toLowerCase());
    }
}
