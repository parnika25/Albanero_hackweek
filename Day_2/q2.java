import java.util.*;
class q12
{
    String sort_String(String str) 
    {
        int count[] = new int[26];
        for (char c : str.toCharArray()) 
        {
            count[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < str.length()) 
        {
            for (int i = 0; i < 26; i++) 
            {
                if (count[i] != 0) 
                {
                    char character = (char) (i + 97);
                    sb.append(character);
                    count[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) 
            {
                if (count[i] > 0) 
                {
                    char character = (char) (i + 97);
                    sb.append(character);
                    count[i]--;
                }
            }
        }
        return sb.toString();
    }

    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		q12 obj = new q12();
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.println("The final String is : " + obj.sort_String(str));
		
	}
}	
