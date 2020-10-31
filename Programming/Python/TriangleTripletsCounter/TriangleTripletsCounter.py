class Solution:

    def binarySearch(self, nums, l, r, target):
        while l < r:
            mid = (l + r) // 2
            if nums[mid] >= target:
                r = mid
            else:
                l = mid + 1
        return l if target <= nums[l] else l + 1

    # This algorithm will give us O(n^2logn) time complexity.
    def triangleNumber(self, nums):
        nums.sort()
        result = 0
        for i in range(len(nums) - 2):
            for j in range(i + 1, len(nums) - 1):
                k = self.binarySearch(nums, j + 1, len(nums) - 1, nums[i] + nums[j])
                result += (k - 1) - j
        return result






