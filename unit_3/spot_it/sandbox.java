import java.util.*;
import java.lang.Math;
import java.util.concurrent.TimeUnit;

public class Main extends Thread {
    public static Scanner kb = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        //public_arr();
        //thread1();
        //rand_arr();
        //delay_test();
        time_test2();
    }

    public static void time_test2() throws Exception {
        long start = new Date().getTime();
        TimeUnit.MILLISECONDS.sleep(1000);
        long end = new Date().getTime();
        long dif = end-start;
        System.out.printf("%.2f\n", dif*0.001);

    }

    public static void time_test1() throws Exception {

        //String[] time_start = now.toString().split(":");
        //System.out.println(Arrays.toString(time_start));
        //TimeUnit.MILLISECONDS.sleep(1000);
        //String[] time_end = now.toString().split(":");
        //System.out.println(Arrays.toString(time_end));

        //int[] time_end = new int[2];  // 

        //for (int item; item<3; item++) {
        //    System.out.println(item);
        //    time_start[item] = Integer.parseInt(time_start[item]);
        //}

        //System.out.println(Arrays.toString(time_end));


        //String[] time_final = {time_end[1]-time_start[1], ("%s", time_end[2]-time_start[2])};
        //System.out.println(Arrays.toString(time_final));
    }

    public static void delay_test() throws Exception {
		TimeUnit.MILLISECONDS.sleep(1000);
        System.out.printf("\nZenith : (%d elements)(%d cards)\n", 4, 2);
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.printf("Charset: %s\n", "four");
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println("Press enter when ready to begin");
    }

    public static void delay_print (String[] data, TimeUnit unit, long delay) throws InterruptedException {
        for (String line : data) {
            System.out.println(line);
            unit.sleep(delay);
		}
    }

    public static void public_arr() {
        System.out.println(1);
        //arr_up(2);
        System.out.println(3);
        System.out.println(Arrays.toString(arr_test));
    }

    public static int[] arr_test = new int[3];
    public static void arr_up() {
        System.out.println(2);
        for (int i=0; i>=2; i++) {
            arr_test[i] = i;
        }
        //return arr_test;
    }
    public static int amount = 0;
    public static void thread1() {
        Main thread = new Main();
        thread.start();
        
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        //System.out.println(Arrays.toString());
    }

    public void run() {
        amount++;
    }

    // int verification
    public static void str_int() {
        int int_num=0;
        boolean stupid;
        do {
            try {
                System.out.print("> ");
                String str_num = kb.nextLine();
                int_num = Integer.parseInt(str_num);
                stupid = false;
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Try again.");
                stupid = true;
            }
        } while (stupid);
        System.out.println(int_num);
    }

    // randomize array order
    public static void rand_arr() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(arr));

        for (int i=0; i<arr.length; i++) {
            int swap = rand(0, arr.length-1);
            int temp = arr[swap];
            arr[swap] = arr[i];
            arr[i] = temp;
            //System.out.printf("%d:%d %s\n", i, swap, Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }

    // random num
    public static int rand(int min, int max) {
        return (int)Math.random()*(max-min+1)+min;
    }
}

/*
https://colab.research.google.com/drive/1F_EWVKa8rbMXi3_fG0w7AtcscFq7Hi7B#forceEdit=true&sandboxMode=true
https://colab.research.google.com/drive/15Cyy2H7nT40sGR7TBN5wBvgTd57mVKay#forceEdit=true&sandboxMode=true
https://colab.research.google.com/drive/1m2cg3D1x3j5vrFc-Cu0gMvc48gWyCOuG#forceEdit=true&sandboxMode=true
https://colab.research.google.com/drive/1ZZXnCjFEOkp_KdNcNabd14yok0BAIuwS#forceEdit=true&sandboxMode=true
https://colab.research.google.com/drive/1ysEKrw_LE2jMndo1snrZUh5w87LQsCxk#forceEdit=true&sandboxMode=true
https://colab.research.google.com/drive/1IlrlS3bB8t1Gd5Pogol4MIwUxlAjhWOQ#forceEdit=true&sandboxMode=true
 */
