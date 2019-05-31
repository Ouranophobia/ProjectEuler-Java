package Solved_Problems;

import static Unsolved_Problems.EulerMethods.permutation;
import java.math.BigInteger;

public class Problem_043_SubstringDivisibility
{
    public static void main(String[] args)
    {
        long start = System.nanoTime();
        int tmpNum; String tmpStr; boolean is = true;
        int[] divisors = {1,2,3,5,7,11,13,17};
        StringBuilder digits = new StringBuilder();
        BigInteger sum = BigInteger.ZERO;

       for(int i = 1; i < 3628800; i++){
               System.out.println(i);
               tmpStr = permutation(i);

               for (int j = 1; j < 8; j++) {
                   digits.append(tmpStr.charAt(j)).append(tmpStr.charAt(j+1)).append(tmpStr.charAt(j+2));
                   tmpNum = Integer.parseInt(digits.toString());
                   is = tmpNum % divisors[j] == 0;
                   digits = new StringBuilder();
                   if(!is)
                       break;
               }

               if(is)
                   sum = sum.add(new BigInteger(permutation(i)));
           }

           System.out.println(sum);
        long end = System.nanoTime();
        double ms = (double) (end - start) / 1000000.0;
        System.out.println(ms);
    }
}
