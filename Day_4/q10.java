/* Given two strings s and t, check if s is a subsequence of t.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

  Examples:
  Input: s = "abc", t = "ahbgdc"
  Output: true
  Input: s = "axc", t = "ahbgdc"
  Output: false
*/

import java.util.*;
public class q10
{
    static boolean check(String s, String t)
    {
        int n1=s.length();
        int n2=t.length();
        if(n1>n2)
            return false;
        int i=0,j=0;
        while(i<n1 && j<n2)
        {
            if(s.charAt(i) == t.charAt(j))
            {
                i++;
                j++;
            }
            else
            j++;
        }
        return (i==n1);
    }
    
    public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter two strings : ");
	    String s=sc.nextLine();
	    String t=sc.nextLine();
	    
    	if(check(s,t))
    	System.out.println("true");
    	else
    	System.out.println("false");
	}
}
