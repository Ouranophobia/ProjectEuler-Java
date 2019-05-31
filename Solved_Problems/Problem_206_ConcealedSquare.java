package Solved_Problems;

/*Find the unique positive integer whose square has the form 1_2_3_4_5_6_7_8_9_0,
where each “_” is a single digit.*/

import java.math.BigInteger;

public class Problem_206_ConcealedSquare
{
    public static void main(String[] args)
    {
        String s;
        BigInteger test = new BigInteger("150000000");

        for(BigInteger i = new BigInteger("100000000"); i.compareTo(test) < 1; i = i.add(BigInteger.TWO)) {
            s = i.pow(2).multiply(BigInteger.valueOf(10)).toString();
            if (s.length() == 19)
                if (s.charAt(0) == '1' && s.charAt(2) == '2' && s.charAt(4) == '3' && s.charAt(6) == '4' && s.charAt(8) == '5'
                        && s.charAt(10) == '6' && s.charAt(12) == '7' && s.charAt(14) == '8' && s.charAt(16) == '9' && s.charAt(18) == '0')
                    System.out.println(i.toString());
        }

    }
}
