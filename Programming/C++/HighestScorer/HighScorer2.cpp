#include <iostream>

using namespace std;

int main()
{
    int score[11]={0};
    string name[11]={""};
    cout<<"Enter the details 11 players"<<endl;
    int max=0,maxpos=0;
    for(int i=0;i<11;i++)
    {
        cout<<"Enter the name of player "<<i+1<<endl;
        cin>>name[i];
        cout<<"Enter the score of player "<<i+1<<endl;
        cin>>score[i];
        if(max<score[i])
        {
            max=score[i];
            maxpos=i;
        }
    }
    
    cout<<endl<<"Highest scorer details: "<<endl<<"Name: "<<name[maxpos]<<endl<<"Score: "<<score[maxpos]; 

    return 0;
}
