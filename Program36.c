#include<stdio.h>
int Display()
{
    static int i  = 1;
    static int iSum = 0;
   
    if(i <= 5)
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