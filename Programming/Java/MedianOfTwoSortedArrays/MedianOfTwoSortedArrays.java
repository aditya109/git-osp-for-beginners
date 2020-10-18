import java.util.Scanner;
 
public class MedianOfTwoSortedArrays
 
{   public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements in arrays");
        int N = scan.nextInt();
        int[] nums1 = new int[ N ];
        int[] nums2 = new int[ N ];
        System.out.println("Enter "+ N +" elements of array 1");
        for (int i = 0; i < N; i++)
            nums1[i] = scan.nextInt();
        System.out.println("Enter "+ N +" elements of array 2");
        for (int i = 0; i < N; i++)
            nums2[i] = scan.nextInt();
        int med = median(nums1, nums2);
        System.out.println("Median = "+ med);
     }
     public static int median(int[] nums1, int[] nums2)
     {
         int N = nums1.length;
         return median(nums1, 0, N -1 , nums2, 0, N - 1);
     }
     public static int median(int[] nums1, int l1, int h1, int[] nums2, int l2, int h2)
     {
         int mid1 = (h1 + l1 ) / 2;
         int mid2 = (h2 + l2 ) / 2;
 
         if (h1 - l1 == 1)
             return (Math.max(nums1[l1] , nums2[l2]) + Math.min(nums1[h1] , nums2[h2]))/2;
         else if (nums1[mid1] > nums2[mid2])
             return median(nums1, l1, mid1 , nums2, mid2 , h2);    
         else
             return median(nums1, mid1 , h1, nums2, l2 , mid2 );    
     }     
}