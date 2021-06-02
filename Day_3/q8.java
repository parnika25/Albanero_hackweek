import java.util.*;
public class q8
{
    String check_parity_bit(String str) 
    {
        int count =0;
        String res;
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i) == '1')
            count++;
        }
        if((count%2) == 0)
            res= str +"0";
        else
            res=str +"1";
        return res;
    }
    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		q8 obj = new q8();
		System.out.println("Enter the 7-bit code");
		String str=sc.nextLine();
		System.out.println("The eiight-bit code is: " +obj.check_parity_bit(str));
	}
}
