#include<stdio.h>

int Summation(int iNo)
{
    static int iCnt = 1;
    static int iSum = 0;
    
    if(iCnt <= iNo)
    {
        iSum = iSum + iCnt;
        iCnt++;

        Summation(iNo);
     }
    return iSum;
}

int main()
{
    int iRet = 0;

    iRet = Summation(5);
 
    printf("the Summation of number is %d",iRet);
    
    return 0;
}