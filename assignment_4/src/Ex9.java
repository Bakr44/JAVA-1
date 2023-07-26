import java.util.ArrayList;
import java.util.Arrays;

public class Ex9 {
    public static void main(String[] args) {
        //9. Write a program that places the odd elements of an array before the even elements.

        int[] array = {2,3,40,1,5,9,4,10,7};
        ArrayList<Integer> evenNum=new ArrayList<>();
        ArrayList<Integer> oddNum=new ArrayList<>();



        for (int n:array) {
            if (n%2==0){
                evenNum.add(n);
            }else oddNum.add(n);
        }

//        System.out.println(evenNum);
//        System.out.println(oddNum);
        oddNum.addAll(evenNum);
        int[] res = new int[oddNum.size()];

        for (int i = 0; i < oddNum.size(); i++) {
            res[i] = oddNum.get(i);
        }
        System.out.println(Arrays.toString(res));

    }
}
