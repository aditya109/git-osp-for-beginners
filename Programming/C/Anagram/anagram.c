#include <stdio.h>
#include <ctype.h>
int check_anagram(char [], char []);

int main()
{
  char a[1000], b[1000];

  printf("Enter two strings\n");
  gets(a);
  gets(b);

  if (check_anagram(a, b))
   {
    printf("The strings are anagrams.\n");
    getch();
   }
  else
    {
    printf("The strings aren't anagrams.\n");
    getch();
    }

  return 0;
}

int check_anagram(char a[], char b[])
{
  int first[26] = {0}, second[26] = {0}, c=0;

  // Calculating frequency of characters of the first string

  while (a[c] != '\0')
  {

    if(isupper(a[c]))
    {
      a[c]=tolower(a[c]);
    }

    first[a[c]-'a']++;

    c++;
  }

  c = 0;

  while (b[c] != '\0')
  {
    if(isupper(b[c]))
    {
      b[c]=tolower(b[c]);
    }

    second[b[c]-'a']++;

    c++;
  }

  // Comparing the frequency of characters

  for (c = 0; c < 26; c++)
  {

    if (first[c] != second[c])
     {
      return 0;
     }
  }
  return 1;
}
