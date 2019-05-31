package Solved_Problems;
import java.util.ArrayList;

import static Unsolved_Problems.EulerMethods.charToInt;

import java.text.DecimalFormat;
public class Problem_033_DigitCancellingFractions
{
    /*
    The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify it may incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s.

    We shall consider fractions like, 30/50 = 3/5, to be trivial examples.

    There are exactly four non-trivial examples of this type of fraction, less than one in value, and containing two digits in the numerator and denominator.

    If the product of these four fractions is given in its lowest common terms, find the value of the denominator.
    */

    public static void main(String[] args)
    {
        double a, b, x, y;
        var products = new ArrayList<Double>();
        double lct = 1;

        for(int i =11; i < 100; i++)
            for(int j = 11; j < 100; j++) {
                x = charToInt(String.valueOf(i).charAt(0));
                y = charToInt(String.valueOf(j).charAt(1));
                a = charToInt(String.valueOf(i).charAt(1));
                b = charToInt(String.valueOf(j).charAt(0));

                if((double)i/j == x/y && y != 0 && (double) i/j < 1 && a == b) {
                    System.out.println(i + "/" + j + " " + x + "/" + y);
                    products.add((double)i/j);
                }
            }

            for(double d : products)
                lct *= d;

        DecimalFormat numberFormat = new DecimalFormat("#0.00");
        System.out.println(numberFormat.format(lct));
    }

}
