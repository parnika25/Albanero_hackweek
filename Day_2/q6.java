import java.util.*;
public class q6
{
	public static void main(String[] args) 
	{
		int sum=0,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    if(arr[i]>=0)
		        count++;
		    else
		        sum += arr[i];
		}
		System.out.println(count +" , "+ sum );
	}
}	
