package Solved_Problems;

import static Unsolved_Problems.EulerMethods.*;

/*
The first two consecutive numbers to have two distinct prime factors are:

14 = 2 × 7
15 = 3 × 5

The first three consecutive numbers to have three distinct prime factors are:

644 = 2² × 7 × 23
645 = 3 × 5 × 43
646 = 2 × 17 × 19.

Find the first four consecutive integers to have four distinct prime factors each. What is the first of these numbers?
*/

public class Problem_047_DistinctPrimesFactors
{
    public static void main(String[] args)
    {
        long start = System.nanoTime();
        boolean num1 = false, num2=false, num3=false, num4=false;

        for(int i = 100000; i < 200000; i++) {
            if(primeDivisors(i).size() == 4) {
                num1 = primeDivisors(i).size() == 4;
                num2 = primeDivisors(i + 1).size() == 4;
                num3 = primeDivisors(i + 2).size() == 4;
                num4 = primeDivisors(i + 3).size() == 4;
            }

            if(num1 && num2 && num3 && num4){
                System.out.println(i);
                break;
            }
        }

        long end = System.nanoTime();
        double ms = (double) (end - start) / 1000000.0;
        System.out.println(ms);

    }
}
