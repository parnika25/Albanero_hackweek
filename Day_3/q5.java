/*An isogram is a word that has no duplicate letters. 
Write a program that takes a string and returns either true or false depending on whether or not it's an "isogram".
          Examples
            ("Algorism") ➞ true
            ("PasSword") ➞ false
            // Not case sensitive.
*/    

import java.util.*;
public class q5
{
    boolean isogram(String str) 
    {
        int count[] = new int[26];
        for (char c : str.toCharArray()) 
        {
            count[c - 'a']++;
            if(count[c - 'a'] >1)
                return false;
        }
        return true;
    }
    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		q5 obj = new q5();
		System.out.println("Enter the String");
		String str=sc.nextLine();
		boolean res = obj.isogram(str.toLowerCase());
		if(res)
		System.out.println("true");
		else
		System.out.println("false");
	}
}
