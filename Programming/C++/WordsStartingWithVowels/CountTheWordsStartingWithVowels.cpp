#include<iostream.h>
#include<conio.h>
#include<string.h>

void main()
{
int vc=0;
char sen[25], ch;

cout<< "\n Type A Sentance:";
cin.getline(sen,25);

for(int i =0; sen[i]!='\0'; i++)
{
if(sen[i]==' ')
{
while(sen[i] = =  ' ')  /* remove multiple space */
i++;

ch = toupper(sen[i]);

switch(ch)
{
case 'A':
case 'E':
case 'O':
case 'I':
case 'U':
                  vc++;
}
 }
}
cout<<"\n  The total number of words starting with a vowel is : "<< vc;

getch();
}