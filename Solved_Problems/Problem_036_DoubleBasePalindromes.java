package Solved_Problems;

import java.math.BigInteger;
import java.util.ArrayList;

import static Unsolved_Problems.EulerMethods.isPalindrome;
/*
The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.

Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

(Please note that the palindromic number, in either base, may not include leading zeros.)
*/

public class Problem_036_DoubleBasePalindromes
{

    public static void main(String[] args)
    {
        ArrayList<BigInteger> palindrome = new ArrayList<>();
        ArrayList<BigInteger> binary = new ArrayList<>();
        int sum = 0;

        for(int i = 1; i < 1000000; i++)
            if(isPalindrome(BigInteger.valueOf(i)))
                palindrome.add(BigInteger.valueOf(i));

            for(BigInteger i : palindrome) {
                String s = i.toString(2);
                BigInteger b = new BigInteger(s);
                binary.add(b);
            }

            for(int i = 0; i < palindrome.size(); i++)
                if(isPalindrome(palindrome.get(i)) && isPalindrome(binary.get(i)))
                    sum += palindrome.get(i).intValue();

            System.out.println(sum);
    }

}
