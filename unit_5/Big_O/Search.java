import java.util.*;
import java.lang.*;

class Search {
    private ArrayList<Long> arr_out = new ArrayList<>();
    private ArrayList<Integer> arr = new ArrayList<>();
    private int k = 0;

    public Search(ArrayList<Integer> arr, int k) {
        this.arr = arr;
        this.k = k;
        Collections.sort(this.arr);
    }

    public Search(int size) {
        Random generator = new Random();

        ArrayList<Integer> arr = new ArrayList<Integer>(size);
        for (int i=0; i<size; i++) {  
            int num = generator.nextInt(size);
            arr.add(num);
        }
        int k = arr.get(generator.nextInt(size));

        this.arr = arr;
        this.k = k;
    }

    public int get_key() {
        return k;
    }

    public ArrayList<Long> calc() {
        this.arr_out.add(linear_time());
        //this.arr_out.add(linear_c_time());
        this.arr_out.add(binary_i_time());
        this.arr_out.add(binary_r_time());

        return this.arr_out;
    }

    public void clear() {
        this.arr_out.clear();
    }

    private long linear_time() {
        long s = System.nanoTime();
        linear();
        long f = System.nanoTime();
        return f-s;
    }

    private long linear_c_time() {
        long s = System.nanoTime();
        linear_c();
        long f = System.nanoTime();
        return f-s;
    }

    private long binary_i_time() {
        long s = System.nanoTime();
        binary_i();
        long f = System.nanoTime();
        return f-s;
    }

    private long binary_r_time() {
        long s = System.nanoTime();
        binary_r(0, this.arr.size()-1);
        long f = System.nanoTime();
        return f-s;
    }

    private int linear() {
        for (int i =0; i<this.arr.size(); i++) {
            if (this.arr.get(i) == this.k) {
                return i;
            } 
        }
        return -1;
    }

    private int linear_c() {
        int count = 0;
        for (int i=0; i<this.arr.size(); i++){
            if (this.arr.get(i) == this.k) {
                count++;
            }
        }
        return count;
    }

    private int binary_i() {
        int i = 0;
        int l = 0;
        int h = this.arr.size()-1;
        while (l<=h) {
            //int m = ((h - l) / 2) + l;
            int m = (h+l)/2;
            int val = this.arr.get(m);
            int k = this.k;
            if (val < k) {
                l = m + 1;
            } else if (val > k) {
                h = m - 1;
            } else if (val == k) {
                i = m;
                break;
            } else {
                return -1;
            }
        }
        return i;
    }

    private int binary_r(int l, int h) {
        int m = (h+l)/2;
        if (l>=h) {
            return -1;
        } else if (this.arr.get(m) < this.k) {
            return binary_r(m+1, h);
        } else if (this.arr.get(m) > this.k) {
            return binary_r(l, h-1);
        } else if (this.arr.get(m) == this.k) {
            return m;
        } else {
            return -1;
        }
    }
}