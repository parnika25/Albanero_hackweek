/* Remove the duplicate nodes from the sorted Linked list. The list should only be traversed once. 
Example:
        Input: 1->1->2->2->3->4->5->5
        Output: 1->2->3->4->5
*/

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

void duplicate(struct node **start)
{
    struct node *temp = *start;
    while((temp->next)!=NULL)
    {
        if((temp->data) == (temp->next->data))
        {
            free(temp->next);
            (temp->next)=(temp->next->next);
            temp=temp->next;
        }
        else
        temp=temp->next;
    }
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
        printf("2 To remove duplicate nodes\n");
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
            printf("Removing Duplicate nodes... \n");
            duplicate(&start);
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
