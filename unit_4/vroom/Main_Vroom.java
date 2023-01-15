import java.util.*;
import java.io.*;

class Main_Vroom {
    public static void main(String[] args) {
        Class_Dealership dealership1 = Class_Dealership();
        dealership1.add_car("Ford", "Mustang", 14500.00, 12.25, 79);
        dealership1.add_car("Toyota", "Prius", 9800.00, 19.42, 8);
        dealership1.add_car("Hyundai", "Kona", 12000.00, 22.83, 65);
        dealership1.add_car("Ford", "Mustang", 7480.00, 8.0, 45);
        dealership1.sell_car("Ford", "Mustang");
        System.out.println(dealership1)

    }
}
