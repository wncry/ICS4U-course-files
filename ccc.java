import java.util.*;

class Main {
    public static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        //n18j2();
        //e15j3();
        
    }

    public static void e15j3() {
        String[] arr = kb.nextLine().split(" ");

        // 10+10-5
        int total = 0; // 20
        int sign = 1;  // -1
        int temp = 0;  // 5
        // total += (sign*temp)

        for (String element: arr) {
            switch (element) {
                case "P":
                    sign =  1;
                    break;
                case "M":
                    sign = -1;
                    break;
                case "=":
                    break;
                default:
                    temp = Integer.parseInt(element);
                    total += sign*temp;
                    break;
            }
        }

        System.out.println(total);

    }

    public static void n18j2() {
        int rows = kb.nextInt();
        int cols = kb.nextInt();
        kb.nextLine();  // clear cache

        String[][] arr = new String[rows][cols];

        for (int row=0; row<=rows; row++) {
            String usr_in = kb.nextLine();
            for (int col=0; col<=cols; col++) {
                arr[row][col] = Character.toString(usr_in.charAt(col));
            }
        }

        for (int row=0; row<=rows; row++) {
            for (int col=0; col<=cols; col++) {
                if ((row!=arr.length-1) && (arr[row][col]).equals("o") && (arr[row+1][col]).equals(".")) {
                    String temp = arr[row][col];
                    arr[row][col] = arr[row+1][col];
                    arr[row+1][col] = temp;
                }
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }

public static void lucky08j2() {
        Scanner kb = new Scanner(System.in);
        int c_num = kb.nextInt();
        String end = "";

        while (!(c_num==0)) {  // how many input ints should it excpect?
            int x = kb.nextInt();  // first input num
            String x_str = kb.nextLine();
            int y = 0;  // temp var
            do {
                y -= y;
                int len_x = String.valueOf(x).length();  // x len
                int len_x_str = x_str.length();
                // for (int i=0; i<=len_x; i++) {  // for i in range(len(x))
                //     y += x%10;
                //     x /= 10;
                // }
                for (int i=0; i<=len_x_str; i++) {
                    char last = x_str[len_x_str-1];
                    y += last;
                    x_str -= last;
                }
                
                x -= x;
                x += y;
            } while (y>=10);
            c_num-=1;
          
            if (c_num==0) {
              end += String.valueOf(y);
            } else {
              end += String.valueOf(y)+"\n";
            }
        }
        System.out.println(end);
    }
  
    public static void shifty17j2() {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int k = kb.nextInt();
        int temp = 0;

        for (int i=0; i<=k; i++){
            temp += N*Math.pow(10, i);
        }
        System.out.println(temp);
    }
  
    public static void avg16j2() {
        Scanner kb = new Scanner(System.in);
        int grades = 0;
        for (int i=0; i<6; i++) {
            grades += kb.nextInt();
        }
        double avg_grade = grades/6;
        int score = kb.nextInt();
        int req = kb.nextInt();
        
        if (avg_grade+score>=req) { // 11:28
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
  }
  
    // public static void _996600j2() {
    //     // https://dmoj.ca/problem/ccc00j2
    //     Scanner kb = new Scanner(System.in);
    //     int m = 1;
    //     int n = 100;
    //     int[] uno_flip = {1, 8, 0};
    //     int[] duo_flip = {6, 9};
    //     char[] non_flip = {'2', '3', '4', '5', '7'};
        
        
    //     for (int i = n; i>=m; i--) {
    //         System.out.println(i);
    //         String num = String.valueOf(i);
    //         for (int j = num.length(); j>=0; j--) {
    //             // for (int h = char[].size(); h>=0; h--){}
    //             if (num.contains()) {}
                
    //         }
    //     }
        
    //     if (num.length()%2==0) {  // even
    //         String even = num.replace('6','9');
    //         int even_len = even.length();
    //         int even_half = even_len/2;
            
    //         String even_first = even.substring(0, even_half);
    //         String even_last = even.substring(even_half, even_len);
    //         String even_last_flip = "";
            
    //         for (int i=even_last.length()-1; i>=0; i--) {
    //             even_last_flip += even_last.charAt(i);
    //         }
    //         even_last_flip = even_last_flip.substring(0, even_last_flip.length());
            
    //         // System.out.println("even");
    //         // System.out.println(even);  // whole
    //         // System.out.println(even_first);  // first half
    //         // System.out.println(even_last_flip);  // last half flipped
    //         // System.out.println("== "+even_first.equals(even_last_flip));  // equivilant?
    //     } else {  // odd
    //         String odd = num.replace('6','9');
    //         int odd_len = odd.length();
    //         int odd_half = odd_len/2;
            
    //         String odd_first = odd.substring(0, odd_half);
    //         String odd_last = odd.substring(odd_half, odd_len);
    //         String odd_last_flip = "";
            
    //         for (int i=odd_last.length()-1; i>=1; i--) {
    //             odd_last_flip += odd_last.charAt(i);
    //         }
            
    //         odd_last_flip = odd_last_flip.substring(0, odd_last_flip.length());
            
    //         // System.out.println("odd");
    //         // System.out.println(odd);  // whole
    //         // System.out.println(odd_first);  // first half
    //         // System.out.println(odd_last_flip);  // last half flipped
    //         // System.out.println("== "+odd_first.equals(odd_last_flip));  // equivilant?
    //     }
    // }
  
    public static void aac1p1() {
        Scanner kb = new Scanner(System.in);
        int S = kb.nextInt();
        int R = kb.nextInt();
        System.out.println(Math.pow(S,2)>Math.PI*Math.pow(R,2)?"SQUARE":"CIRCLE");
    }
    
    public static void quadrant_17j1(int attempt_num) {
        // https://dmoj.ca/problem/ccc17j1
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        int y = kb.nextInt();
        
        if (x<0) {
            if (y<0) {
            System.out.println(3);
            } else {
            System.out.println(2);
            }
        } else {
            if (y<0) {
            System.out.println(4);
            } else {
            System.out.println(1);
            }
        }
    }
    
    public static void fine_12j1(int attempt_num) {
        // https://dmoj.ca/problem/ccc12j1
        Scanner kb = new Scanner(System.in);
        int limit = kb.nextInt();
        int speed = kb.nextInt();
        int diff = speed-limit;
        
        if (attempt_num == 2) {
            if (diff>=31) {
                System.out.println("You are speeding and your fine is $"+500+".");
            } else if (diff>=21) {
                System.out.println("You are speeding and your fine is $"+270+".");
            } else if (diff>=1) {
                System.out.println("You are speeding and your fine is $"+100+".");
            } else {
                System.out.print("Congratulations, you are within the speed limit!");
            }
        } else if (attempt_num == 1) {
            if (diff<=0) {
                System.out.print("Congratulations, you are within the speed limit!");
            } else if ((diff>=1) && (diff<=20)) {
                System.out.println("You are speeding and your fine is $"+100+".");
            } else if ((diff>=21) && (diff<=30)) {
                System.out.println("You are speeding and your fine is $"+270+".");  
            } else {
                System.out.println("You are speeding and your fine is $"+500+".");
            }
        } else {
            System.out.println("[!] invalid attempt number");
        }
    }
}