
public class Ex1 {
    public static void main(String[] args) {
        //1.Write a program that prints the numbers from 1 to 100 such that:
        for (int i = 1; i <= 100; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");

            }else if(i%5==0){
                System.out.println("Buzz");

            }else if (i%3==0){
                System.out.println("Fizz");

            }else System.out.println(i);

        }
    }
}
