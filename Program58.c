#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node *PNODE;
typedef struct node **PPNODE;


void InsertFirst(PPNODE first,int no)
{
    PNODE newn = NULL;

    newn =(PNODE)malloc(sizeof(NODE));

    newn->data = no;
    newn->next = NULL;

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

void InsertLast(PPNODE first,int no)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn =(PNODE)malloc(sizeof(NODE));

    newn ->data = no;
    newn ->next = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else 
    {
        temp = *first;

        while(temp ->next != NULL)
        {
            temp = temp ->next;
        }
        temp ->next = newn;
    }
}

void DeleteFirst(PPNODE first)
{
    PNODE temp = NULL;

                                                  //If LL is empty 
    if(*first == NULL)    
    {
        printf("The linked list is empty\n");
        return;
    }
                                                 //If LL contains at least one element
    if((*first)->next == NULL)
    {
        free(*first);
        *first = NULL;
    }
    else                                          //If LL contains more than one element
    {
        temp =  *first;
        *first = (*first)->next;
        free(temp);
    }
}


void DeleteLast(PPNODE first)
{
    PNODE temp = NULL;

    if(*first == NULL)
    {
        printf("Linked List is empty\n");
        return;
    }

    if((*first)->next == NULL)
    {
        free(*first);
        *first = NULL;
    }
    else 
    {
        temp = *first;

        while(temp->next->next != NULL)
        {
            temp = temp ->next;
        }

        free(temp->next);
        temp ->next = NULL;
    }
}


void Display(PNODE first)
{
    while(first != NULL)
    {
        printf("| %d |->",first->data);
        first = first->next;
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

void InsertAtPos(PPNODE first,int pos,int no)
{
    PNODE temp = NULL;
    PNODE newn = NULL;
    int iCnt = 0;
    int iCount = 0;

    newn =(PNODE)malloc(sizeof(NODE));
    newn->data = no;
    newn->next = NULL;

    iCount = Count(*first);

    if(pos < 1 || pos > iCount + 1)
    {
        printf("Invalid position\n");
        return ;
    }

    if(pos == 1)
    {
        InsertFirst(first,no);
    }
    else if(pos == iCount+1)
    {
        InsertLast(first,no);
    }
    else 
    {
        temp = *first;

        for(iCnt = 1; iCnt <= pos -2; iCnt++)
        {
            temp = temp->next;
        }
        newn->next = temp ->next;
        temp ->next = newn;
    }
}

void DeleteAtPos(PPNODE first,int pos)
{
    PNODE temp = NULL;

    PNODE target = NULL;

    int iCount = Count(*first);

    int iCnt = 0;

    if(pos < 1 || pos > iCount)
    {
        printf("Invalid position\n");
        return;
    }

    if(pos == 1)
    {
        DeleteFirst(first);
    }
    else if(pos == iCount)
    {
        DeleteLast(first);
    }

    else 
    {
        temp = *first;

        for(iCnt = 1; iCnt <= pos - 2;iCnt++)
        {
            temp = temp ->next;
        }
        target = temp ->next;
        temp ->next = target ->next;
        free(target);
    }
}

int main()
{
    PNODE head = NULL;
    int iRet = 0;

    InsertFirst(&head,51);
    InsertFirst(&head,21);
    InsertFirst(&head,11);
    Display(head);
    iRet = Count(head);
    printf("The number of elements in the linked list are : %d\n",iRet);
    
    InsertLast(&head,101);
    InsertLast(&head,111);
    InsertLast(&head,121);
    Display(head);
    iRet = Count(head);
    printf("The number of elements in the linked list are : %d\n",iRet);

    DeleteFirst(&head);
    Display(head);
    iRet = Count(head);
    printf("The number of elements in the linked list are : %d\n",iRet);

    DeleteLast(&head);
    Display(head);
    iRet = Count(head);
    printf("The number of elements in the linked list are : %d\n",iRet);

    InsertAtPos(&head,5,105);
    Display(head);
    iRet = Count(head);
    printf("The number of elements in the linked list are : %d\n",iRet);

    DeleteAtPos(&head,4);
    Display(head);
    iRet = Count(head);
    printf("The number of elements in the linked list are : %d\n",iRet);
    return 0;
}