#include<stdio.h>
struct Demo
{
    int i;
    float j;
    double d;
};
int main()
{
    struct Demo dobj;
    struct Demo *ptr = &dobj;
    ptr->i = 10;
    ptr ->j = 10.2;
    ptr ->d = 10.5545;

    printf("%d\n",ptr->i);
    printf("%f\n",ptr->j);
    printf("%f\n",ptr->d);

 return 0;
}