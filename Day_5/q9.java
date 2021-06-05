/* Given an array of distinct positive integers, print all triplets that form an arithmetic progression with an integral common difference.
Example:
        Input:  A[] = { 1, 3, 5, 6, 8, 9, 15 }
        Output:
        1 3 5
        1 5 9
        3 6 9
        1 8 15
        3 9 15
*/

import java.util.*;
public class Main
{
public static void findTriplets(int arr[],int n)
    {
        if (n < 3) 
            return;
        for (int j = 1; j < n - 1; j++)
        {
            int i = j - 1, k = j + 1;
            while (i >= 0 && k < n)
            {
                if (arr[i] + arr[k] == (2 * arr[j]))
                {
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    k++; 
                    i--;
                }
                else if (arr[i] + arr[k] < (2 * arr[j])) 
                    k++;
                else 
                    i--;
            }
        }
    }
    
    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of elements ");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements ");
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            System.out.println(("The triplets that form an arithmetic progression :"));
            findTriplets(arr,n);
            
        }
}
