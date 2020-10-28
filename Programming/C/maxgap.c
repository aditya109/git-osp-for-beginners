#include<stdio.h>
void main()
{
    int n,i,j,diff;
    printf("Please enter the max number of elements in the array ");
    scanf("%d",&n);
    int a[n],temp;
    printf("Please enter the numbers\n ");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);

    }
    printf("\nThe array is as follows: ");
     for(i=0;i<n;i++)
    {
        printf("%d ",a[i]);

    }
    for(j=0;j<n;j++)
    {
    for(i=0;i<(n-1);i++)
    {
        if(a[i]>a[i+1])
        {
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
    }
    }
    printf("\nThe sorted array is:  ");
    for(i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }
    temp=0;
    for(i=0;i<(n-1);i++)
    {
        diff=a[i+1]-a[i];
        if(diff>temp)
        temp=diff;
    }
    printf("\nMaximum gap is %d",temp);
}
