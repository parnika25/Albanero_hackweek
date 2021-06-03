/* Write a program that sorts an array and removes all duplicate items from it.

  Examples
    ([1, 3, 3, 5, 5]) ➞ [1, 3, 5]
    ([4, 4, 4, 4]) ➞ [4]
*/

import java.util.*;
public class q2
{
    public static int transformed_set(int arr[], int n)
    {
        if (n == 1) 
        {
            return n;
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int j = 0;
        for (int i = 0;i<n-1;i++) 
        {
            if (arr[i] != arr[i + 1]) 
            {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        return j;
    }
    
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of elements ");
	    int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
		    arr[i]= sc.nextInt();
		}
		System.out.println("The array after modification :");
		for (int i = 0; i < transformed_set(arr,n); i++)
                System.out.print(arr[i] + " ");
	
		
	}
}
