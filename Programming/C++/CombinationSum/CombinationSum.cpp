class Solution
{
public:
    vector<vector<int>> vec;

    void helper(vector<int> &nums, int key, vector<int> &currentItems, int idx = 0)
    {
        if (key == 0)
        {
            vec.push_back(currentItems);
            return;
        }

        if (key < 0)
            return;
        if (idx < nums.size())
        {
            currentItems.push_back(nums[idx]);
            helper(nums, key - nums[idx], currentItems, idx); // if not same element then idx+1
            currentItems.pop_back();
            helper(nums, key, currentItems, idx + 1);
        }
    }

    vector<vector<int>> combinationSum(vector<int> &candidates, int target)
    {
        vector<int> res;
        helper(candidates, target, res);

        return vec;
    }
};