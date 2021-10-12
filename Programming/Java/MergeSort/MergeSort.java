package Programming.Java.MergeSort;

public class MergeSort {

  public static void merge(int[] arr, int l, int mid, int r) {
    int[] b = new int[arr.length];
    int i = l;
    int j = mid + 1;
    int k = l;
    while (i <= mid && j <= r) {
      if (arr[i] < arr[j]) {
        b[k] = arr[i];
        i++;
      } else {
        b[k] = arr[j];
        j++;
      }
      k++;
    }
    if (i > mid) {
      while (j <= r) {
        b[k] = arr[j];
        k++;
        j++;
      }
    } else {
      while (i <= mid) {
        b[k] = arr[i];
        k++;
        i++;
      }
    }
    for (k = l; k <= r; k++) {
      arr[k] = b[k];
    }
  }

  public static void mergeSort(int[] arr, int l, int r) {
    if (l < r) {
      int mid = (l + r) / 2;
      mergeSort(arr, l, mid);
      mergeSort(arr, mid + 1, r);
      merge(arr, l, mid, r);
    }
  }

  public static void main(String[] args) {
    int[] arr = { 73, 188, 894, 915, 940, 616, 900, 548 };
    mergeSort(arr, 0, arr.length - 1);
    for (int j : arr)
      System.out.print(j + " ");
  }
}
