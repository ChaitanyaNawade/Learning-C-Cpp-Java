#include<stdio.h>
#include<stdlib.h>
struct node 
{
    int data;
    struct node *next;
};

typedef struct node  NODE;
typedef struct node *  PNODE;
typedef struct node ** PPNODE;

void InsertFirst(PPNODE first,int no)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn ->data = no;
    newn ->next = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else
    {
        newn ->next = *first;
        *first = newn;
    }
}

void InsertLast(PPNODE first,int no)   //call by address ahe function
{
    PNODE newn = NULL;
    PNODE temp = NULL;
    temp = *first;
    newn = (PNODE)malloc(sizeof(NODE));

    newn ->data = no;
    newn ->next = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else
    {
        while(temp ->next != NULL)
        {
            temp = temp ->next;
        }
        temp ->next = newn;
        newn ->next = NULL;
    }
}

void Display(PNODE first)               // ith 100 call by value 
{
    PNODE temp = first;
    while(first != NULL)
    {
        printf("|%d|->",first ->data);
        first = first ->next;
    }
    printf("NULL\n");
}

int Count(PNODE first)
{
  int iCount = 0;
   while(first != NULL)
   {
    iCount++;
    first = first ->next;
   }
   return iCount;
}

int main()
 {
    PNODE head = NULL;
    int iRet = 0;

    InsertFirst(&head,51);

    InsertFirst(&head,21);

    InsertFirst(&head,11);


    InsertLast(&head,101);

    InsertLast(&head,111);

    InsertLast(&head,121);

    Display(head);

    iRet = Count(head);

    printf("The elements in the LL is : %d",iRet);

    return 0;
 }