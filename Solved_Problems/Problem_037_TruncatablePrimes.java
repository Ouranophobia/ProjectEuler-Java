package Solved_Problems;
import static Unsolved_Problems.EulerMethods.isTruncatablePrime;
import static Unsolved_Problems.EulerMethods.sievePrime;
import static Unsolved_Problems.EulerMethods.sumOfElements;
/*
The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.

Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
*/

import java.util.ArrayList;

public class Problem_037_TruncatablePrimes
{
    public static void main(String[] args)
    {
        long start = System.nanoTime();
        ArrayList<Integer> truncatable = new ArrayList<>();
        ArrayList<Integer> primes = sievePrime(1000000);

        for(int i : primes)
            if(isTruncatablePrime(i))
                truncatable.add(i);

        System.out.println(sumOfElements(truncatable));
        long end = System.nanoTime();
        double ms = (double) (end - start) / 1000000.0;
        System.out.println(ms);
    }
}
