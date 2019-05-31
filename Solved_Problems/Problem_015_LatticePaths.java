package Solved_Problems;

import java.math.BigInteger;

class Problem_015_LatticePaths
{
    // Lattice paths

    /*
        Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.

        https://projecteuler.net/project/images/p015.gif

        How many such routes are there through a 20×20 grid?

     */

    public static void main(String[] args)
{
    System.out.println(binomial_coefficients(BigInteger.valueOf(20*2), BigInteger.valueOf(20)));
}

    private static BigInteger binomial_coefficients(BigInteger n, BigInteger k)
    {
        return factorial(n).divide((factorial(k)).multiply(factorial(n.subtract(k))));
    }

    private static BigInteger factorial(BigInteger n)
    {
        BigInteger fact = BigInteger.valueOf(1);
        for(BigInteger i = BigInteger.valueOf(1); i.compareTo(n) == -1; i=i.add(BigInteger.ONE))
            fact=fact.multiply(i);

        return fact;
    }
}
