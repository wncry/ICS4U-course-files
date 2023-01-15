import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main extends Thread {
    public static void main(String[] args) {
        thread1();
    }

    public static int amount = 0;
    public static String[][] arr = new String[13][4];

    public static void thread1() {
        Main thread = new Main();
        thread.start();
        
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println(Arrays.toString());
    }
    
    public void run() {
        amount++;
    }

    // array element algorithm
    public static String[][] algorithm(int q) {
        
        // vars
        int r = q*(q-1)+1;
        String[] s = element_gen(r);
        String[][] arr = new String[r][q];

        // establish [i][0]
        arr[0][0] = s[0];
        for (int char_m=q-1, x_index=r-1; char_m>=0; char_m--) {  // for each char to be in pos [0] as mchar
            for (int n=q-2; n>=0; n--, x_index--) {  // cycle through letters every q-1th line
                arr[x_index][0] = s[char_m];  // append element to [i][0]
            }
        }

        // establish [0-q][i]
        for (int x_index=0, element=1; element<r-1; x_index++) {
            for (int y_index=1; y_index<=q-1; y_index++, element++) {
                arr[x_index][y_index] = s[element];
            }
        }

        // establish [i][i]
        for (int group=0, shift=0, temp=group; group<=(q-2); group++) {

            // these dont work within the for loop condition
            shift-=shift; // shift=0?
            temp-=temp;
            shift-=group;
            int mod = group*(q-1);

            // for letter
            for (int letter=q; letter<=q+q-2; letter++) {
                
                // for # of times letter should appear
                for (int iter_num=1; iter_num<=q-1; iter_num++) {

                    // retrieve x_index of prev letter
                    int prev=0;
                    for (int x_prev=0; x_prev<=r-1; x_prev++) {
                        for (int y_prev=0; y_prev<=q-1; y_prev++) {
                            if ((arr[x_prev][y_prev]!=null)&&((arr[x_prev][y_prev]).equals(s[letter+mod]))) {
                                //System.out.printf("%d,%d\n", x_prev, y_prev);
                                prev+=x_prev-prev;
                            }
                        }
                    }

                    // establish x_index
                    int end = prev+shift+(q-1);
                    int class_min = ((q-1)*(iter_num))+1;
                    int class_min2 = ((q-1)*(iter_num-1));
                    if ((prev>q-1)&&(group!=0) && ((end<class_min) || (prev==class_min2))) {
                        prev+=q-1;
                    }
                    int x_index = prev+shift+(q-1);

                    // establish y_index
                    int y_index = 0;
                    for (int iy_in=1; iy_in<q; iy_in++) {
                        if (arr[x_index][iy_in]==null) {
                            y_index += iy_in;
                            break;
                        }
                    }

                    // append letter to arr
                    arr[x_index][y_index] = s[letter+mod];
                    shift-=shift+group;
                }

                // also cant include in for loop arg
                temp+=1;
                shift+=temp;
            }
        }
    }

    public static String[] element_gen(int r) {
        String[] element_arr = new String[r];
        for (int i=0; i<r; i++) {
            if (r-33<=126) {  // unicode
                element_arr[i] = String.valueOf((char)(i+33));
            } else {  // digital
                element_arr[i] = String.valueOf(i);
            }
        }
        return element_arr;
    }
}
