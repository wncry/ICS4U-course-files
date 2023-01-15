import java.util.*;
import java.lang.*;

class Main {
    public static int rand(int min, int max) {
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    public static void main(String[] args) {
        //q2();
        q3();
    }

    public static void q2() {
        // 1
        int[][] arr = new int[5][7];
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                arr[i][j] = rand(0, 1000);
            }
        }
        // 2
        for (int[] i: arr) {
            System.out.println(Arrays.toString(i));
        }
        // 3
        int total = 0;
        int count = 0;
        for (int[] i: arr) {
            for (int j: i) {
                total += j;
                count += 1;
            }
        }
        System.out.printf("\nnums avg: %d\n", total/count);
        // 4
        int tenx50 = 0;
        for (int[] i: arr) {
            for (int j: i) {
                tenx50 += (j>=500) ? 1 : 0;
            }
        }
        System.out.printf("nums>500: %d\n", tenx50);
        // 5
        int onex10 = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                int pre = arr[i][j];
                arr[i][j] = (pre<=100) ? 0 : pre;
                onex10 += (pre<=100) ? 1 : 0;
            }
        }
        System.out.printf("nums<100: %d\n\n", onex10);
        // 6
        for (int[] i: arr) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static void q3() {
        // 1
        ArrayList<> arrl = new ArrayList<Integer>();
        for (int i=0; i<20; i++) {
            arrl.add(rand(0, 300));
        }
        // 2
        int size = arrl.size();
        for (int i=0; i<size; i++) {
            if (arrl.get(i)>=200) arrl.remove(i);
        }
        
    }

}