#include<stdio.h>
int Factorial(int iNo)
{
    static int iFact = 1;

    if(iNo > 1)
    {
        iFact = iFact * iNo;
        // iNo--;
        Factorial(--iNo);
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