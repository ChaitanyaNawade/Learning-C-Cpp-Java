#include<stdio.h>

int Factorial(int iNo)
{
    static int iCnt = 1;
    static int iFact = 1;
    
    if(iCnt <= iNo)
    {
        iFact = iFact * iCnt;
        iCnt++;

        Factorial(iNo);
     }
    return iFact;
}

int main()
{
    int iRet = 0;

    iRet = Factorial(5);
 
    printf("Factorial is   %d",iRet);
    
    return 0;
}