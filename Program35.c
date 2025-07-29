#include<stdio.h>
int Display()
{
     int i  = 0;
     int iSum = 0;
   
    while(i <= 5)
    {
    iSum = iSum + i;

    i++;
    }
    return iSum;
}

int main()
{
    
    int iRet = 0;
    iRet = Display();
    printf("The sum is : %d",iRet);
    return 0;
}