/* The digit distance between two numbers is the total value of the difference between each pair of digits.

  To illustrate:
    (234, 489) ➞ 12
    // Since |2 - 4| + |3 - 8| + |4 - 9| = 2 + 5 + 5
  Write a program that returns the digit distance between two integers.

  Example
    (12, 12) ➞ 0
*/

import java.util.*;
public class q4
{
    static int diff(int n1, int n2)
    {
        int sum=0,d1,d2;
        while(n1!=0)
        {
            d1=n1%10;
            d2=n2%10;
            sum +=Math.abs(d1-d2);
            n1/=10;
            n2/=10;
        }
        return sum;
    }
    
    public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter two numbers ");
	    int n1=sc.nextInt();
	    int n2=sc.nextInt();
		System.out.println("The digit distance between two integers is : "+diff(n1,n2));
	}
}
