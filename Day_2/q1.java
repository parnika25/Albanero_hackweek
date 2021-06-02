import java.io.*;
import java.util.*;
public class q11
{
	static String check_String(String str)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String res = "";
		int i = 0;
		char ch;
		for (int j = 0; j < str.length(); j++) 
		{
			ch = str.charAt(j);
			if (!map.containsKey(ch))
				map.put(ch, i++);
			res += map.get(ch);
		}

		return res;
	}

	static void find_Matched_Words(String dict[], String pattern)
	{
		int len = pattern.length();
		String hash = check_String(pattern);
		for (String word : dict) 
		{
			if (word.length() == len && check_String(word).equals(hash))
				System.out.print(word + " ");
		}
	}

	public static void main(String args[])
	{
	    	Scanner sc = new Scanner(System.in);
		String dict[] = { "abb", "abc", "xyz", "xyy", "ccc", "mee"};
		System.out.println("Enter the pattern ");
		String pattern = sc.next();
        		System.out.println("The matched words are :");
		find_Matched_Words(dict, pattern);
	}

}
