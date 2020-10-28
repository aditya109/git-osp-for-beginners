# function to calculate the max difference between two adjacent elements
# in a sorted array 
def max_difference(a):

    # return 0 if array contain 1 or no element.
    if len(a)<2:
        return 0

    # to sort the array elements to calculate the max difference between 
    # two adjacent elements
    a.sort()    

    max_d = 0
    for i in range(len(a)-1):
        if abs(a[i]-a[i+1])>max_d:
            max_d = abs(a[i]-a[i+1])
    
    return max_d



a = list(map(int,input().split()))
result = max_difference(a)
print(result)