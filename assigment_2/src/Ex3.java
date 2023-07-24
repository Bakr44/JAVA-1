import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
    //3.Write a Java program that takes a string and a number from the user,then prints the character in the given index.
        Scanner input =new Scanner(System.in);
        System.out.println("please enter bootcamp name:");
        String name= input.nextLine();

        System.out.println("please enter number of index:");
        int index= input.nextInt();
        char letter=name.charAt(index);
        System.out.println(letter);


    }
}
