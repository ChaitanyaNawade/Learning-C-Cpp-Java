#include<stdio.h>
int Factorial(int iNo)
{
    static int iFact = 1;

    while(iNo > 1)
    {
        iFact = iFact * iNo;
        iNo--;
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