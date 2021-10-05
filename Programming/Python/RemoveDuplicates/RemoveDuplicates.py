# Given an integer array nums(sorted in non-decreasing order),
# remove the duplicates in nums. The relative order of the elemntes is same.
def removeDuplicates(nums):
    k = 0
    for i in range(1, len(nums)):
        if nums[k] != nums[i]:
            k += 1
            nums[k] = nums[i]
    # Return final result length and array
    return k+1, nums
