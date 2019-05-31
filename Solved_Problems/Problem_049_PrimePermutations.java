package Solved_Problems;



/* The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330, is unusual in two ways: (i) each of the three terms are prime, and, (ii) each of the 4-digit numbers are permutations of one another.

        There are no arithmetic sequences made up of three 1-, 2-, or 3-digit primes, exhibiting this property, but there is one other 4-digit increasing sequence.

        What 12-digit number do you form by concatenating the three terms in this sequence? */


import static Unsolved_Problems.EulerMethods.isPrime;

public class Problem_049_PrimePermutations
{
    public static void main(String[] args)
    {
        long start = System.nanoTime();
        int csum1=0, csum2=0, csum3=0; String tmpStr=""; byte[] b;


        for(int i = 1001; i < 3308; i++)
            if(isPrime(i) && isPrime((i+3330)) && isPrime((i+6660))) {
                tmpStr = String.valueOf(i);
                b = tmpStr.getBytes();
                for (int c : b)
                    csum1 += c;

                tmpStr = String.valueOf((i+3330));
                b = tmpStr.getBytes();
                for (int c : b)
                    csum2 += c;

                tmpStr = String.valueOf((i+6660));
                b = tmpStr.getBytes();
                for (int c : b)
                    csum3 += c;

                if(csum1 == csum2 && csum2 == csum3)
                    System.out.println(i + "" + (i + 3330) + "" + (i + 6660));

                else
                    csum1=0;csum2=0;csum3=0;
            }
        long end = System.nanoTime();
        double ms = (double) (end - start) / 1000000.0;
        System.out.println(ms);

    }
}
