import java.util.*;
public class DutchNationalFlag {
 
    static public void main(String[] args){
        int[] a = {1,2,0,2,2,1, 2, 1,0};
        
        SortingArray(a);
    }
    
     public static void SortingArray(int a[]){
        // Count the number of zero, one
        int zeros, ones, k;
        zeros = ones = k = 0;

        for (int i = 0; i < a.length ; i++){
            if (a[i] == 0 )
            {
                zeros++;
            }
            if (a[i] == 1 )
            {
                ones++;
            }
        }
        
        // fill zero in the first positions of the array
        while(zeros-- != 0){
            a[k++] = 0;
        }
        
        //fill one in the next empty position
        while (ones-- != 0){
            a[k++] = 1;
        }
        
        // fill twos in the left positions
        while (k < a.length){
            a[k++] = 2;
        }
        System.out.println(Arrays.toString(a));
        
    }
}
