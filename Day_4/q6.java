/* You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
  Examples:
  Input: n = 2
  Output: 2
  Explanation: There are two ways to climb to the top.
      1. 1 step + 1 step
      2. 2 steps
  Input: n = 3
  Output: 3
  Explanation: There are three ways to climb to the top.
      1. 1 step + 1 step + 1 step
      2. 1 step + 2 steps
      3. 2 steps + 1 step
*/  

import java.util.*;
public class q6
{
    static int calculate(int n)
    {
        int prev=0,curr=1;
        for(int i=1;i<=n;i++)
        {
            int temp=curr;
            curr = curr + prev;
            prev = temp;
        }
        return curr;
    }
    
    public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of stairs : ");
	    int n=sc.nextInt();
		System.out.println("The number of distinct ways to climb the ladder : "+calculate(n));
	}
}
