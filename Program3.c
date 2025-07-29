#include<stdio.h>
#include<stdlib.h>
struct Demo
{
   int data;
   struct Demo * next; 
};

typedef struct Demo DEMO;
typedef struct Demo * PDEMO;
typedef struct Demo ** PPDEMO;


int main()
{
    PDEMO head = NULL;
    PDEMO newn1 = NULL;
    PDEMO newn2 = NULL;
    PDEMO newn3 = NULL;


    newn1 = (PDEMO)malloc(sizeof(DEMO));
    newn2 = (PDEMO)malloc(sizeof(DEMO));
    newn3 = (PDEMO)malloc(sizeof(DEMO));


            newn1 ->data = 11;
            newn2 ->data = 21;
            newn3 ->data = 51;

            newn1-> next = newn2;
            newn2-> next = newn3;
            newn3-> next = NULL;

            head = newn1;

            printf("| %d |->",newn1->data);
            printf("| %d |->",newn1->next->data);
            printf("| %d |",newn1->next->next->data);


            free(newn1);
            free(newn2);
            free(newn3);


    return  0;
}