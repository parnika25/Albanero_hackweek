/* You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.
  Examples:
  Input: cost = [10,15,20]
  Output: 15
  Explanation: Cheapest is: start on cost[1], pay that cost, and go to the top.
  Input: cost = [1,100,1,1,1,100,1,1,100,1]
  Output: 6
  Explanation: Cheapest is: start on cost[0], and only step on 1s, skipping cost[3].
*/ 


import java.util.*;
public class q8
{
   static int find_min(int i,int arr[])
   {
          if(i>=arr.length)
            return 0;
          int minimum = Math.min(find_min(i+1,arr),find_min(i+2,arr));
          return (minimum+arr[i]);
    }
    static int min_Cost(int arr[])
    {
          int cost = Math.min(find_min(0,arr),find_min(1,arr));
          return cost;
    }

    public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of array : ");
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    System.out.println("Enter the elements of the array :");
	    for(int i=0;i<n;i++)
	        arr[i]=sc.nextInt();
    	System.out.println("The minimum cost to be paid is : "+ min_Cost(arr));
	}
}
