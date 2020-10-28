// CPP program to find maximum adjacent difference 
// between two adjacent after sorting. 
#include <bits/stdc++.h> 
using namespace std; 

int maximumGap(vector<int>& nums) {
        int n = nums.size();
        if (n < 2) return 0;
        auto lu = minmax_element(nums.begin(), nums.end());
        int l = *lu.first, u = *lu.second;
        int gap = max((u - l) / (n - 1), 1);
        int m = (u - l) / gap + 1;
        vector<int> bucketsMin(m, INT_MAX);
        vector<int> bucketsMax(m, INT_MIN);
        for (int num : nums) {
            int k = (num - l) / gap;
            if (num < bucketsMin[k]) bucketsMin[k] = num;
            if (num > bucketsMax[k]) bucketsMax[k] = num;
        }
        int i = 0, j; 
        gap = bucketsMax[0] - bucketsMin[0];
        while (i < m) {
            j = i + 1;
            while (j < m && bucketsMin[j] == INT_MAX && bucketsMax[j] == INT_MIN)
                j++;
            if (j == m) break;
            gap = max(gap, bucketsMin[j] - bucketsMax[i]);
            i = j;
        }
        return gap;
    }

int main() 
{ 
    int size, element;
    vector<int> arr;
    cin>>size;
    for(int i=0; i<size; i++) {
      cin>>element;
      arr.push_back(element);
    } 
	cout << maximumGap(arr) << endl; 
	return 0; 
} 
