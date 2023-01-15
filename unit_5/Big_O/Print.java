import java.util.*;
import java.lang.Math;

// avg count
// avg for each column

class Print {
    public static void search(int init, int rep, boolean max, int intmax) {
        String[] headings = {"iteration", "size", "target", "linear", "binary_i", "binary_r"};
        for (String heading: headings) {
            System.out.printf("%10s | ", heading);
        }
        System.out.println();
        for (String heading: headings) {
            System.out.printf("%10s | ", new String(new char[heading.length()]).replace("\0", "-"));
        }
        System.out.println();
        
        try {
            int size = init;
            int count = 1;
            while ((!max) || (max=true && count<=intmax)) {
                Search s = new Search(size);
                ArrayList<Long> calc = s.calc();
                System.out.printf("%10d | %10d | %10d | ", count, size, s.get_key());
                for (long time: calc) {
                    System.out.printf("%10.4f | ", time * Math.pow(10, -6));
                }
                s.clear();
                System.out.println();
                size *= rep;
                count++;
            }
        } catch (StackOverflowError e) {
            System.out.println("\nstack overflow\n");
        } catch (OutOfMemoryError e) {
            System.out.println("\nout of memory\n");
        }
    }

    public static void search() {
        search(10, 2, false, 0);
    }
    
    public static void search(boolean max) {
        search(10, 2, max, 10);
    }
    
    public static void search(boolean max, int intmax) {
        search(10, 2, max, intmax);
    }

    public static void sort(int init, int rep, boolean max, int intmax) {
        String[] headings = {"iteration", "size", "bubble", "insertion", "selection", "quick", "merge"};
        for (String heading: headings) {
            System.out.printf("%10s | ", heading);
        }
        System.out.println();
        for (String heading: headings) {
            System.out.printf("%10s | ", new String(new char[heading.length()]).replace("\0", "-"));
        }
        System.out.println();
        
        int size = init;
        int count = 1;
        while ((!max) || (max=true && count<=intmax)) {
            Sort s = new Sort(size);
            ArrayList<Long> calc = s.calc();
            System.out.printf("%10d | %10d | ", count, size);
            for (long time: calc) {
                System.out.printf("%10.4f | ", time * Math.pow(10, -6));
            }
            s.clear();
            System.out.println();
            size *= rep;
            count++;
        }
    }

    public static void sort() {
        search(10, 2, false, 0);
    }
    
    public static void sort(boolean max) {
        search(10, 2, max, 10);
    }
    
    public static void sort(boolean max, int intmax) {
        search(10, 2, max, intmax);
    }
}