package Solved_Problems;
import java.util.ArrayList;

import static Unsolved_Problems.EulerMethods.*;

class Problem_023_NonAbundantSums {
    /*
    A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

    A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.

    As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.

    Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
     */

    public static void main(String[] args)
    {
        long start = System.nanoTime();
        // ArrayList to hold all abundant numbers under 28123
        ArrayList<Integer> abnum = new ArrayList<>();
        // ArrayList to hold all numbers from 1 - 28122
        ArrayList<Integer> numSub = new ArrayList<>();
        // Variable to hold sum of all numbers under 28123 that aren't sums of two abundant numbers
        int sum = 0;
        // For-loop to append to my ArrayLists
        for(int i = 1; i < 28123; i++) {
            numSub.add(i);
            // Predefined method I made
            if (isAbundantNum(i))
                abnum.add(i);
        }
        // Enhanced for-loop to add every combination of the abundant numbers.
        // Including itself, as they mention 24 to be the sum of two abundant numbers 12 and 12.
        for (int j : abnum)
            for (int k : abnum)
                // If the sum is found in the ArrayList containing numbers 1 - 28122
                if(numSub.contains(j+k))
                    // We find the index of it and remove it from the ArrayList
                    // We are now left with an ArrayList whose numbers do not contain the sum of
                    // two abundant numbers.
                    numSub.remove(numSub.indexOf(j+k));
        // Enhanced for-loop to add up the ArrayList
        for(int x : numSub)
            sum += x;
        // Prints sum
        System.out.println(sum);
        long end = System.nanoTime();
        double ms = (double) (end - start) / 1000000.0;
        System.out.println(ms);
    }
}
