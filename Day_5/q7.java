/* Check if a given linked list is Palindrome or not. If yes return "True" otherwise "False". Expamples:
Input:  1->2->3->2->1
Output: True
Input: 1->2->3->1->2
Output: False
*/

#include<stdio.h>
#include <stdbool.h>
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

void reverse(struct node **start)
{
    struct node* prev = NULL;
    struct node* current = (*start);
    struct node* temp;
    while (current != NULL) 
    {
        temp = current->next;
        current->next = prev;
        prev = current;
        current = temp;
    }
    *start = prev;
}

bool palindrome(struct node **start)
{
    struct node *slow = *start;
    struct node *fast = slow->next;
    while (fast && fast->next) 
    {
        slow = slow->next;
        fast = fast->next->next;
    }
    
    struct node *head1 = *start;
    struct node *head2 = slow->next;
    slow->next = NULL;
    reverse(&head2);

    while ((head1!=NULL) && (head2!=NULL))
    {
        if((head1->data) == (head2->data))
		{
			head1 = head1->next;
			head2 = head2->next;
		}
		else
		{
			return false;				
		}		
	}	
	return true;
}

void display(struct node **start)
{
    struct node *temp= *start;
    while(temp!=NULL)
    {
        printf("%d",temp->data);
        if (temp->next)
			printf("-> ");
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
        printf("2 To display\n");
        printf("3 To check whether the list is palindrome");
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
            printf("Display the Current list :\n");
            display(&start);
            break;
            case 3:
            if(palindrome(&start))
                printf("The List is palindrome.\n");
	        else
	            printf("The List is not a palindrome.\n");
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
