import java.util.*;
public class q6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no, common difference, total number. ");
		int first = sc.nextInt();
		int diff = sc.nextInt();
		int n=sc.nextInt();
		int arr[] = new int[n];
		arr[0]=first;
		for(int i=0;i<(n-1);i++)
		{
		    arr[i+1]=arr[i]+diff;
		}
		System.out.println("The Series in AP : ");
		for(int i=0;i<n;i++)
		    System.out.print(arr[i]+ ", ");
	}
}	
