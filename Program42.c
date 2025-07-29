#include<stdio.h>
int Summation(int iNo)
{
    int iCnt = 0;
    int iSum = 0;
    for(iCnt = 1; iCnt <= iNo ; iCnt++)
    {
        iSum = iSum + iCnt;
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