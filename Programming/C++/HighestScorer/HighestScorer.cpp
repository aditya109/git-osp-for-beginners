#include<iostream>
#include<cstring>
using namespace std;

int main(){

    int highestScore=0,players=11,currentScore;
    string highestScorerName,currentScorerName;
    
    for(int i=0;i<players;i++){
        cout<<"Name of player: "<<i+1<<":: ";
        cin>>currentScorerName;

        cout<<"Score of "<<currentScorerName<<":: ";
        cin>>currentScore;

        if(currentScore>highestScore){
            highestScore=currentScore;
            highestScorerName=currentScorerName;
        }
    }

    cout<<"Highest scorer is "<<highestScorerName<<". Scored "<<highestScore<<" runs"<<endl;

    return 0;
}