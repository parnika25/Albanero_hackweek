import java.util.*;
public class q2
{
	public static void main(String[] args) 
	{
	  int ndepth=0,count=0;
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		int len = s.length();
		if(len >= 1 && len <= 100)
		{
		for(int i=0;i<len;i++)
		{
		    if(s.charAt(i) == '(')
		    {
		        count ++;
		        ndepth = count;
		    }
		    else if(s.charAt(i) == ')')
		    {
		        count --;
		    }
		}
		System.out.println(ndepth);
		}
		else
		{
		    System.out.println("Invalid String");
		}
	}
}
