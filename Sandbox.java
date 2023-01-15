import java.util.*;
import java.io.*;

class Sandbox {
    public static void main(String[] args) {
        write_file();
    }

    public static void write_file() {
        try {
        File file = new File("x_x.txt");
        FileWriter fw = new FileWriter("x_x.txt", true);
        fw.write("test");
        fw.close();
        } catch (Exception e) {System.out.println("[!] "+e);}
    }

    public static int GCD(int n, int m) {
        if (n<m) {
            return GCD(m, n);
        } else if ((n>=m) && (n%m==0)) {
            return m;
        } else {
            return GCD(n%m, m);
        }
    }

    public static void fib_test() {
        int num = 10;
        for (int i=0; i<num+1; i++) {
            System.out.printf("%2d: %2d\n", i, fib_r(i));
        }
    }

    public static int fib_i(int n) {
        int total = 0;
        for (int i=0; i<n; i++) {
            total += i-1 + i-2;
        }
        return total;
    }

    //f(n) = f(n-1) + f(n-2)
    

    public static int fib_r(int n) {
        if (n==0) {
            return 0;
        } else if (n==1) {
            return 1;
        } else {
            return 
                fib_r(n-1)
                + fib_r(n-2);
        }
    }

    public static void hanoi(int n, int s, int h, int d) {
        if (n==1) {
            System.out.printf("disk %d from %d to %d\n", n, s, d);
            return;
        } else {
            hanoi(n-1, s, d, h);
            System.out.printf("disk %d from %d to %d\n", n, s, d);
            hanoi(n-1, h, s, d);
        }
    }

    public static int factorial(int num) {
        if (num==0) {
            return 1;
        } else {
            return factorial(num-1)*num;
        }
    }

    public static void swap() {
        int x;
        int y;
        x = 2;
        y = 3;
        x = x+y;  // 2 + 2 = 29
        y = x-y;  // 5 - 2 = 20
        x = x-y;  // 5 - 3 = 9

    }

    // public static void hashmap_test3() {
    //     HashMap<Integer, String> a = new HashMap<>();
    //     a.put(2, "a");
    //     a.put(6, "b");
    //     a.put(9, "c");
    //     a.put(3, "d");

    //     Set<Integer> key_set = a.keySet();
    //     Integer[] key_arr = key_set.toArray(new Integer[key_set.size()]);

    //     inventory.get(key_arr[0]);

    //     System.out.println(a.get(key_arr[0]));
    //     System.out.println(a);
    // }

    
    public static void hashmap_test2() {
        LinkedHashMap<Integer, String> a = new LinkedHashMap<>();
        a.put(2, "a");
        a.put(6, "b");
        a.put(9, "c");
        a.put(3, "d");

        System.out.println(a.get(2));
        System.out.println(a);
    }

    public static void hashmap_test() {
        HashMap<Integer, String> a = new HashMap<>();
        a.put(2, "a");
        a.put(6, "b");
        a.put(9, "c");
        a.put(3, "d");
        
        HashMap<Integer, HashMap<Integer, String>> b = new HashMap<>();
        int i=1;
        a.forEach((key, value) -> {
            //b.put(i++, ((HashMap) a.get(key).get(value)));
        });

        System.out.println(a);
        System.out.println(b);
    }

    public static void big_dif_test() {
        int[] test = {10, 3, 5, 6};
        System.out.println(big_diff(test));
    }
    public static int big_diff(int[] nums) {
        int[] e = {0, 100};
        for (int num: nums) {
            e[0] = Math.max(e[0], num);
            e[1] = Math.min(e[1], num);
        }
        System.out.println(Arrays.toString(e));
        return e[0]-e[1];
    }

    public static int rand(int min, int max) {
        return (int)Math.random()*(max-min+1)+min;
    }

}