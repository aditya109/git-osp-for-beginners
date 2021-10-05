#include <iostream>
#include <vector>

using namespace std;

vector<int> merge(vector<int> a, vector<int> b, int m, int n)
{

    vector<int> res;
    res.resize(m + n);

    int i = 0, j = 0, k = 0;

    while (i < m && j < n)
    {

        (a[i] <= b[j]) ? res[k++] = a[i++] : res[k++] = b[j++];
    }
    while (i < m)
    {
        res[k++] = a[i++];
    }
    while (j < n)
    {
        res[k++] = b[j++];
    }

    return res;
}

int main()
{

    int m, n;
    vector<int> arr1, arr2, res;

    cout << "Enter size for first array:";
    cin >> m;

    cout << "Enter size for second array:";
    cin >> n;

    arr1.resize(m);
    arr2.resize(n);
    res.resize(m + n);

    cout << "Enter first array:";
    for (int i = 0; i < m; i++)
        cin >> arr1[i];
    
    cout << "Enter second array:";
    for (int j = 0; j < n; j++)
        cin >> arr2[j];
    
    res = merge(arr1, arr2, m, n);

    cout << "Merged array:";
    for (int l = 0; l < res.size(); l++)
        cout << res[l] << " ";
    
    return 0;
}