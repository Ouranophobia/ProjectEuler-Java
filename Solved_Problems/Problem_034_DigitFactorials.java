package Solved_Problems;

import java.util.ArrayList;
import static Unsolved_Problems.EulerMethods.digitFactorial;

    /*
    145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

    Find the sum of all numbers which are equal to the sum of the factorial of their digits.

    Note: as 1! = 1 and 2! = 2 are not sums they are not included.
    */

public class Problem_034_DigitFactorials
{
    public static void main(String[] args)
    {
        int sum = 0;

        for(int i = 100; i < 100000; i++)
            if(digitFactorial(i) == i)
                sum += i;

        System.out.println(sum);
    }
}
