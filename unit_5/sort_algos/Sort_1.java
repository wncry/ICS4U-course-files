import java.util.*;

class Sort_1 {
    // [3, 86, -20, 40, 14]
    public static void bubble_sort (int[] elements) {
        boolean exchange_made = true;
        for (int pass = 1; pass < elements.length && exchange_made; pass++) {
            exchange_made = false;
            for (int index = 0; index < elements.length-pass; index++) {
                if (elements[index] > elements[index+1]) {  
                    int temporary = elements[index];  
                    elements[index] = elements[index+1]; 
                    elements[index+1] = temporary; 
                    exchange_made = true;
                }
            }
        }
    }

    public static void insertion_sort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            int temp_element = elements[i];
            int temp_index = i;
            while (temp_index > 0 && temp_element < elements[temp_index-1]) {
                elements[temp_index] = elements[temp_index-1];
                temp_index--;
            }
            elements[temp_index] = temp_element;
        }
    }

    public static void selection_sort(int[] elements) {
        for (int i = 0; i < elements.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < elements.length; j++) {
                if (elements[j] < elements[smallest]) {
                    smallest = j;
                }
            }
            // swap at the end of each round to put the element in place
            int temp = elements[i];
            elements[i] = elements[smallest];
            elements[smallest] = temp;
        }
    }
}
