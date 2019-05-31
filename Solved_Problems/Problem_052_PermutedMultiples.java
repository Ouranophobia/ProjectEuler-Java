package Solved_Problems;

/*  It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.

Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits. */

import static Unsolved_Problems.EulerMethods.isPandigitalOf;

public class Problem_052_PermutedMultiples
{
    public static void main(String[] args)
    {
        int smallest = 0;

        for(int i = 10; i < 200000; i++)
            if(isPandigitalOf((2*i), i))
                if(isPandigitalOf((3*i), i))
                    if(isPandigitalOf((4*i), i))
                        if(isPandigitalOf((5*i), i))
                            if(isPandigitalOf((6*i), i)) {
                                smallest = i;
                            }

        System.out.println(smallest);
    }
}
