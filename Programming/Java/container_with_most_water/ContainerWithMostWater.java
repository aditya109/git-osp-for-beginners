import java.util.Scanner;

/**
 * A JAVA code for the question "Container With Most Water"
 */

public class ContainerWithMostWater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the values of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); //Input the heights of the lines one by one
        }

        //Will use two indicators, one from left, one from right.
        int left = 0; //Left indicator initiated as the first index value of the array
        int right = arr.length - 1; //Right indicator initiated as the last index value of the array
        int varArea; //Variable Area
        int resArea = 0; //Result Area

        //Calculation of the Result area
        while(left <= right){
            varArea = (right - left) * Math.min(arr[left], arr[right]); //Check for all the maximum area possible in the container
            resArea = Math.max(varArea, resArea); //Assigning the maximum value in resArea

            //sliding the indicator left or right
            if(arr[left] <= arr[right]){
                left++;
            }else{
                right--;
            }
        }

        System.out.println("The container will contain atmost "+resArea+" unit of water.");

    }
}
