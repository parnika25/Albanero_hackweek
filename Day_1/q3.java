import java.util.*;
public class q3
{
	public static void main(String[] args) 
	{
	  int sum=0;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        
        if(sum%2 == 0)
        System.out.println("even");
        else
        System.out.println("odd");
	}
}	
