import java.util.*;
public class q1
{
    public static void main(String []args)
    {
        int count;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        boolean visite[] = new boolean[n];
        System.out.println("Enter the elements ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            count=1;
            if(visite[i])
                continue;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                 visite[j]=true;
                 count++;;
                }
            }
            System.out.println("Count of "+arr[i]+ " -> "+count);
        }
    }
}
