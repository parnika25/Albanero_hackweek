import java.util.*;
public class q1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String str ="";
		if(n >= 1 && n <= 500)
		{
		if(n%2 == 0)
		{
		    for( int i=1; i<n; i++)
		    {
		       str += 'x';
		    }
		    str += 'y';
		}
		else
		{
		    for( int i=1; i<=n; i++)
		    {
		       str += 'x';
		    }
		}
		System.out.println(str);
		}
		else
		{
		    System.out.println("Invalid Input");
		}
	}
}
