import java.util.Scanner;

class RotateArrayKtimes {

   static void leftrotate(int arr[],int n,int k){
      int rotated_array[]=new int[n];
      for(int i=0;i<n;i++){
      
      int rotate=(i+(n-k))% n;
      rotated_array[rotate]=arr[i];
      }
   
      printArray(rotated_array,n);
   }

  static void rightrotate(int arr[],int n,int k){
    int rotated_array[]=new int[n];
     for(int i=0;i<n;i++){
        int rotate=(i+k)%n;
        rotated_array[rotate]=arr[i];
        }
        printArray(rotated_array,n);
  }

  static void printArray(int arr[],int n){
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }

  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n=sc.nextInt();
    System.out.println("Enter  array elements:");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    System.out.println("Enter K :");
    int k=sc.nextInt();
  

    System.out.print("Left Rotated array by K = " + k+ " times :");
    leftrotate(arr,n,k);

    System.out.println();

    System.out.print("Right Rotated array by K = " + k+ " times :");
    rightrotate(arr,n,k);

    sc.close();
  
  }
}

/* 

Output 1 : 


Enter size of array:
5
Enter  array elements:
1 2 3 4 5
Enter K :
4
Left Rotated array by K = 4 times :5 1 2 3 4 
Right Rotated array by K = 4 times :2 3 4 5 1 


Output 2 : 

Enter size of array:
5
Enter  array elements:
1 2 3 4 5
Enter K :
5
Left Rotated array by K = 5 times :1 2 3 4 5 
Right Rotated array by K = 5 times :1 2 3 4 5

*/
