import java.util.*;

public class Search_Main{
    public static void main(String[] args) {
        int[] arr = {3, 86, -20, 40, 14};
        
        System.out.printf("Binary Recursive Search\n%s\n", Arrays.toString(arr));
        Search_1.binary_r(arr);
        System.out.println(Arrays.toString(arr));
    }
}