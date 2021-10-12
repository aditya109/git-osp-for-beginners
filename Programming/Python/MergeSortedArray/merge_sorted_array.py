def merge( nums1, m: int, nums2, n: int):
    #last index of nums1
    last_index = m+n-1

    while m>0 and  n> 0:
        #checking from the last-most element of nums1 and nums2
        if nums1[m-1]<nums2[n-1]:
            nums1[last_index]= nums2[n-1]
            n-=1

        else:
            nums1[last_index] = nums1[m - 1]

            m-=1

        last_index-=1

    while n>0:
        nums1[last_index] = nums2[n-1]
        n-=1
        last_index-=1


    return nums1



nums1 = []
nums2 = []

# number of elements as input
m = int(input("Enter size of first list : "))
n = int(input("Enter size of second list : "))


print("Enter first list elements")
for i in range(0, m+n):
    if i<m:
          nums1.append(int(input()))  # adding the element
    else:
          nums1.append(0)

print("Enter second list elements")

for i in range(0, n):
   nums2.append(int(input()))  # adding the element

#Calling the function for merging sorted array
print(merge(nums1,m,nums2,n))


"""
OUTPUT:
Enter size of first list : 3
Enter size of second list : 3
Enter first list elements
1
2
3
Enter second list elements
2
5
6
[1, 2, 2, 3, 5, 6]

"""