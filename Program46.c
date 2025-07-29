#include<stdio.h>
int Factorial(int iNo)
{
    int iCnt = 1;
    int iFact = 1;

    while(iCnt <= iNo)
    {
        iFact = iFact * iCnt;
        iCnt ++;
    }
    return iFact;
}

int main()
{
    int iValue = 6;
    int iRet = 0;
    iRet = Factorial(iValue);
    printf("The factorial is : %d",iRet);
    return 0;
}