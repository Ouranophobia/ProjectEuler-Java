package Solved_Problems;

import java.math.BigInteger;
import java.util.ArrayList;

class Problem_029_DistinctPowers
{
    public static void main(String[] args)
    {
        ArrayList<BigInteger> distinctPowers = new ArrayList<>();

        for(int i = 2; i <= 100; i++)
            for(int j = 2; j <= 100; j++)
                    distinctPowers.add(BigInteger.valueOf(i).pow(j));

        System.out.println(distinctPowers.size());
    }
}
