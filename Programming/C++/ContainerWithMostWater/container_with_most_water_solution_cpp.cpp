/*
 Problem Statement:
    Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai),
    n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). 
    Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
    Notice that you may not slant the container.
    
    Example:
        Input  : [1, 8, 6, 2, 5, 4, 8, 3, 7]
        Output : 49
        Explanation : The maximum area of water is contained between walls with i=2 (height=8) and i=9 (height=7)
                      So, volume = min(8,7) * (9-2) = 7 * 7 = 49
*/

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    // There are 'n' walls and each wall is a vertical line from point (i,0) to (i,a[i]).
    int n;
    cin>>n;
    
    vector<ll> a(n);
    for(int i=0; i<n; i++)
    {
        cin>>a[i];
    }
    
    int i=0;            // i = x_coordinate for left_wall
    int j=n-1;          // j = x_coordinate for right_wall
    int max_vol = 0;    // Max. possible area/volume of water that can be stored
    
    while(i < j)
    {
        /*
        Container will have the height as the minimum of the height of the two walls (a[i] & a[j]) 
        and base as the distance between two walls (j-i)
        */
        int vol = min(a[i], a[j]) * (j-i);
        
        // Assign max. area/volume as the maximum of calculated volume and the max. area/volume calculated so far.
        max_vol = max(max_vol, vol);
        
        /*
        If left wall has less height than right wall, then
            We move to right to find walls higher than a[i] to increase the volume
            Note : As we increase x_coordinate, volume will decrease (as base length decreases)
                   and thus we check for higher walls to compensate for that and also find higher possible areas/volumes.
        
        If left wall has more or equal height than right wall, then
            We move to left to find higher walls than a[j] to increase the area/volume for the same reason as mentioned above.
        
        We continue this till we get left and right walls as adjacent to each other.    
        */
        if(a[i] < a[j])
            i++;
        else
            j--;
    }
    
    cout<<max_vol;
    
    return 0;
}