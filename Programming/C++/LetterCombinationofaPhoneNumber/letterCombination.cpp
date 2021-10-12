#include <iostream>
#include <cstring>
#include <vector>
#include <unordered_map>
using namespace std;

vector <string> res;
void possibleCombinations(string &digit,int index,unordered_map <int,string> &map,string &ans){
    if(index == digit.length()){
        res.push_back(ans);
        return;
    }
    int current = digit[index] - '0';
    string output = map[current];
    for(int j=0; j<output.length(); j++){
        ans.push_back(output[j]);
        possibleCombinations(digit,index+1,map,ans);
        ans.pop_back();
    }
}
vector<string> letterCombinations(string digits) {
        if(digits == "")
            return {};
        unordered_map <int,string> map;
        map[2] = "abc";
        map[3] = "def";
        map[4] = "ghi";
        map[5] = "jkl";
        map[6] = "mno";
        map[7] = "pqrs";
        map[8] = "tuv";
        map[9] = "wxyz";
        string ans = "";
        possibleCombinations(digits,0,map,ans);
        return res;
}
int main()
{
    string digits;
    cout << "Type digits in range of (2,9)";
    cin >> digits; 
    vector<string> fRes;
    fRes = letterCombinations(digits);
    for(auto i = fRes.begin(); i != fRes.end(); i++) {
        cout<< *i << " "; 
    }
    return 0;
}
