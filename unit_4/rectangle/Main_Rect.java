import java.util.*;
class Main_Rect {
    public static void main(String[] args) {
        Class_Rect R1 = new Class_Rect(2, 4);
        Class_Rect R2 = new Class_Rect(5, 7);

        System.out.println("Object count: " + Class_Rect.get_object_count());
        System.out.printf("Objects: R%d, R%d\n\n", R1.get_object_index(), R2.get_object_index());

        print_out(R1, R2);
        
        R1.set_width(5);
        R2.set_length(4);
        print_out(R1, R2);
    }

    public static void print_out(Class_Rect R1, Class_Rect R2) {
        System.out.println(R1);
        System.out.println(R2);        
        System.out.printf("Is equal: %b\n", R1.equals(R2));
        System.out.printf("Total area: %.2f\n\n", R1.add_area(R2));
    }
}