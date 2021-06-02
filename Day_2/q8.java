import java.util.*;
public class q8
{
	public static void main(String[] args) 
	{
		int k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=1;i<=n;i++)
		{
		    if(n%i == 0)
		    arr[k++]=i;
		}
		for(int i=0;i<k;i++)
		{
		    System.out.println(arr[i]);
		}
	}
}	
