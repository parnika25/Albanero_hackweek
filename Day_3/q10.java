/* Write a program that returns the mean of all digits.
  Examples
    (42) ➞ 3
    (12345) ➞ 3
    (666) ➞ 6
*/    

import java.util.*;
public class q10
{
    int mean(int n) 
    {
        int sum=0,k=0;
        while(n!=0)
        {
            int d=n%10;
            sum=sum+d;
            n=n/10;
            k++;
        }
        int mean =sum/k;
        return mean;
    }
    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		q10 obj = new q10();
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		System.out.println("The mean of all the digits of the number : " +obj.mean(n));
	}
}
