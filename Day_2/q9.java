import java.util.*;
public class q9
{
    boolean sum_two(int arr[], int n, int sum)
    {
        for(int i=0;i<n-1;i++)
        {
            int temp=arr[i];
            for(int j=0;j<n;j++)
            {
                if((temp+arr[j]) == sum)
                return true;
            }
        }
        return false;
    }
    
	public static void main(String[] args) 
	{
		int sum;
		Scanner sc = new Scanner(System.in);
		q9 obj = new q9();
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
		    arr[i]= sc.nextInt();
		}
		System.out.println("Enter the sum ");
		sum=sc.nextInt();
		boolean res = obj.sum_two(arr,n,sum);
		if(res)
		System.out.println("true");
		else
		System.out.println("false");
	}
}	
