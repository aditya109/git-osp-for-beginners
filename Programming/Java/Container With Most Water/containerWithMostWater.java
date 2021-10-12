
import java.util.*;

public class containerWithMostWater  
{
	
	// method to calculate area of container with max water
	public static int calculateArea(int[] arr, int n)
	{
    	int left = 0;			// co-ordinate of left wall
		int right = n-1;		// co-ordinate of right wall
		int maxArea=0;			// store of area of conatainer with max water
		
		// lopoing till left wall crosses right wall
		while(left < right)
		{
			
			// height of container will be height of smaller wall
			// base length will be how far they are apart i.e., right - left
			
			int area = Math.min(arr[left],arr[right])*(right-left);
			
			
			// storing the max calculated area of container
			maxArea = Math.max(maxArea, area);
			
			// moving towards right to find left wall of higher height 
			if(arr[left] < arr[right])
				left++;
			
			// moving towards left to find right wall of higher height
			else
				right--;
			
		}
		return maxArea;
  	}

	// driver program
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();			// number of walls
		int arr[] = new int[n];			// for storing height of walls
		
		for(int i = 0;i < n; i++)
			arr[i] = sc.nextInt();		// input height of walls
		
		
		System.out.println(calculateArea(arr, n));
	}
}

