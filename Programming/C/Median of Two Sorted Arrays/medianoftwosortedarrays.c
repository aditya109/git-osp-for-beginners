#include <stdio.h>
#include <stdlib.h>

int main()
{
    int m,n,i,j,temp;
    printf("Enter the size of the first array:");
    scanf("%d",&m);
    printf("Enter the size of the second array:");
    scanf("%d",&n);
    int num1[m];
    int num2[n];
    //Reading array elements
    for(i=0;i<m;i++){
        scanf("%d",&num1[i]);
    }
    for(i=0;i<n;i++){
        scanf("%d",&num2[i]);
    }
    int mergedarraysize=m+n;
    int merged_array[mergedarraysize];
    //Merging two arrays
    for(i=0;i<m;i++){
        merged_array[i]=num1[i];
    }
    int k=0;
    for(i=m;i<mergedarraysize;i++){
        merged_array[i]=num2[k];
        k++;
    }
    //Sorting the array
    for(i=0;i<mergedarraysize;i++){
        for(j=i;j<mergedarraysize;j++){
            if(merged_array[i]>merged_array[j]){
                temp=merged_array[i];
                merged_array[i]=merged_array[j];
                merged_array[j]=temp;
            }
        }
    }
    //Finding median
   float median;
    int middle;
    if(mergedarraysize == 1){
        if(m == 1)
            median=num1[0];
        else
            median=num2[0];
    }else if(mergedarraysize%2==0){
        middle=mergedarraysize/2;
        median=(merged_array[middle-1]+(float)merged_array[middle])/2;
    }else{
        middle=mergedarraysize/2;
        median=merged_array[middle];
    }
    printf("Median:%.5f",median);
    return 0;
}
