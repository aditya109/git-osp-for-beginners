#include<stdio.h>
int mostWater(int arr[], int length);
int max(int num1, int num2);
int min(int num1, int num2);
int main() {
    int arr[] = {1,8,6,2,5,4,8,3,7};
    int length = sizeof(arr)/sizeof(arr[0]);
    int res = mostWater(arr,length);
    printf("%d" , res);
    return 0;
}
int mostWater(int arr[], int length) {
    int l = 0, r = length-1;
    int max_area = 0;
    while (l < r) 
    {
        max_area = max(max_area,(min(arr[l],arr[r])*(r-l)));
        if(arr[r] > arr[l]) l++;
        else r--;
    }
    return max_area;
    
}
int max(int num1, int num2)
{
    return (num1 > num2 ) ? num1 : num2;
}
int min(int num1, int num2) 
{
    return (num1 > num2 ) ? num2 : num1;
}