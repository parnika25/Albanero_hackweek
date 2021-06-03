/* Given an integer num, return an array of the number of 1's in the binary representation of every number in the range [0, num].
  Example:
  Input: num = 5
  Output: [0,1,1,2,1,2]
  Explanation:
  0 --> 0
  1 --> 1
  2 --> 10
  3 --> 11
  4 --> 100
  5 --> 101
*/

import java.util.*;
public class q7
{
    static int[] calculate(int n)
    {
        int count[]=new int[n+1];
        count[0]=0;
        for(int i=1;i<=n;i++)
        {
            count[i]=0;
            int c=i;
            while(c!=0)
            {
                if(c%2 == 1)
                count[i]++;
                c/=2;
            }
        }
        return count;
    }
    
    public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    int n=sc.nextInt();
	    int arr[]=new int[n+1];
	    arr=calculate(n);
	    System.out.print("The Final result: ");
	    for(int i=0;i<=n;i++)
	    System.out.print(arr[i] +" ");
	}
}
