/* Given an integer array, replace each element with the product of every other element without using a division operator.
Examples:
        Input:  { 1, 2, 3, 4, 5 }
        Output: { 120, 60, 40, 30, 24 }
        Input:  { 5, 3, 4, 2, 6, 8 }
        Output: { 1152, 1920, 1440, 2880, 960, 720 }
*/

import java.util.*;
public class q8
{

        static int [] product(int arr[],int n)
        {
          int mult[] = new int[n];    
          if(n==1)
            return arr;
          
          for(int i=0;i<n;i++)
          {
                int pro=1;
                for(int j=0;j<n;j++)
                {
                    if(i==j)
                    continue;
                    pro=pro*arr[j];
                }
                mult[i]=pro;
          }
          return mult;
        }
        
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of elements ");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements ");
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            arr=product(arr,n);
            System.out.println("The final array :");
            for(int i=0;i<n;i++)
                System.out.print(arr[i]+ " ");
            
        }
}
