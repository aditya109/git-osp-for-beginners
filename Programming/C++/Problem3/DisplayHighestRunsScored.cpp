#include<bits/stdc++.h>
using namespace std;
struct cricketer
{
    int runs;
    char name[25];
}player[10],temp;
 
int main()
{
    cout<<"Enter player info as name and runs scored\n";
    for(int i=0;i<11;i++)
        cin>>player[i].name>>player[i].runs;
    
   
    for(int i=0;i<11;i++)
    {
        for(int j=0;j<10;j++)
        {
            if(player[j].runs<player[j+1].runs)
            {
                temp=player[j];
                player[j]=player[j+1];
                player[j+1]=temp;
            }
        }
    }
    cout<<player[0].name<<" has made the higest runs i.e. "<<player[0].runs;
    return 0;
}

