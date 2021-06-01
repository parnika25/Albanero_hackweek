import java.util.*;
import java.lang.Math;
public class q9
{

    int profit(int arr[],int n)
    {
            int mini=Integer.MAX_VALUE;
            int max_p=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]<mini)
                mini=arr[i];
                max_p= Math.max(max_p,(arr[i]-mini));
                
            }
        return max_p;
    }
    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		q9 obj=new q9();
		System.out.println("Enter the total number of elements ");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		System.out.print("The maximum profit earned is : ");
		System.out.println(obj.profit(arr, n));
	}
}	
