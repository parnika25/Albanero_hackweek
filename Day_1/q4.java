import java.util.*;
public class Main
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
         arr[i]+=1;
    }
    System.out.println("Elements after the addition of 1 :");
    for(int i=0;i<n;i++)
         System.out.println(arr[i]);
	}
}	
