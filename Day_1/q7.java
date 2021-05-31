import java.util.*;
public class q7
{

    static int longestSeg(int arr[], int n, int k)
    {
    	int count_0 = 0;
    	int l = 0;
    	int max_len = 0;
    
    	for (int i = 0; i < n; i++) 
    	{
    		if (arr[i] == 0)
    			count_0++;
    
    		while (count_0 > k) 
    		{
    			if (arr[l] == 0)
    				count_0--;
    			l++;
    		}
    		max_len = Math.max(max_len, i - l + 1);
    	}
    	return max_len;
    }
    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of elements ");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the value of k");
		int k=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		System.out.println("The length of longest subarray is ");
		System.out.println( longestSeg(arr, n, k));
	}
}	
