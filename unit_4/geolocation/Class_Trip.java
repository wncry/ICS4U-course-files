import java.util.*;

public class Class_Trip {
    private Arraylist<Class_Loc> stops;


    public int stop_index=0;
    public int stop_count=0;
    public int trip_index=0;
    public static int trip_count=0;

    // initializers
    public Class_Trip() {
        stops = new Arraylist<Class_Loc>();
        trip_count++;
        trip_index+=trip_count;
    }

    // accessors
    public int get_stop_count() {return stops.size();}
    public double get_trip_length() {
        double total=0;
        for (int i=0; i<stops.size()-1; i++){
            Class_Loc start = stops.get(i);
            Class_Loc end = stops.get(i+1);
            double distance = start.get_distance(end);
            total += distance;
        }
        return total;
    }

    // mutators
    public void add_stop(String name, double latitude, double longitude) {
        stop = Class_Loc(name, latitude, longitude);
        stops.add(stop);
        stop_count++;
        stop_index+=stop_count;
    }

    // functions
    public String toString() {
        String result="";
        int count=1;
        for (GeoLocation stop: stops){
            result += String.format("%d. %s\n", stop.stop_count, stop);
            count++;
        }
        
        return result;		
    }

}