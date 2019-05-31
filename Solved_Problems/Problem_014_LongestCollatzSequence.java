package Solved_Problems;

class Problem_014_LongestCollatzSequence
{

    /*
    The following iterative sequence is defined for the set of positive integers:

    n → n/2 (n is even)
    n → 3n + 1 (n is odd)

    Using the rule above and starting with 13, we generate the following sequence:
    13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

    It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

    Which starting number, under one million, produces the longest chain?

    NOTE: Once the chain starts the terms are allowed to go above one million.
     */

    public static void main(String[] args)
    {
        long start = System.nanoTime();
        long startingNumber = 0, sequenceLength = 0, sequence;

        for(int i=999999, length=1; i > 1; i--, length=1) {
            sequence = i;
            while(sequence > 1)
            {
                if (sequence % 2 == 0)
                    sequence /= 2;
                else
                    sequence = 3 * sequence + 1;
                length++;
            }

            if (length > sequenceLength) {
                sequenceLength = length;
                startingNumber = i;
            }
        }

        System.out.println(startingNumber);
        long end = System.nanoTime();
        double seconds = (double) (end - start) / 1000000.0;
        System.out.println(seconds);
    }

}
