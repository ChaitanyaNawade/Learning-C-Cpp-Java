#include<stdio.h>

int Factorial(int iNo)
{
    static int iCnt = 1;
    static int iFact = 1;
    
    if (iNo > 0)
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

    int iValue = 0;

    printf("Enter the number \n");

    scanf("%d",&iValue);

    iRet = Factorial(iValue);
 
    printf("Factorial is   %d",iRet);
    
    return 0;
}