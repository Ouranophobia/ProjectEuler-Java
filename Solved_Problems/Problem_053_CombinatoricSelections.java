package Solved_Problems;

import java.math.BigInteger;

import static Unsolved_Problems.EulerMethods.combinatorics;


/*      There are exactly ten ways of selecting three from five, 12345:

        123, 124, 125, 134, 135, 145, 234, 235, 245, and 345

        In combinatorics, we use the notation, 5C3 = 10.

        In general,
        nCr =
        n!
        r!(n−r)!
        ,where r ≤ n, n! = n×(n−1)×...×3×2×1, and 0! = 1.

        It is not until n = 23, that a value exceeds one-million: 23C10 = 1144066.

        How many, not necessarily distinct, values of  nCr, for 1 ≤ n ≤ 100, are greater than one-million?  */


public class Problem_053_CombinatoricSelections
{
    public static void main(String[] args)
    {
        int count = 0;

        for(int i = 1; i <= 100; i++)
            for(int j = 1; j <= i; j++)
                if(BigInteger.valueOf(1000000).compareTo(combinatorics(i,j)) < 0)
                    count++;

                System.out.println(count);
    }
}
