import java.util.*;
public class q8
{

	    static int largest_sum(int arr[],int n,int k)
	    {
		int sum=0;
		for(int i=1;i<=k;i++)
		{
		    int min=arr[0];
		    int index=0;
		    for(int j=1;j<n;j++)
		    {
			if(arr[j]<min)
			{
			    min=arr[j];
			    index=j;
			}
		    }
		    if(min!=0)   
		    arr[index]=-arr[index];
		}

		for(int i=0;i<n;i++)
		{
		    sum+=arr[i];
		}
		return sum;
	    }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of elements ");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value of k");
		int k=sc.nextInt();
		System.out.print("The largest possible sum is : ");
		System.out.println(largest_sum(arr, n, k));
	}
}	
