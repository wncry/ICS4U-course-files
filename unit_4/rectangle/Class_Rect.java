import java.util.*;
class Class_Rect {
    // variables
    private int width;
    private int length;
    private int object_index;
    private static int object_count;

    // constructors
    public Class_Rect(int width, int length) {
        set_width(width);
        set_length(length);
        object_count++;
        object_index+=object_count;
    }
    public Class_Rect() {this(1, 1);}
    public Class_Rect(int square) {this(square, square);}

    // accessors
    public int get_width() {return width;}
    public int get_length() {return length;}
    public int get_object_index() {return object_index;}
    public static int get_object_count() {return object_count;}

    // mutators
    public void set_width(int width) {this.width = width;}
    public void set_length(int length) {this.length = length;}

    // functions
    public double get_perimeter() {return (width*2.0 + length*2.0);}
    public double get_area() {return (width * length);}
    
    public double add_area(Class_Rect rectangle) {
        int width = get_width() + rectangle.get_width();
        int length = get_length() + rectangle.get_length();
        return width * length;
    }
    public boolean equals(Class_Rect rectangle) {
        int r1w = get_width();
        int r1l = get_length();
        int r2w = rectangle.get_width();
        int r2l = rectangle.get_length();
        return ((r1w==r2w) && (r1l==r2l)) ? true : false;
    }

    public String toString() {
        return String.format("R%d: Width %d | Length %d || Perimeter %.2f | Area %.2f", 
            get_object_index(), get_width(), get_length(), get_perimeter(), get_area());
    }

}

