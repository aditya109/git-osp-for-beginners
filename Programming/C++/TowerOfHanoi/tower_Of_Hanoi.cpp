#include <bits/stdc++.h> 
using namespace std; 
  
void tower_Of_Hanoi(int n, char from, char to, char aux)  
{  
    if (n == 1)  
    {  
        cout << "Move disk 1 from rod " << from <<  " to rod " << to<< "\n";  
        return;  
    }  
    tower_Of_Hanoi(n - 1, from, aux, to);  
    cout << "Move disk " << n << " from rod " << from << " to rod " << to << "\n";  
    tower_Of_Hanoi(n - 1, aux, to, from);  
}  
int main()  
{  
    int n;
    cout << "Enter the number of disks :\n";
    cin >> n; 
    tower_Of_Hanoi(n, 'A', 'C', 'B'); // A, B and C are the name of rods  
    return 0;  
}  