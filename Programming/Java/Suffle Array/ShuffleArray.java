class Solution {
    public int[] shuffle(int[] nums, int n) {
        int max = 1001; // M in the above explanation
        
        for(int i=n;i<nums.length;i++){
            nums[i] = max*nums[i]+nums[i-n];
        }

        int ind = 0;
        for(int i=n;i<nums.length;i++){
            nums[ind] = nums[i]%max;
            nums[ind+1] = nums[i]/max;
            ind+=2;
        }
        
        return nums;
    }
}
