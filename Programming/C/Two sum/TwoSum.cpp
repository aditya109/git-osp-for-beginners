#include<stdio.h>
#include<stdlib.h>
int main()
{
		int n;//size of the vector
			printf("Enter size of the array:\n");
            scanf("%d",&n); 
		 
    int numbers[n];

	int i;
	int a=0;//counter variable to break from the loop

	printf("Enter the elements of the array in sorted order: ");//since it is said non-descending order
	for(i=0;i<n;i++)
	{
		scanf("%d",&numbers[i]);
		
	}

int target;//sum need to be searched
printf("\nEnter the target element :");
scanf("%d",&target);

for(i=0;i<n;)
{
	if(numbers[i]+numbers[n-1]==target)
       	{
	
	   printf("%d , %d",i+1,n);
	   a=1;
	   break;
        }
	  else if(numbers[i]+numbers[n-1]<target)
	      i++;
	   else
	   n--;   
}
if(a!=1)
printf("sum not found");
}

