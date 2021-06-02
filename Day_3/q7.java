import java.util.*;
public class q7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers num, length respectively");
		int num=sc.nextInt();
		int length=sc.nextInt();
		int arr[]=new int[length];
		for(int i=1;i<=length;i++)
    {
		       arr[i-1]= i*num;
		}
		System.out.println("The final array :");
		for(int i=0;i<length;i++)
		{
		      System.out.print(arr[i]+" ");
		}
	}
}
