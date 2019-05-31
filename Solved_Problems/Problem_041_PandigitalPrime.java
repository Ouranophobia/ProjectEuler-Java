package Solved_Problems;

import java.util.ArrayList;

import static Unsolved_Problems.EulerMethods.isPandigital;
import static Unsolved_Problems.EulerMethods.isPrime;
import static Unsolved_Problems.EulerMethods.sievePrime;

/*
We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once. For example, 2143 is a 4-digit pandigital and is also prime.

What is the largest n-digit pandigital prime that exists?
*/

public class Problem_041_PandigitalPrime
{
    public static void main(String[] args)
    {
        int max = 0;
        ArrayList<Integer> primes = sievePrime(7654321);
        for(int i: primes)
            if(isPandigital(i) && isPrime(i) && i > max)
                max = i;

        System.out.println(max);
    }
}
