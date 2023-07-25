import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        //4.Write a program to find the factorial value of any number entered through the keyboard.
        Scanner input=new Scanner(System.in);

        int sumFact =1;
        int fact= input.nextInt();
        if (fact < 0) {
            System.out.println(" must be a positive integer");
        } else{


            for (int i = 1; i <= fact; i++) {
                sumFact*=i;
            }
            System.out.println("the factorial of "+ fact +" is "+ sumFact);
        }

    }
}
