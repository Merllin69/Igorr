/**
 * Created by IT_School on 04.10.2015.
 */
import java.util.Arrays;
public class App {
    public static void main(String[] args) {
        int[]arr0={1,2,3,4,5,6};
        int[]arr1={0,0,0,0,0,0,0,0,};
        System.out.println("arr:"+Arrays.toString(arr0));
        System.out.println("arr:"+Arrays.toString(arr1));

        System.arraycopy(arr0, 1, arr1, 2, 3);
        System.out.println("arr0:"+Arrays.toString(arr1));
    }
}
