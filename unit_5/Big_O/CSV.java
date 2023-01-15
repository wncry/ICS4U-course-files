import java.util.*;
import java.lang.*;
import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// i++ >> O(n)
// i*=2 >> O(log2(n))
// nested >> O(n^2)

class CSV {
    public static void search(int init, int rep, String dir, String file_name, boolean max, int intmax) throws IOException {
        //System.out.printf("%d,%d,%s,%b,%d\n", init, rep, dir, file_name, max, intmax);
        //System.out.println("---");
        FileWriter fw = write(dir, file_name);
        Scanner fr = new Scanner(dir+file_name);  // HERE

        StringBuilder head = new StringBuilder();
        String[] headings = {"iteration,", "size,", "target,", "linear,", "binary_i,", "binary_r,"};
        for (String heading: headings) {
            head.append(String.format("%s", heading));
        }

        if (fr.hasNext()) {
            fw.write(head.toString()+"\n");
        }
        
        try {
            int size = init;
            int count = 1;
            while ((!max) || (max=true && count<=intmax)) {
                Search s = new Search(size);
                ArrayList<Long> calc = s.calc();

                StringBuilder data = new StringBuilder();
                data.append(String.format("%d,%d,%d", count, size, s.get_key()));
                for (long time: calc) {
                    data.append(String.format(",%f", time * Math.pow(10, -6)));
                }
                //System.out.println(data.toString());
                fw.write(data.toString()+"\n");
                s.clear();
                size *= rep;
                count++;
            }
        } catch (Exception e) {}
        fw.close();
        //System.out.println("---\n");
    }

    public static void search(String dir, String file_name) throws IOException {
        search(10, 2, dir, file_name, false, 0);
    }
    
    public static void search(String dir, String file_name, boolean max) throws IOException {
        search(10, 2, dir, file_name, max, 10);
    }
    
    public static void search(String dir, String file_name, boolean max, int intmax) throws IOException {
        search(10, 2, dir, file_name, max, intmax);
    }

    public static void sort(int init, int rep, String dir, String file_name, boolean max, int intmax) throws IOException {
        //System.out.printf("%d,%d,%s,%b,%d\n", init, rep, dir, file_name, max, intmax);
        //System.out.println("---");
        FileWriter fw = write(dir, file_name);
        StringBuilder head = new StringBuilder();
        String[] headings = {"iteration,", "size,", "bubble,", "insertion,", "selection,", "quick,", "merge"};
        for (String heading: headings) {
            head.append(String.format("%s", heading));
        }
        fw.write(head.toString()+"\n");
        int size = init;
        int count = 1;
        while ((!max) || (max=true && count<=intmax)) {
            Sort s = new Sort(size);
            ArrayList<Long> calc = s.calc();
            
            StringBuilder data = new StringBuilder();
            data.append(String.format("%d,%d", count, size));
            for (long time: calc) {
                data.append(String.format(",%f", time * Math.pow(10, -6)));
            }
            //System.out.println(data.toString());
            fw.write(data.toString()+"\n");
            s.clear();
            size *= rep;
            count++;
        }
        fw.close();
        //System.out.println("---\n");
    }

    public static void sort(String dir, String file_name) throws IOException {
        sort(10, 2, dir, file_name, false, 0);
    }

    public static void sort(String dir, String file_name, boolean max) throws IOException {
        sort(10, 2, dir, file_name, max, 10);
    }
    
    public static void sort(String dir, String file_name, boolean max, int intmax) throws IOException {
        sort(10, 2, dir, file_name, max, intmax);
    }

    private static FileWriter write(String dir, String file_name) throws IOException {
        try {
            Path path = Paths.get(dir);
            Files.createDirectories(path);
        } catch (Exception e) {}

        File file = new File(dir+file_name);
        FileWriter fw = new FileWriter(file, true);

        return fw;
    }
}