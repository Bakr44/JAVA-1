import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        //5.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();
        int result = 1;
        for (int i = 1; i <= secondNum; i++) {
            result *= firstNum;
        }

        System.out.println(firstNum + " power of " + secondNum + " is " + result);
    }

}
