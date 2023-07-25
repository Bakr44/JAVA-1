import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        //3.Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
        Scanner input=new Scanner(System.in);

        System.out.println("please enter number to show multiplication table of that number ");

        int num = input.nextInt();
        if (num<= 0){
            System.out.println(" must be a positive number");
        }else{

            for (int i = 0; i <=10 ; i++) {
                System.out.println(i+"*"+num+ "="+ (i * num));
            }
        }
    }
}
