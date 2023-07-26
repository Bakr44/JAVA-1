public class Ex4 {
    public static void main(String[] args) {
        //4.Write a Java program to get the larger value between first and last element of an array of integers.
        int[] array = {1, 4, 17,20};

            if (array[0]>array[array.length-1])
                System.out.println("Larger value between first and last element: " + array[0]);
            else System.out.println("Larger value between first and last element: "+ array[array.length-1] );


    }
}
