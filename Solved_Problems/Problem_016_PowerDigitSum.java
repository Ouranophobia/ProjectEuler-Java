package Solved_Problems;

import java.util.ArrayList;
import java.util.List;
import java.math.*;

class Problem_016_PowerDigitSum {

    /*
    215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

    What is the sum of the digits of the number 21000?
     */

    public static void main(String[] args)
    {
        BigDecimal num = BigDecimal.valueOf(2).pow(1000);
        String digits = String.format("%.0f", num);
        List<Integer> sumOfDigit = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < digits.length(); i++)
        {
            sumOfDigit.add(Integer.parseInt(String.valueOf(digits.charAt(i))));
            sum+=sumOfDigit.get(i);
        }

        System.out.print(sum);
    }
}
