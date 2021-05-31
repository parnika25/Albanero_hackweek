import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int sum=0;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		int odd[] = new int[n];
		int even[] = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int x=0,y=0;
        for(int i=0;i<n;i++)
        {
            if((arr[i]% 2) == 0)
            even[x++] = arr[i];
            else
            odd[y++] = arr[i];
        }
        System.out.println("The Outliner Number is " + ((even.length > odd.length) ? odd[0] : even[0]));
	}
}	
