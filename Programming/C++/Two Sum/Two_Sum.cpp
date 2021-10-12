class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) 
    {
        int n = numbers.size(); // size of the array
        
        // Initially, start points to the start of the array and end points to the end.
        int start = 0, end = n-1;
        while (start < end)
        {
            
            if (numbers[start] + numbers[end] == target) 
            {
                // Sum of values at start and end equals target
                return {start+1, end+1};
            }
            else if (numbers[start] + numbers[end] < target)
            {
                // sum is less than target: In such cases we need to increase sum.
                // since the array is sorted in non-decreasing order, upon decreasing end pointer we would decrease the value of sum so
                // we should increase start pointer's value
                start++;
            }
            else
            {
                // sum > target: We should try to decrease sum.
                // since the array is sorted in non-decreasing order, we should decrease end pointer's value.
                end--;
            }
        }
        
        // it is guaranteed that there exists exactly one solution so we would not reach this point.
        return {0, 0};
    }
};