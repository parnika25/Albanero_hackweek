/* Write a program  that takes an array of arrays with numbers. Return a new (single) array with the largest numbers of each.

  Examples
    ([[-34, -54, -74], [-32, -2, -65], [-54, 7, -43]]) ➞ [-34, -2, 7]

    ([[0.4321, 0.7634, 0.652], [1.324, 9.32, 2.5423, 6.4314], [9, 3, 6, 3]]) ➞ [0.7634, 9.32, 9]
*/

public class q1
{
	public static void main(String[] args) 
	{
		double arr[][]= {{-34, -54, -74}, {1.324, 9.32, 6.4314}, {-54, 7, -43}};
		double max;
		double res[]=new double[3];
		int k=0;
		for(int i=0;i<3;i++)
		{
		    max= arr[i][0];
		    for(int j=0;j<3;j++)
		    {
		        if(arr[i][j]>max)
		            max = arr[i][j];
		    }
		    res[k++]=max;
		}
		System.out.println("The array with the largest numbers of each array ");
		for(int i=0;i<k;i++)
		System.out.print(res[i]+" ");
		
	}
}
