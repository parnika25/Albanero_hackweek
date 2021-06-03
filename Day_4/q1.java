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
