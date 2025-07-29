#include<stdio.h>


struct Demo
{
    int data;
    struct Demo * next;
};

typedef struct Demo DEMO;
typedef struct Demo * PDEMO;
typedef struct Demo ** PPDEMO;

void InsertFisrt(PPDEMO first, int no)
{
    PDEMO newn = (PDEMO)malloc(sizeof(DEMO));

    newn ->data = no;
    newn ->next = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else
    {
        newn->next = *first;
    }

}


int main()
{
     PDEMO head = NULL;

     InsertFisrt(&head,11);
     
    return 0;
}