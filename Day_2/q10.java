import java.util.*;
public class q10
{
    int max_sum(int arr[])
    {
        int temp,sum=0;
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<5;i++)
            sum+=arr[i];
        
        return sum;
    }
    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		q10 obj = new q10();
		int arr[] = new int[10];
		System.out.println("Enter the 10 elements of the array");
		for(int i=0;i<10;i++)
		{
		    arr[i]= sc.nextInt();
		}
		System.out.println("The maximum possible total made by summing just 5 of the 10 numbers is :  "+obj.max_sum(arr));

	}
}	
