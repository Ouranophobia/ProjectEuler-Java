package Solved_Problems;

/*

The 5-digit number, 16807=75, is also a fifth power. Similarly, the 9-digit number, 134217728=89, is a ninth power.

How many n-digit positive integers exist which are also an nth power?

 */

import java.math.BigInteger;
import java.util.ArrayList;

public class Problem_063_PowerfulDigitCounts
{
    public static void main(String[] args)
    {
        BigInteger x;
        ArrayList<BigInteger> list = new ArrayList<>();

        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 22; j++) {

                x = BigInteger.valueOf(i).pow(j);

                if(x.toString().length() == j)
                    if(!list.contains(x))
                        list.add(x);
            }
        }

        System.out.print(list.size());
    }
}
