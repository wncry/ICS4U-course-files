import java.util.*;

class Sort_2 {
    public static void bubble_sort(int[] arr) {
        boolean exchanged = true;
        for (int i=1; i<arr.length && exchanged; i++) {
            exchanged = false;
            for (int j=0; j<arr.length-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    exchanged = true;
                }
            }
        }
    }

    public static void insertion_sort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int temp_el = arr[i];
            int temp_in = i;
            while (temp_in>0 && arr[temp_in] < arr[temp_in-1]) {
                arr[temp_in] = arr[temp_in-1];
                temp_in--;
            }
            arr[temp_in] = temp_el;
        }
    }

    public static void selection_sort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int smallest = i;
            for (int j=0; j<arr.length; j++) {
                if (arr[j] < smallest) {
                    smallest = j;
                }
            }
        }
    }
}