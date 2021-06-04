/* Given a simple sentence and a set of syntax rules, validate if it is syntactically correct or not. If correct return "True" otherwise "False".
Assume that a sentence is syntactically correct if it fulfills the following rules:
A sentence must start with an uppercase character.
There must be spaces between words.
Then the sentence must end with a full stop ( . ) 
Two continuous spaces are not allowed.
Two continuos uppercase characters are not allowed.
Examples:
Input : This sentence is syntactically correct.
Output : True
Input : This is   Syntactically correct.
Output : False
*/

import java.util.*;
public class q6
{

        static boolean sentence_check(String str)
        {
            int len=str.length();
            if (str.charAt(0) < 'A' || str.charAt(0) > 'Z')
                return false;
            if (str.charAt(len-1) != '.')
                return false;
            for(int i=0;i<len;i++)
            {
                if(str.charAt(i) == ' ' && str.charAt(i+1) == ' ')
                return false;
            }
            for(int i=0;i<(len-1);i++)
            {
                if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') && (str.charAt(i+1) >= 'A' && str.charAt(i+1) <= 'Z'))
                    return false;
            }
            return true;
        }
        
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the sentence ");
            String str=sc.nextLine();
            if(sentence_check(str))
            System.out.println("True");
            else
            System.out.println("False");
            
        }
}
