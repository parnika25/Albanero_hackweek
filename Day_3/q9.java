/*Write a program that squares every digit of a number.

  Examples
    (9119) ➞ 811181
    
    (2483) ➞ 416649
*/

import java.util.*;
public class q9
{
    int digit_square(int n) 
    {
        String str="";
        while(n!=0)
        {
            int d=n%10;
            int sq=d*d;
            str=Integer.toString(sq)+str;
            n=n/10;
        }
        return (Integer.parseInt(str));
    }
    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		q9 obj = new q9();
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		System.out.println("The square of each digit in the number : " +obj.digit_square(n));
	}
}
