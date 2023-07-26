public class Ex1 {
    public static void main(String[] args) {
//1.Write a Java program to test if the first and the last element of an array of integers are same.
// The length of the array must be greater than or equal to 2

        int[] array={0, -20, 0, 30, 40, 60, 50,10,50,0};

        if (array.length < 2){
            System.out.println("Array length must be greater than or equal to 2");
        }else if (array[0]==array[array.length-1]){
                System.out.println("true");
            }else System.out.println("false");
    }
}