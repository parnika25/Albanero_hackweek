/* Write a program that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.

  Examples
    arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]

    arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]
*/

import java.util.*;
public class q7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers num, length respectively");
		int num=sc.nextInt();
		int length=sc.nextInt();
		int arr[]=new int[length];
		for(int i=1;i<=length;i++)
    {
		       arr[i-1]= i*num;
		}
		System.out.println("The final array :");
		for(int i=0;i<length;i++)
		{
		      System.out.print(arr[i]+" ");
		}
	}
}
