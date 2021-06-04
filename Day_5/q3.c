/* A sparse matrix has many zero elements. For example, the following 4x4 matrix is a sparse Matrix. 
Conventional method of representation of such a matrix is not space efficient. It will be prudent to store non-zero elements only. 
If this is done, then the matrix may be thought of as an ordered list of non-zero elements. 
Information about non-zero elements have three parts. Row, Column and its value. */

#include<stdio.h>
#include<stdlib.h>
struct node
{ 
    int row;
    int col;
    int val;
    struct node *next;
}*start;

void create(int A[5][5],int r,int c)
{
    int i,j;
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            if((A[i][j])!=0)
            {
                struct node *new=(struct node *)malloc(sizeof(struct node));
                new->row=i;
                new->col=j;
                (new->val)=A[i][j];
                new->next=NULL;
                if(start->next==NULL)
                {
                start->next=new;
            }
            else
            {
                struct node *temp=(start->next);
                while(temp->next!=NULL)
                temp=temp->next;
                temp->next=new;
            }
            (start->val)++;
            }
        }
    }
}


void display()
{
    struct node *temp=start->next;
    printf("%d\t%d\t%d\n",start->row,start->col,start->val);
    while(temp!=NULL)
    {
        printf("%d\t%d\t%d\n",temp->row,temp->col,temp->val);
        temp=temp->next;
    }
}


int main()
{
    int A[5][5];
    int r,c,ch=1,i,j;
    printf("Enter the no. of rows and columns\n");
    scanf("%d%d",&r,&c);
    start=(struct node *)malloc(sizeof(struct node));
    start->row=r;
    start->col=c;
    start->val=0;
    start->next=NULL;
    printf("Enter the elements of the matrices\n");
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            scanf("%d",&A[i][j]);
        }
     }
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            printf("%d\t",A[i][j]);
        }
        printf("\n");
    }

    while(ch!=0)
    {
        printf("Enter your choice\n");
        printf("1 Create\n2 Display in triplet format \n0 To Exit\n");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:
            create(A,r,c);
            break;
            case 2:
            display();
            break;
            default:
            printf("\n");
        }
    }
    printf("EXIT\n");
    return 0;
}
