/*Q21. Create a singly linked list. Group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
The first node is considered odd, and the second node is even, and so on.
Note that the relative order inside both the even and odd groups should remain as it was in the input.
Expamples:
Input:  1->2->3->4->5
Output: 1->3->5->2->4
Input: 2->1->3->5->6->4->7
Output: 2->3->6->7->1->5->4 */


#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};

void create(struct node **start, int n)
{
    struct node *temp = *start;
    struct node *new = (struct node *)malloc(sizeof(struct node));
    new->data=n;
    new->next=NULL;
    if(*start == NULL)
        *start=new;
    else
    {
        temp=*start;
        while(temp->next!=NULL)
            temp=temp->next;
        temp->next=new;
    }
}

struct node *rearrangeEvenOdd(struct node **start)
{
    if (*start == NULL)
        return NULL;
    struct node *odd = *start;
    struct node *even = (*start)->next;
    struct node *even_First = even;
 
    while (1)
    {
        if ( !(even->next)|| !odd || !(even))
        {
            odd->next = even_First;
            break;
        }
        odd->next = even->next;
        odd = even->next;

        if (odd->next == NULL)
        {
            even->next = NULL;
            odd->next = even_First;
            break;
        }
        even->next = odd->next;
        even = odd->next;
    }
 
    return *start;
}

void display(struct node **start)
{
    struct node *temp=*start;
    while(temp!=NULL)
    {
        printf("%d\t",temp->data);
        temp=temp->next;
    }
    printf("\n");
}

int main()
{
    int choice=1,n;
    struct node *start=NULL;
    while(choice!=0)
    {
        printf("Enter:\n");
        printf("1 To create a node\n");
        printf("2 To rearrange the node\n");
        printf("3 To display\n");
        printf("0 To EXIT\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
            printf("Enter the data ");
            scanf("%d",&n);
            create(&start,n);
            break;
            case 2:
            printf("Rearranging... \n");
            start=rearrangeEvenOdd(&start);
            break;
            case 3:
            printf("Display the Current list :\n");
            display(&start);
            break;
            case 0:
            printf("EXITING\n");
            break;
            default:
            printf("Invalid Choice\n");
        }
    }
    return 0;
}
