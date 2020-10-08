// Problem Statement:
// Given two strings s and t , write a function to determine if t is an anagram of s.
// Input: s = "anagram", t = "nagaram"
// Output: true
#include <iostream>
#include <unordered_map>
#define boost() ios_base::sync_with_stdio(false);cin.tie(NULL); cout.tie(NULL);
using namespace std;
bool validAnagram(const string& s, const string& t) {
    if (s.length() != t.length()) return false;
    unordered_map<char, int> mp;
    for (const char& character: s) {
        mp[character]++;
    }
    for (const char& character: t) {
        if (mp[character] < 1) {
            return false;
        }
        mp[character]--;
    }
    return true;
}
int main() {
    boost();
    string s, t;
    cin >> s >> t;
    validAnagram(s, t) ? cout << "Yes" : cout << "No";
    return 0;
}