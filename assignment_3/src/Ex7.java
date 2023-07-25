import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //7.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        }else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i ==0) {
                    isPrime = false;
                    System.out.println(num + " is not a prime number.");
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            }
        }

    }
    }

