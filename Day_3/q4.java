/*Suppose an image can be represented as a 2D array of 0s and 1s. Write a function to reverse an image. Replace the 0s with 1s and vice versa.

  Example :
      [1, 0, 0],
      [0, 1, 0],
      [0, 0, 1]
   ➞ 
      [0, 1, 1],
      [1, 0, 1],
      [1, 1, 0]
    
*/

import java.util.*;
public class q4
{
    static void display(int arr[][], int m, int n)
    {
        for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		    System.out.print(arr[i][j] +" ");
		    }
		    System.out.println();
		}
    }
    static void reverse(int arr[][], int m, int n)
    {
        for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        arr[i][j] = 1-arr[i][j];
		    }
		}
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int m=sc.nextInt();
		System.out.print("Enter the number of columns : ");
		int n=sc.nextInt();
		int arr[][] = new int[m][n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		    arr[i][j]=sc.nextInt();
		    }
		}
		System.out.println("The 2D matrix is :");
		display(arr,m,n);
		reverse(arr,m,n);
		System.out.println("The 2D matrix after reversing is :");
		display(arr,m,n);
	}
}
