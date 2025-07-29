/*
in this code i created a two pointer insdie the structure which points to the member of main function and how we can access them
*/
#include<stdio.h>
struct Demo
{
    int *p;
    float *q;
    double d;

};
int main()
{
    int no = 11;
    float f= 10.2;
    struct Demo dobj;
     
    dobj.p = &no;
    dobj.q = &f;
    dobj.d = 10.555555;

    printf("%d\n",*(dobj.p));
    printf("%f\n",*(dobj.q));
    printf("%f\n",dobj.d);
    return 0;
}