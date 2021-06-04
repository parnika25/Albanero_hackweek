/*Write a program that takes an array of names and returns an array where only the first letter of each name is capitalized.

  Examples
    (["MAVIS", "senaida", "letty"]) ➞ ["Mavis", "Senaida", "Letty"]
    (["samuel", "MABELLE", "letitia", "meridith"]) ➞ ["Samuel", "Mabelle", "Letitia", "Meridith"]
*/

import java.util.*;
public class q3
{
    public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of elements ");
	    int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the names");
		for(int i=0;i<n;i++)
		{
		    arr[i]= sc.next();
		}
		System.out.println("The array after modification :");
		for(int i=0;i<n;i++)
        {
             arr[i] = (arr[i].substring(0, 1)).toUpperCase() + arr[i].substring(1, arr[i].length()).toLowerCase();
        }
		for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
	
		
	}
}
