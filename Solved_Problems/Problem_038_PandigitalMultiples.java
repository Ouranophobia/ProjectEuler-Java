package Solved_Problems;

import static Unsolved_Problems.EulerMethods.isPandigital;

/*
Take the number 192 and multiply it by each of 1, 2, and 3:

    192 × 1 = 192
    192 × 2 = 384
    192 × 3 = 576

By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)

The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).

What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n > 1?
*/

public class Problem_038_PandigitalMultiples
{
    public static void main(String[] args)
    {
        long start = System.nanoTime();
        StringBuilder s = new StringBuilder();
        boolean skip = false;
        int max = 0;

        for(int i = 100; i < 10000; i++) {
            for (int j = 1; s.length() < 9; j++) {
                skip = false;
                s.append(String.valueOf(i * j));
                if(s.length() > 9)
                    skip = true;
            }

            if(!skip)
                if(isPandigital(Integer.parseInt(s.toString())))
                    max = Integer.parseInt(s.toString());

            s = new StringBuilder();
        }

        System.out.println(max);
        long end = System.nanoTime();
        double ms = (double) (end - start) / 1000000.0;
        System.out.println(ms);

    }
}
