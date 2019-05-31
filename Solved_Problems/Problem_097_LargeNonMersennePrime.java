package Solved_Problems;

/*

The first known prime found to exceed one million digits was discovered in 1999, and is a Mersenne prime of the form 26972593−1; it contains exactly 2,098,960 digits. Subsequently other Mersenne primes, of the form 2p−1, have been found which contain more digits.

However, in 2004 there was found a massive non-Mersenne prime which contains 2,357,207 digits: 28433×27830457+1.

Find the last ten digits of this prime number.

 */

import java.math.BigInteger;

class Problem_097_LargeNonMersennePrime
{
    public static void main(String[] args)
    {
        System.out.print(BigInteger.valueOf(28433).multiply(BigInteger.TWO.pow(7830457)).add(BigInteger.ONE).toString().substring(2357197));
    }
}
