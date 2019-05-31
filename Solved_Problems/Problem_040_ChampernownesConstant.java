package Solved_Problems;

import static Unsolved_Problems.EulerMethods.charToInt;

/*
An irrational decimal fraction is created by concatenating the positive integers:

0.123456789101112131415161718192021...

It can be seen that the 12th digit of the fractional part is 1.

If dn represents the nth digit of the fractional part, find the value of the following expression.

d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000
*/

public class Problem_040_ChampernownesConstant
{
    public static void main(String[] args)
    {
        long start = System.nanoTime();
        StringBuilder num = new StringBuilder();

        for (int i = 1; num.length() <1000001; i++)
            num.append(String.valueOf(i));

        int value =
                charToInt(num.charAt(0)) *
                charToInt(num.charAt(9)) *
                charToInt(num.charAt(99)) *
                charToInt(num.charAt(999)) *
                charToInt(num.charAt(9999)) *
                charToInt(num.charAt(99999)) *
                charToInt(num.charAt(999999));

        System.out.println(value);
        long end = System.nanoTime();
        double ms = (double) (end - start) / 1000000.0;
        System.out.println(ms);
    }
}

