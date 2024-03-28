import java.util.ArrayList;
import java.util.Arrays;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4};
        int[] arr1 = new int[3];

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        ArrayList<Integer> arrList1 = new ArrayList<Integer>();

        arrList1.add(5);
        arrList1.add(10);

        ArrayList<Integer> arrList = new ArrayList<Integer>(arrList1);

        arrList.add(1);
        arrList.add(3);
        arrList.add(4);
       // arrList.addall(arrList1);
        
    }

}