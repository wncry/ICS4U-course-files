import java.util.*;

class Search_1{
    public static int linear() {
        for (int i =0; i<this.arr.size(); i++) {
            if (this.arr.get(i) == this.k) {
                return i;
            } 
        }
        return -1;
    }

    public int binary_i() {
        int i = 0;
        int l = 0;
        int h = this.arr.size();

        while (l<=h) {
            int m = ((h - l) / 2) + l;
            if (this.arr.get(m) < this.k) {
                l = m + 1;
            } else if (this.arr.get(m) > this.k) {
                h = m - 1;
            } else if (this.arr.get(m) == this.k) {
                i = m;
                break;
            }
        }
        return i;
    }

    public int binary_r(int l, int h) {
        int m = ((h-l)/2)+l;
        if (l>h) {
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
