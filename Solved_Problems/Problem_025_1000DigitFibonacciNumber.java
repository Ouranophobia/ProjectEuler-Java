package Solved_Problems;

import java.math.BigInteger;

class Problem_025_1000DigitFibonacciNumber
    /*
    The Fibonacci sequence is defined by the recurrence relation:

        Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.

    Hence the first 12 terms will be:

        F1 = 1
        F2 = 1
        F3 = 2
        F4 = 3
        F5 = 5
        F6 = 8
        F7 = 13
        F8 = 21
        F9 = 34
        F10 = 55
        F11 = 89
        F12 = 144

    The 12th term, F12, is the first term to contain three digits.

    What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
     */
{
    public static void main(String[] args)
    {
        BigInteger fib1 = BigInteger.valueOf(1);
        BigInteger fib2 = BigInteger.valueOf(1);
        BigInteger fib = fib1.add(fib2);
        int count = 3;

        while (fib.toString().length() < 1000) {
            fib2 = fib1;
            fib1 = fib;
            fib = fib1.add(fib2);
            count++;
        }

        System.out.print(count);
    }
}
