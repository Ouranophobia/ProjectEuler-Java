package Solved_Problems;

import java.math.BigInteger;

/*
It is possible to show that the square root of two can be expressed as an infinite continued fraction.

        √ 2 = 1 + 1/(2 + 1/(2 + 1/(2 + ... ))) = 1.414213...

        By expanding this for the first four iterations, we get:

        1 + 1/2 = 3/2 = 1.5
        1 + 1/(2 + 1/2) = 7/5 = 1.4
        1 + 1/(2 + 1/(2 + 1/2)) = 17/12 = 1.41666...
        1 + 1/(2 + 1/(2 + 1/(2 + 1/2))) = 41/29 = 1.41379...

        The next three expansions are 99/70, 239/169, and 577/408, but the eighth expansion, 1393/985, is the first example where the number of digits in the numerator exceeds the number of digits in the denominator.

        In the first one-thousand expansions, how many fractions contain a numerator with more digits than denominator?
*/

public class Problem_057_SquareRootConvergents
{
    public static void main (String[] args)
    {
        /*BigDecimal a = BigDecimal.valueOf(1/2);
        BigDecimal b = BigDecimal.ONE.divide(a.add(new BigDecimal(2)), 5, RoundingMode.CEILING);
        BigDecimal c = b;
        BigDecimal tmp;*/
        BigInteger temp, n = BigInteger.ZERO, d = BigInteger.ONE;
        int fractions = 0;

        for(int i = 1; i < 1001; i++) {
            /*a = c;
            b = BigDecimal.ONE.divide(a.add(new BigDecimal(2)), 1000, RoundingMode.HALF_DOWN);
            c = b;
            tmp = c.add(BigDecimal.ONE);
            BigInteger x = tmp.multiply(BigDecimal.TEN.pow(100)).toBigInteger();*/

            temp = d;
            d = (d.multiply(BigInteger.valueOf(2))).add(n);
            n = temp;
            temp = d.add(n);

            if(temp.toString().length() > d.toString().length())
                fractions++;

            System.out.println(fractions);
        }

    }

}
