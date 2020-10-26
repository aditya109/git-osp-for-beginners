import java.util.Arrays;
import java.util.Scanner;

public class RotateKLeftKRight {
	
	static int[] rotateRight(int[] arr,int k) {
		int[] ans = arr;
		ans = reverse(ans,0,ans.length-1);
		ans = reverse(ans,0,k-1);
		ans = reverse(ans,k,ans.length-1);
		return ans;
	}
	
	static int[] rotateLeft(int[] arr,int k) {
		int[] ans = arr;
		ans = reverse(ans,0,ans.length-1);
		ans = reverse(ans,0,ans.length-k-1);
		ans = reverse(ans,ans.length-k,ans.length-1);
		return ans;
	}
	
	static int[] reverse(int[] arr,int start,int end) {
		while (start <= end ) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = s.nextInt();
		}
		int k = s.nextInt();
		int[] leftRotate = rotateLeft(Arrays.copyOf(arr, n),k);
		System.out.print("Left Rotated array by K=" + k+ " times :");
		for(int i = 0;i < n;i++) {
			System.out.print(leftRotate[i] + " ");
		}
		
		System.out.println();
		
		int[] rightRotate = rotateRight(Arrays.copyOf(arr, n),k);
		System.out.print("Right Rotated array by K=" + k+ " times :");
		for(int i = 0;i < n;i++) {
			System.out.print(rightRotate[i] + " ");
		}
		

	}

}

