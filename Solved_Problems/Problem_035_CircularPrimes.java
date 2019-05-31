package Solved_Problems;

import java.util.ArrayList;

import static Unsolved_Problems.EulerMethods.circular;
import static Unsolved_Problems.EulerMethods.isPrime;

/*
The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.

There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.

How many circular primes are there below one million?
*/

public class Problem_035_CircularPrimes
{
    public static void main(String[] args)
    {
        ArrayList<Integer> prime = new ArrayList<>();
        ArrayList<Integer> circlePrime = new ArrayList<>();
        boolean is = false;

        for(int i = 3; i < 1000000; i+=2) {
            if (isPrime(i))
                prime = circular(i);
            for(int p : prime)
                if (isPrime(p))
                    is = true;
                else {
                    is = false;
                    break;
                }

                if (is)
                    for (int p : prime)
                        if (!circlePrime.contains(p))
                            circlePrime.add(p);

        }

        System.out.println(circlePrime.size()+1);
    }
}
