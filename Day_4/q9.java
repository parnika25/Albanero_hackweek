/*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum. */

import java.util.*;
public class q9
{
    static int calculate(int arr[], int n)
    {
        int max_sum=0, curr_sum=0;
        for(int i=0;i<n;i++)
        {
            curr_sum=curr_sum+arr[i];
            if(max_sum<curr_sum)
            max_sum=curr_sum;
        }
        return max_sum;
    }
    
    public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of elements : ");
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    System.out.println("Enter the elements of the array :");
	    for(int i=0;i<n;i++)
    	    arr[i]=sc.nextInt();
    	System.out.println("The largest sum of contagious sub-array is : "+calculate(arr,n));
	}
}
