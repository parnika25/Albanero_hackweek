/*Parity bits are used as a very simple checksum to ensure that binary data isn't corrupted during transit. Here's how they work:

  If a binary string has an odd number of 1's, the parity bit is a 1.
  If a binary string has an even number of 1's, the parity bit is a 0.
  The parity bit is appended to the end of the binary string.
  Write a program that adds the correct parity bit to a binary string.

  Examples
    ("1011011") ➞ "10110111"
    -- There are five 1's.
    -- Since five is odd, the parity bit should be a 1.
    -- Add the parity bit to the end of the string.
    -- Return the result.

    ("0101101") ➞ "01011010"
*/

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
		System.out.println("The eight-bit code is: " +obj.check_parity_bit(str));
	}
}
