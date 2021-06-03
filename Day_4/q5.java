/* Write a program that takes an array of two numbers and determines if the sum of the digits in each number are equal to each other.

  Examples
    ([105, 42]) ➞ true
          # 1 + 0 + 5 = 6
          # 4 + 2 = 6

    ([21, 35]) ➞ false

*/

import java.util.*;
public class q5
{
    static int add(int n)
    {
        int sum=0,d;
        while(n!=0)
        {
            d=n%10;
            sum +=d;
            n/=10;
        }
        return sum;
    }
    static boolean check(int n1, int n2)
    {
        if(add(n1) == add(n2))
        return true;
        else
        return false;
    }
    
    public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int arr[]=new int[2];
	    System.out.println("Enter two numbers for the array : ");
	    arr[0]=sc.nextInt();
	    arr[1]=sc.nextInt();
		if(check(arr[0],arr[1]))
		System.out.println("true");
		else
		System.out.println("false");
	}
}
