#include<stdio.h>
struct demo
{
    int i;
    int j;
};
struct demox
{
    int k;
    int l;
    struct demo dobj;
};
int main()
{
    struct demox ddobj;
    ddobj. dobj.i= 10;
    ddobj.dobj.j = 20;
    ddobj.k = 30;
    ddobj.l = 40;

    printf("%d\n",ddobj.dobj.i);
    printf("%d\n",ddobj.dobj.j);
    printf("%d\n",ddobj.k);
    printf("%d\n",ddobj.l);
    

    return 0;
}