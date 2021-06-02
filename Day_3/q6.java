/* A repdigit is a positive number composed out of the same digit. Write a program that takes an integer and returns whether it's a repdigit or not.

  Examples
    (66) ➞ true

    (0) ➞ true

    (-11) ➞ false
*/

import java.util.*;
public class q6
{
    boolean repdigit(int n) 
    {
        char ch;
        String str = Integer.toString(n);
        if(n<0)
            return false;
        else if(n>=0)
        {
            ch = str.charAt(0);
            for(int i=0;i<str.length();i++)
            {
                if(ch!=str.charAt(i))
                    return false;
            }
        }
        return true;
    }
    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		q6 obj = new q6();
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean res = obj.repdigit(n);
		if(res)
		System.out.println("true");
		else
		System.out.println("false");
	}
}
