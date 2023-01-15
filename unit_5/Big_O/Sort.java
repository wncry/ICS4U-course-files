import java.util.*;
import java.lang.*;

class Sort {
    private ArrayList<Long> arr_out = new ArrayList<>();
    private ArrayList<Integer> arr = new ArrayList<>();
    private int k = 0;

    public Sort(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    public Sort(int size) {
        Random generator = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>(size);
        for (int i=0; i<size; i++) {  
            int num = generator.nextInt(size);
            arr.add(num);
        }

        this.arr = arr;
    }

    public ArrayList<Long> calc() {
        this.arr_out.add(bubble_time());
        this.arr_out.add(insertion_time());
        this.arr_out.add(selection_time());

        return this.arr_out;
    }

    public void clear() {
        this.arr_out.clear();
    }

    private long bubble_time() {
        long s = System.nanoTime();
        bubble();
        long f = System.nanoTime();
        return f-s;
    }

    private long insertion_time() {
        long s = System.nanoTime();
        insertion();
        long f = System.nanoTime();
        return f-s;
    }

    private long selection_time() {
        long s = System.nanoTime();
        selection();
        long f = System.nanoTime();
        return f-s;
    }

    public void bubble() {
        boolean exchanged = true;
        for (int i=1; i<this.arr.size() && exchanged; i++) {
            exchanged = false;
            for (int j=0; j<this.arr.size()-i; j++) {
                if (this.arr.get(j)>this.arr.get(j+1)) {
                    int temp = this.arr.get(j);
                    this.arr.set(j, this.arr.get(j+1));
                    this.arr.set(j+1, temp);
                    exchanged = true;
                }
            }
        }
    }

    public void insertion() {
        for (int i=0; i<this.arr.size(); i++) {
            int temp_el = this.arr.get(i);
            int temp_in = i;
            while (temp_in>0 && this.arr.get(temp_in) < this.arr.get(temp_in-1)) {
                this.arr.set(temp_in, this.arr.get(temp_in-1));
                temp_in--;
            }
            this.arr.set(temp_in, temp_el);
        }
    }

    public void selection() {
        for (int i=0; i<this.arr.size(); i++) {
            int smallest = i;
            for (int j=0; j<this.arr.size(); j++) {
                if (this.arr.get(j) < smallest) {
                    smallest = j;
                }
            }
        }
    }
}