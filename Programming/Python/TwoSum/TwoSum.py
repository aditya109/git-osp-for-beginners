
class Solution(object):
    def twoSum(self, nums, target):

        lookup = {}
        for i, num in enumerate(nums):
            if target - num in lookup:
                return [lookup[target - num], i]
            lookup[num] = i
        return []

    def twoSum2(self, nums, target):

        k = 0
        for i in nums:
            j = target - i
            k += 1
            tmp_nums = nums[k:]
            if j in tmp_nums:
                return [k - 1, tmp_nums.index(j) + k]

if __name__ == '__main__':
    print(Solution().twoSum((2, 7, 11, 15), 9))