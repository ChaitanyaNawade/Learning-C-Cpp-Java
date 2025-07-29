#include<stdio.h>
void Display()
{
    static int i = 1;                //value gets prevserved across the function call
    
    if(i <= 5)

    printf("Jay Ganesh..%d\n",i);

    i++;

    Display();
    
}
int main()
{
    Display();
    return 0;
}