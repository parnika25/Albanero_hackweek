/* Given an M X N matrix, print the matrix in spiral order.
Example: 
      Input: 
      [  1   2   3   4  5 ]
      [ 16  17  18  19  6 ]
      [ 15  24  25  20  7 ]
      [ 14  23  22  21  8 ]
      [ 13  12  11  10  9 ]
      Output: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
*/

import java.util.*;
public class q10
{

        static void spiral( int arr[][], int m, int n)
        {
                int i, x = 0, y = 0;
         
                /*  x - starting row index
                    m - no of rows
                    y - starting column index
                    n - no of columns
                */
         
                while (x < m && y < n) 
                {
                    for (i = y; i < n; i++) 
                    {
                        System.out.print(arr[x][i] + " ");
                    }
                    x++;
         
                    for (i = x; i < m; i++) 
                    {
                        System.out.print(arr[i][n - 1] + " ");
                    }
                    n--;
                    
                    if (x < m) 
                    {
                        for (i = n - 1; i >= y; i--) 
                        {
                            System.out.print(arr[m - 1][i] + " ");
                        }
                        m--;
                    }
         
                    if (y < n) 
                    {
                        for (i = m - 1; i >= x; i--) 
                        {
                            System.out.print(arr[i][y] + " ");
                        }
                        y++;
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
    		for(int i=0;i<m;i++)
		    {
    		    for(int j=0;j<n;j++)
		        {
		            System.out.print(arr[i][j] +" ");
		        }
		           System.out.println();
		    }   
		    System.out.println("The matrix in spiral order ");
    		spiral(arr,m,n);
            
        }
}
