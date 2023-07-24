import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
 //1.Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.
        Scanner input =new Scanner(System.in);

        System.out.println("please enter first number");
        int first_number = input.nextInt();
        System.out.println("please enter second number");
        int second_number = input.nextInt();

        int sum_numbers =first_number + second_number;
        System.out.println("\n"+first_number +" + " + second_number + "=" +sum_numbers );

        int sub_numbers =first_number - second_number;
        System.out.println("\n"+first_number +" - " + second_number + "=" +sub_numbers );

        int mul_numbers =first_number * second_number;
        System.out.println("\n"+first_number +" * " + second_number + "=" +mul_numbers );

        int div_numbers =first_number / second_number;
        System.out.println("\n"+first_number +" / " + second_number + "=" +div_numbers );

        int mod_numbers =first_number % second_number;
        System.out.println("\n"+first_number +" mod " + second_number + "=" +mod_numbers );


    }
}