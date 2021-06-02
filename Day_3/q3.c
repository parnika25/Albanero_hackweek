/*Create a singly linked-list. The list can be represented as:
  L0 -> L1 -> … → Ln - 1 -> Ln
  Reorder the list to be in the following form:
  L0 -> Ln -> L1 → Ln - 1 -> L2 -> Ln - 2 -> …
  You can not modify the values in the list's nodes. Only nodes themselves can be changed.
  Expamples:
  Input: 1->2->3->4
  Output: 1->4->2->3
  Input: 1->2->3->4->5
  Output: 1->5->2->4->3 */

#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};

struct node * create(int n)
{
    struct node *new = (struct node *)malloc(sizeof(struct node));
    new->data=n;
    new->next=NULL;
    return new;
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

void rearrange(struct node **start)
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
    (*start)=create(0);

    struct node *curr = *start;
    while (head1 || head2) 
    {
        if (head1) 
        {
            curr->next = head1;
            curr = curr->next;
            head1 = head1->next;
        }
 
        if (head2) 
        {
            curr->next = head2;
            curr = curr->next;
            head2 = head2->next;
        }
    }
    *start = (*start)->next;
}

void display(struct node *start)
{
    struct node *temp=start;
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
	struct node* start = create(1);
	start->next = create(2);
	start->next->next = create(3);
	start->next->next->next = create(4);
	start->next->next->next->next = create(5);
        printf("Original List : ");
	display(start); 
	rearrange(&start);
        printf("Rearranged List : ");
	display(start); 
	return 0;
}
