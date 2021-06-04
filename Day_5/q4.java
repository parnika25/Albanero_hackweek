/* Given an array of integers, update every element with multiplication of previous and next elements with following exceptions. 
Note: a) First element is replaced by multiplication of first and second. 
      b) Last element is replaced by multiplication of last and second last.
Examples:
Input:  [2, 3, 4, 5, 6]
Output: [6, 8, 15, 24, 30]
      --> We get the above output using following
      --> arr[] = {2*3, 2*4, 3*5, 4*6, 5*6} 
*/

import java.util.*;
public class q4
{

        static int [] multiply(int arr[],int n)
        {
          int mult[] = new int[n];    
          if(n==1)
            return arr;
        
          for(int i=0;i<n;i++)
          {
            if(i==0)
                mult[i]=arr[i]*arr[i+1];
            else if(i==(n-1))
                mult[i]=arr[i-1]*arr[i];
            else
                mult[i]=arr[i-1]*arr[i+1];
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
            System.out.println("The array after multiplication : ");
            arr=multiply(arr,n);
            for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
        }
}        
