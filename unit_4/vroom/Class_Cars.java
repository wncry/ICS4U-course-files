import java.util.*;
import java.io.*;

class Class_Cars {
    // attributes
    private String make;
    private String model;
    private double cost;
    private double mpg;
    private int vroom_factor;
    private static int car_count;
    private int car_index;

    // constructors
    public Class_Cars(String make, String model, double cost, double mpg, int vroom_factor) {
        this.make = make;
        this.model = model;
        this.cost = cost;
        this.mpg = mpg;
        this.vroom_factor = vroom_factor;

        car_count++;
        car_index+=car_count;
    }

    // accessors
    public String get_make() {return make;}
    public String get_model() {return model;}
    public double get_cost() {return cost;}
    public double get_mpg() {return mpg;}
    public int get_vroom() {return vroom_factor;}
    public static int get_count() {return car_count;}
    public int get_index() {return car_index;}

    // mutators -- admin w/ pswd
    public void set_make(String make) {this.make = make;}
    public void set_model(String model) {this.model = model}
    public void set_cost(double cost) {this.cost = cost;}
    public void set_mpg(double mpg) {this.mpg = mpg;}
    public void set_vroom(int vroom) {this.vroom = vroom;}

    // functions
    public double get_distance(double gallons) {return mpg*gallons;}
    public double get_gallons(double distance) {return distance/mpg;}
    public String toString() {return String.format("%s, %s: $%.2f || %dvf | %.2fmpg ||", get_make(), get_model(), get_cost(), get_vroom(), get_mpg());}
}
