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

    public static void str_int3() {
        Scanner kb = new Scanner(System.in);
        int int_num = 0;
        boolean stupid;
        
        do {
            System.out.print("\nnumber:\n> ");
            String str_num = kb.nextLine();
        } while (NumberFormatException);
        System.out.println("good job.");
        System.out.println(int_num);
    }
    
    public static void str_int2() {
        Scanner kb = new Scanner(System.in);
        int int_num = 0;
        boolean stupid;
        
        do {
            System.out.print("\nnumber:\n> ");
            String str_num = kb.nextLine();
            try {
                int_num += Integer.parseInt(str_num);
                stupid = false;
            } catch (NumberFormatException e) {
                stupid = true;
            }
        } while (stupid);
        System.out.println("good job.");
        System.out.println(int_num);
    }

    public static void ambiguous() {
        ambiguous_test(1.0, 2);  // double, int
        ambiguous_test(2, 1.0);  // int, double
        // test (2.0, 1.0);  // no suitable method found
        //test(1,2);  // ambiguous
    
        // due to implicit casting, both options are suitable. java cannot decide which is better.
    }
    public static void ambiguous_test(int i, double j) {System.out.println("int, double");}
    public static void ambiguous_test(double i, int j) {System.out.println ("double, int");}

    public static void uno_init() {
        Scanner kb = new Scanner(System.in);
        int usr_in = 123;
        System.out.println(uno(usr_in));
    }
    
    public static int uno(int in) {
        int out = 0;
        while (in > 0) {
            out = (out*10)+in%10;
            in /= 10;
        }
        return out;
    }
    
    public static String uno(String in) {
        int len = in.length();
        String out = "";
        for (int i=len-1; i>=0; i--) {
            out += in.charAt(i);
        }
        return out;
    }
    
    public static void str_int() {
        Scanner kb = new Scanner(System.in);
        int int_num = 0;
        boolean stupid;
        
        do {
            System.out.print("\nnumber:\n> ");
            String str_num = kb.nextLine();
            try {
                int_num += Integer.parseInt(str_num);
                stupid = false;
                System.out.println("nice.");
            } catch (NumberFormatException e) {
                stupid = true;
                System.out.println("stupid.");
            }
        } while (stupid);
        System.out.println("good job.");
        System.out.println(int_num);
    }
    
    public static void tri_test() {
        //split();
        //tri1();
        //tri2();
        //tri3();
        //tri0();    
        tri4();
    }
    public static void tri4() {
        // for (int i=3 ; i>=0; i--){ 
        //   for (int j=0; j<=i; j++){
        //     System.out.print("%   ");
        //   }
        //   System.out.println("\n");
        // }
    
        for (int i=6; i>=0; i--){
            for (int j=0; j<=i-2; j++){
                System.out.print("%   ");
            }
            if (i>=2) {
                System.out.print("-   ");
            }
            for (int j=5; j>=i-1; j--){
                System.out.print("#   ");
            }
            System.out.println("\n");
        }
    }
    public static void tri3() {
        for (int i=0 ; i<=3; i++){
            for (int k=0; k<=i; k++){
                System.out.print("    ");
            }
            for (int j=3; j>=i; j--){
                System.out.print("%   ");
            }
            System.out.println("\n");
        }
    }
    public static void tri2() {
        for (int i=3 ; i>=0; i--){
            for (int k=0; k<=i; k++){
                System.out.print("    ");
            }
            for (int j=3; j>=i; j--){
                System.out.print("%   ");
            }
            System.out.println("\n");
        }
    }
    public static void tri1() {
        for (int i=3 ; i>=0; i--){ 
            for (int j=0; j<=i; j++){
                System.out.print("%   ");
            }
            System.out.println("\n");
        }
    }
    public static void tri0() {
        for (int i=0 ; i<=3; i++){ 
            for (int j=0; j<=i; j++){
            System.out.print("%   ");
            }
            System.out.println("\n");
        }
    }
    
    public static void split() {
        // split
        //   2 ints or 2 doubles
        //     for char in string:
        //       for char in char_list: 
        //         if char: define char_location
        //   retrieve letter
        //String[] op = {"a", "s", "d", "m", "r"};
        
        // usr_in.split(j, 1)
        // Character.toString(usr_in.charAt(i))
        //  int[] e = x.split(charAt('a'))
        // switch (i) {
        //   case 'a':
        //     int[] e = usr_in.split(usr_in.charAt('a'));
        // }
        
        // concise answer for ambiguity?
        
        String usr_in = "9.0a8.1";
        char[] op = {'a', 's', 'd', 'm', 'r'};
        
        
        for (char i : usr_in.toCharArray()) {
            for (char j : op) {
                if (i==j) {
                    System.out.println(i+":"+j+" true");
                } else {
                    System.out.println(i+":"+j+" false");
                }
            }
        }
    }
    
    public static int val(int split_int) {
        return split_int; // 0 split int
    }
    
    public static void ccc_test() {
        int even = String.valueOf(1234).length();
        int odd = String.valueOf(12345).length();
        
        System.out.println("even: "+even/2);
        System.out.println("odd: "+odd/2);
    }
    
    public static int close10(int a, int b) {
        // System.out.println(close10(8, 13));
        
        int a1 = Math.abs(10-a);
        int b1 = Math.abs(10-b);
        if (a1 < b1) {
            return a;
        } else if (a1 > b1) {
            return b;
        } else {
            return 0;
        }
    }
    
    public static void ci_caller() {
        ci(1000, 0.072, 2, 10);
        double amount = ci_better(9876, 0.04, 3, 6);
        System.out.println(amount);
    }
    
    public static double ci_better(double p, double r, double n, double t) {
        return p*Math.pow((1+(r/n)),n*t);
    }
    
    public static void ci(double p, double r, double n, double t) {
        System.out.println(p*Math.pow((1+(r/n)),n*t));
    }
    
    public static void char_finder(String s, int n) {
        // char_finder("hello", 1);
        char c = s.charAt(n);
        System.out.println(c);
    }
  
    public static void errors() {
        /*
        - syntax error
            - caught before execution
            - you break the syntax of the language
            // int ex1 = 5  // missing semicolon
            // int ex2 = "misplaced string";  // assigning string to int
            // ent ex3 = 4;  // invalid type
    
        - runtime error
            - caught during execution
            - exception not handled
            // int arr[] = new int[5]; arr[9] = 250;  // array out of range
            // int a=0,b=4,c=2; System.out.println((b/a)+c);  // cannot divide by zero
            // String str = null; int len = str.length();  // cannot invoke on null
    
        - logic error
            - not caught >> user identified after execution
            - error in the logic of algorithms
            // int a=2,b=2; System.out.println(a+b);  // expected 5, recieved 4 
            // for (int i=10; i>=10; i++) {System.out.println(i);} int e=2;  // line unreachable
            // int a=2,b=2; System.out.println(a*b);  // expected 1, recieved 4
        */
  }

    public static void q2() {
        // Ask the user for a 3 digit number and print out those numbers in reverse.
        
        // int num100 = (num % 1000)/100;
        // int num10 = (num % 100)/10;
        // int num1 = (num % 10)/1;
        
        int num = 45678;
        
        int len = String.valueOf(num).length();  // get int length
        int ext=0;
        for (int i=0; i<len; i++) {
            int kks = (int) Math.pow(10, (len-i));
            int num_out = (num%(kks))/((int)(kks*0.1));  // obtain digit
            ext += num_out * (int) Math.pow(10, i);  // push digit w/ adjusted place value
        }
    }
        
    public static void q1() {
        // Using the quadratic formula, given an a, b and c, print x
        int a=2, b=3, c=1;
        double x = (-b + Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);
        System.out.println(x);
    }
        
    public static void algorithm_test() {
        for (int i=10; i>10; i++) {System.out.println(i);}
    }
        
    public static int int_scanner() {
        Scanner kb = new Scanner(System.in);
        System.out.print("\n3 digit number: ");
        String num = kb.nextLine();
        
        return str_int(num); // actual arguement
    }
        
    public static int str_int(String input_string) {  // formal parameter
        int output_int=0;
        try {
            output_int += Integer.parseInt(input_string);
        }
        catch (NumberFormatException e) {
            System.out.println("err");
            int_scanner();
        }
        return output_int;
    }
}
/*
formatting system output
https://www.digitalocean.com/community/tutorials/java-printf-method

specifiers
%d -- integer
%s -- stringint x = 0;
int y = 5;
int z = 1;
x++;
y -= 3;
z = x + z;
x = y * z;
y %= 2;
z--;
%b -- boolean
%f -- double
 - %.2f -- double rounded to 2 digits of accuracy 

System.out.printf("text ")

if it runs and breaks, it is a runtime error.

*/
