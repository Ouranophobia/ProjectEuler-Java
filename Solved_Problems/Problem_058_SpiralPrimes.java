package Solved_Problems;

import java.util.ArrayList;

import static Unsolved_Problems.EulerMethods.isPrime;

/*

Starting with 1 and spiralling anticlockwise in the following way, a square spiral with side length 7 is formed.

37 36 35 34 33 32 31
38 17 16 15 14 13 30
39 18  5  4  3 12 29
40 19  6  1  2 11 28
41 20  7  8  9 10 27
42 21 22 23 24 25 26
43 44 45 46 47 48 49

It is interesting to note that the odd squares lie along the bottom right diagonal, but what is more interesting is that 8 out of the 13 numbers lying along both diagonals are prime; that is, a ratio of 8/13 ≈ 62%.

If one complete new layer is wrapped around the spiral above, a square spiral with side length 9 will be formed. If this process is continued, what is the side length of the square spiral for which the ratio of primes along both diagonals first falls below 10%?

 */

public class Problem_058_SpiralPrimes
{
    public static void main(String[] args)
    {
        double percentage = 1.0, j;
        int x = 5, y = 4, c;
        ArrayList<Integer> primes = new ArrayList<>();

        for(double i = 3.0; percentage > 0.10; i+=2.0){

            c = (int)i; j = i - 1; i = Math.pow(i, 2);

            while(y > 0) {
                if (isPrime((int)i))
                    primes.add((int)i);
                i-=j;
                y--;
            }

            percentage =(double)primes.size()/x;

            if(percentage < 0.10)
                System.out.println(c);

            x+=4; i = c; y = 4;
        }

    }
}
