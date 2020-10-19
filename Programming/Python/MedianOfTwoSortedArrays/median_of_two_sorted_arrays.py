

          
def find_median_of_merged_version_of_two_sorted_array(nums1,nums2):
    i =0
    j=0
    k=0
    merged = [ 0 for i in range(len(nums1)+len(nums2))]
    while i < len(nums1) and j < len(nums2): 
        if nums1[i] < nums2[j]: 
            merged[k] = nums1[i] 
            i+= 1
        else: 
            merged[k] = nums2[j] 
            j+= 1
        k+= 1
        
    while i < len(nums1): 
        merged[k] = nums1[i] 
        i+= 1
        k+= 1
        
    while j < len(nums2): 
        merged[k] = nums2[j] 
        j+= 1
        k+= 1
          
    
    if len(merged)%2==0:
        _1=len(merged)/2-1
        _2=len(merged)/2
        return (merged[ _1]+merged[_2] )/2
    else:
        _1=int((len(merged)-1)/2)
        return merged[_1 ]
          
        
find_median_of_merged_version_of_two_sorted_array([1,3],[2])