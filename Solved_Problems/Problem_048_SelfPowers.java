package Solved_Problems;

/*
The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
*/

import java.math.BigInteger;

public class Problem_048_SelfPowers
{
    public static void main(String[] args)
    {
        BigInteger sum = BigInteger.ZERO;
        String lastTenDigits;

        for(int i = 1; i <= 1000; i++)
            sum = sum.add(new BigInteger(String.valueOf(i)).pow(i));

        lastTenDigits = sum.toString().substring(sum.toString().length()-10, sum.toString().length());

        System.out.println(lastTenDigits);
    }
}
