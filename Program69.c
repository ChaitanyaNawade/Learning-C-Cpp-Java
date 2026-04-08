#include<stdio.h>

int CountVowel(char *Arr)
{
    int i = 0 , iCount = 0;

    while(Arr[i] != '\0')
    {
        if(Arr[i] == 'a' || Arr[i] == 'A' || Arr[i] == 'e' || Arr[i] == 'E' || Arr[i] == 'i' || Arr[i] == 'I' || Arr[i] == 'o' || Arr[i] == 'O' || Arr[i] == 'u' || Arr[i] == 'U')
        {
            iCount++;
        }
        i++;
    }
    return iCount;
}
int main()
{
    int iRet = 0;

    char string[] = "Hello";

    iRet =  CountVowel(string);

    printf("The number of vowels in string is : %d",iRet);
    
    return 0;
}