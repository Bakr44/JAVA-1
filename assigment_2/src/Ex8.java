import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
      //8.Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
        Scanner input =new Scanner(System.in);
        System.out.println("please enter number of day:");
        int number=input.nextInt();

        if (number ==1){
            System.out.println("saturday");
        } else if (number ==2) {
            System.out.println("sunday");

        } else if (number ==3) {
            System.out.println("monday");

        }else if(number ==4){
            System.out.println("tuesday");
        }else if(number ==5){
            System.out.println("Wednesday");
        }else if(number ==6){
            System.out.println("thursday");
        }else if(number ==7){
            System.out.println("friday");
        }
        else System.out.println("invalid number");

    }
}
