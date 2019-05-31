package Solved_Problems;

import java.math.BigInteger;
import static Unsolved_Problems.EulerMethods.*;

class Problem_020_FactorialDigitSum {
    /*
    n! means n × (n − 1) × ... × 3 × 2 × 1

    For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
    and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

    Find the sum of the digits in the number 100!

    */

    public static void main(String[] args)
    {
        int sum = 0;
        BigInteger n = factorial(100);
        String fact = n.toString();
        for(char c : fact.toCharArray())
            sum += charToInt(c);
        System.out.println(sum);
    }
}