import java.util.*;
public class q5
{
	public static void main(String[] args) 
	{
                int sum=0, k=0,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");		
		int n=sc.nextInt();
		int arr[] = new int[n];
		int a[]= new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
	
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2 == 0)
            {
            a[k++]=arr[i];
            c++;
            }
        }
        System.out.println("Final array :");
        for(int i=0;i<c;i++)
        {
            System.out.print(a[i] +" ");
        }
	}
}
