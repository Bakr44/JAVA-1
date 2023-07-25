import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //8.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

        int positiveCount = 0, negativeCount = 0, zeros = 0;

        while (true) {
            System.out.print("Enter a number or 'e' to exit: ");
            String str = input.next();
            if (str.equalsIgnoreCase("e")) {
                    break;
                }
            int num = Integer.parseInt(str);

            if (num == 0) {
                zeros++;
            }
            else if (num > 0) {
                positiveCount++;
            }
            else {
                negativeCount++;
            }

        }
        System.out.println("Positive numbers entered: " + positiveCount);
        System.out.println("Negative numbers entered: " + negativeCount);
        System.out.println("Zeroes entered: " + zeros);
    }
}
