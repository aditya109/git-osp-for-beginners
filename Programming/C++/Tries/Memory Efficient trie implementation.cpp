/*
We only store the nodes here that are in the trie not the null nodes which are not required.
For doing this we use map.
*/

#include<bits/stdc++.h>
using namespace std;
#define int long long
#define pb push_back
#define inf 1e9
#define mod 1000000007
#define ff first
#define ss second

struct trie
{
	unordered_map<char, struct trie*> m1;
	bool isend;
	trie()
	{
		isend = false;
	}
};
struct trie *root;

void insert(string str)
{
	struct trie *curr = root;
	for (char ch : str)
	{
		if (!curr->m1.count(ch))
		{
			curr->m1[ch] = new trie();
		}
		curr = curr->m1[ch];
	}
	curr->isend = true;
}

bool search(string str)
{
	struct trie *curr = root;
	for (char ch :  str)
	{
		if (!curr->m1[ch])
		{
			return false;
		}
		curr = curr->m1[ch];
	}
	return curr->isend;
}

void solve()
{
	int n;
	cin >> n;
	root = new trie;
	while (n--)
	{
		string str;
		cin >> str;
		insert(str);
	}
	int q;
	cin >> q;
	while (q--)
	{
		string str;
		cin >> str;
		if (search(str))
		{
			cout << str << " is present" << "\n";
		}
		else
		{
			cout << str << " is not present" << "\n";
		}
	}
}

signed main()
{
	ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
	solve();
	return 0;
}
