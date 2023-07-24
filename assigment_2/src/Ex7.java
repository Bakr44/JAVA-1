import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        //7.Take three numbers from the user and print the greatest number.
        Scanner input =new Scanner(System.in);
        System.out.println("please enter first number:");
        int first_number=input.nextInt();

        System.out.println("please enter second number:");
        int second_number=input.nextInt();

        System.out.println("please enter third number:");
        int third_number=input.nextInt();

        int greatest =first_number;
        if (second_number>greatest){
            greatest=second_number;
        }
        if(third_number>greatest){
            greatest =third_number;
        }
        System.out.println("The greatest Number is:"+greatest);

        //another way
//        int greatestNumber= Math.max(first_number,Math.max(second_number,third_number));
//        System.out.println(greatestNumber);
    }
}
