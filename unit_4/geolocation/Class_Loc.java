import java.util.*;

public class Class_Loc {
    public static final double RADIUS = 3963.1676;  
    private double latitude;
    private double longitude;
    private String name;

    public Class_Loc(String name, double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }

    public double get_lat() {return latitude;}
    public double get_long() {return longitude;}
    

    public double get_distance(Class_Loc other) {
        double lat1 = Math.toRadians(latitude);
        double long1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(other.latitude);
        double long2 = Math.toRadians(other.longitude);

        double cos = Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(long1-long2);
        double arc_length = Math.acos(cos);
        double distance = arc_length * RADIUS;
		return distance;
    }

    public String toString() {return String.format("%s (%.4f, %.4f)", name, latitude, longitude);}
}