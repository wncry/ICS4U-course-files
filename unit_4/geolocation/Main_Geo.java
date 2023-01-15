import java.util.*;

class Main_Geo {
    public static void main(String[] args) {
        Class_Trip rt = new Class_Trip();
        rt.add_stop("San Francisco", 37.7833, -122.4167);
        rt.add_stop("Los Angeles", 34.052235, -118.243683);
        rt.add_stop("Las Vegas", 36.114647, -115.172813);

        System.out.println(rt);

        System.out.println("Stops: " + rt.get_stop_count());
        System.out.println("Total Miles: " + rt.get_trip_length());
    }
}