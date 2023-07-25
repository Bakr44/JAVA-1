import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        //6.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        Scanner input = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;
        int num;

        do {
            System.out.print("Enter an integer or press Enter 0 to finish: ");
            num = input.nextInt();
            if (num == 0) {
                break;
            } else if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        while (true);

        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
    }
}


