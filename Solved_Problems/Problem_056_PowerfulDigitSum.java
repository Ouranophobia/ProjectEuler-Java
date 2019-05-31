package Solved_Problems;

import java.math.BigInteger;

import static Unsolved_Problems.EulerMethods.charToInt;

public class Problem_056_PowerfulDigitSum
{
    public static void main(String[] args)
    {
        int maxSum = 0, tmp = 0;
        String num;
        BigInteger i = BigInteger.ONE, compare = BigInteger.valueOf(100);

        for(; i.compareTo(compare) < 1; i = i.add(BigInteger.ONE))
            for(int j = 1; j < 100; j++) {
                num = i.pow(j).toString();

                for(int k = 0; k < num.length(); k++)
                    tmp += charToInt(num.charAt(k));
                if(tmp > maxSum)
                    maxSum = tmp;
                tmp = 0;
            }

            System.out.println(maxSum);
    }
}
