import java.util.*;

public class Sort_Main{
    public static void main(String[] args) {
        int[] arr = {3, 86, -20, 40, 14};
        
        System.out.printf("Bubble Sort\n%s\n", Arrays.toString(arr));
        Sort_2.bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}