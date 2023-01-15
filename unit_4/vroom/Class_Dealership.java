import java.util.*;
import java.io.*;

class Class_Dealership {
    // attributes
    private Scanner kb = new Scanner(System.in);
    private ArrayList<Class_Cars> inventory = new ArrayList<>();

    // constructors
    public Class_Dealership() {}
    
    // accessors
    public double get_cost_total() {
        int cost_total;
        for (Class_Cars car: inventory) {
            cost_total+=car.get_cost();
        }
        return cost_total;
    }

    public double get_vroom_avg() {
        double vroom_total;
        int vroom_count;
        for (Class_Cars car: inventory) {
            vroom_total+=car.get_vroom();
            vroom_count+=1;
        }
        return vroom_total/vroom; 
    }

    public int get_count_total() {
        int count_total;
        for (Class_Cars car: inventory) {
            count_total+=1;
        }
        return count_total;
    }

    public HashMap get_cars() {
        //print cars
    }

    // mutators -- admin w/ pswd
    public void add_car(String make, String model, double cost, double mpg, int vroom_factor) {
        Class_Cars car = Class_Cars(make, model, cost, mpg, vroom_factor);
        inventory.add(car);
    }

    public boolean sell_car(String make, String model) {
        HashMap<Integer, Class_Cars> options = new HashMap<>();
        int[] option_index = new int[];

        for (Class_Cars car: inventory) {
            if (car.get_make==make && car.get_model==model) {
                options.put(car.get_index(), car);
            }
        }

        Set<Integer> key_set = options.keySet();
        Integer[] key_arr = key_set.toArray(new Integer[key_set.size()]);

        if (options.size()>=1) {
            System.out.println(":There are multiple cars of that make and model.\n:Please select a listed option.");
            options.forEach((index, car) -> {
                System.out.printf("[%d] %s\n", index, car);
            });

            do {
                System.out.print("> ");
                String selection = kb.nextLine();
                try {
                    int selection_int = Integer.parseInt(selection);
                    boolean stupid = (selection_int > options.size() || selection_int < 0) ? true : false;
                    inventory.remove(key_arr[selection_int-1]);
                } catch {
                    System.out.println(":Invalid integer.");
                }
            } while (stupid);

        } else if (options.size()==0) {
            System.out.println(":No cars match your inquery.");
        } else {
            inventory.remove(key_arr[0]);
        }
    }

    // functions
    public String toString() {
        return String.format("%d cars | $%.2f asset value | %f avg vroom", get_count_total(), get_cost_total(), get_vroom_avg())
    }
}

