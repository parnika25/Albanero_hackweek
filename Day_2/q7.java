import java.util.*;
public class q7
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int m=sc.nextInt();
		System.out.print("Enter the number of columns : ");
		int n=sc.nextInt();
		int arr[][] = new int[m][n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		    arr[i][j]=sc.nextInt();
		    }
		}
		System.out.println("The 2D matrix is :");
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		    System.out.print(arr[i][j] +" ");
		    }
		    System.out.println();
		}
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(arr[i][j]%2 == 0)
		        sum += arr[i][j];
		    }
		}
		System.out.println("The sum of even elements in 2D matrix is :  " +sum);
	}
}	
