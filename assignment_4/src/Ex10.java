public class Ex10 {
    public static void main(String[] args) {
        //10. Write a program that test the equality of two arrays.
        int[] numbers1 = {2, 3, 6, 6, 4};
        int[] numbers2 = {2, 3, 6, 6, 4};
        boolean res = true;

        if (numbers1.length != numbers2.length) res = false;
        else {
            for (int i = 0; i < numbers1.length; i++) {
                if (numbers1[i] != numbers2[i]) {
                    res = false;
                    break;
                }
            }
        }
        System.out.println(res);

    }
}

