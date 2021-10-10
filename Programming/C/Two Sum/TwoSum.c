#include <stdio.h>
#include <stdlib.h>
int main()
{
    int nums[100],i,j,size,target,sum=0;
    printf("Enter the size of an array\n");
    scanf("%d",&size);
    printf("Enter an array elements\n");
    for(i=0;i<size;i++)
    {
        scanf("%d",&nums[i]);
    }
    printf("Enter the value for target\n");
    scanf("%d",&target);

    //Logic to find indices of two  numbers with given target as sum
    for(i=0;i<size;i++)
    {
        for(j=i+1;j<size;j++)
        {
            sum=nums[i]+nums[j];
            if(sum==target)
            {
                printf("Output : [%d, %d]",i,j);
            }
        }
    }
    return 0;
}