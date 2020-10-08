public class SquareRootofIntegerBinarySearch {
    public int sqrt(int a) {
        if (a <= 0) return a;
        int low = 1;
        int high = a;
        while (low < high){
            int mid = low + (high-low +1)/2;
            if (mid == a/mid) return mid;
            else if (mid > a/mid) high = mid-1;
            else low = mid;
        }
        return low;
    }
}
