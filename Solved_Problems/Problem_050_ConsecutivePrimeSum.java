package Solved_Problems;

/*
The prime 41, can be written as the sum of six consecutive primes:
41 = 2 + 3 + 5 + 7 + 11 + 13

This is the longest sum of consecutive primes that adds to a prime below one-hundred.

The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.

Which prime, below one-million, can be written as the sum of the most consecutive primes?
*/

import java.util.ArrayList;

import static Unsolved_Problems.EulerMethods.isPrime;
import static Unsolved_Problems.EulerMethods.sievePrime;
import static Unsolved_Problems.EulerMethods.sumOfElements;

public class Problem_050_ConsecutivePrimeSum
{
    public static void main(String[] args)
    {

        ArrayList<Integer> primes = sievePrime(10000);
        ArrayList<Integer>tmp;
        int sum, amountOfConsecutivePrimes, max=0;

        for(int i = 0; i < primes.size(); i++)
            for(int j = primes.size()-1; j >= i; j--){
                tmp = new ArrayList<>(primes.subList(i, j));
                sum = sumOfElements(tmp);
                amountOfConsecutivePrimes = tmp.size();

                if (isPrime(sum) && sum < 1000000  && amountOfConsecutivePrimes > max) {
                    max = amountOfConsecutivePrimes;
                    System.out.println(sum + " " + amountOfConsecutivePrimes);
                }

            }


    }
}
