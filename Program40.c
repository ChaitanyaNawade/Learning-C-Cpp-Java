#include<stdio.h>
void Display()
{
    static int i = 0;                //value gets prevserved across the function call
    
    printf("Jay Ganesh..%d\n",i);

    i++;

    Display();
    
}
int main()
{
    Display();
    return 0;
}