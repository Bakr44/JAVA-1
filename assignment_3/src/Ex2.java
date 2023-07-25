import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //2.Write a Java program to reverse a string.
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=input.nextLine();
        String reverseStr="";

        for (int i = str.length()-1 ; i >=0 ; i--) {
            reverseStr += str.charAt(i);
        }
        System.out.println(reverseStr);
    }
}
