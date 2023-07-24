import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        //6.Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.

        System.out.println("please enter first number:");
        int first_number=input.nextInt();

        System.out.println("please enter second number:");
        int second_number=input.nextInt();

        System.out.println("please enter third number:");
        int third_number=input.nextInt();

        int sumNum= first_number + second_number;

        if (sumNum == third_number){
            System.out.println(true);
        }else System.out.println(false);
    }
}
