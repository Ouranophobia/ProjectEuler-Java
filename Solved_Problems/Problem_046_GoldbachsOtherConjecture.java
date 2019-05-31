package Solved_Problems;

import java.util.ArrayList;

import static Unsolved_Problems.EulerMethods.sievePrime;

public class Problem_046_GoldbachsOtherConjecture
{
    public static void main(String[] args)
    {

        long start = System.nanoTime();
        ArrayList<Integer> primes = sievePrime(5000);
        boolean conjecture = true;

        for(int  oddComposite = 35; oddComposite < 6000; oddComposite += 2){
            outer:
            for(int i : primes)
                for (int j = 0; j < 70; j++) {

                    conjecture = true;

                    if (i + (2 * Math.pow(j, 2)) == oddComposite)
                        break outer;

                    else if (i + (2 * Math.pow(j, 2)) != oddComposite)
                        conjecture = false;

                }


            if(!conjecture) {
                System.out.println(oddComposite);
                break;
            }
        }

        long end = System.nanoTime();
        double ms = (double) (end - start) / 1000000.0;
        System.out.println(ms);
     }
}
