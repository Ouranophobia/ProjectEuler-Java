package Unsolved_Problems;

/*

A number chain is created by continuously adding the square of the digits in a number to form a new number until it has been seen before.

For example,

44 → 32 → 13 → 10 → 1 → 1
85 → 89 → 145 → 42 → 20 → 4 → 16 → 37 → 58 → 89

Therefore any chain that arrives at 1 or 89 will become stuck in an endless loop. What is most amazing is that EVERY starting number will eventually arrive at 1 or 89.

How many starting numbers below ten million will arrive at 89?

 */

import java.util.ArrayList;

import static Unsolved_Problems.EulerMethods.squareDigitChain;

public class Problem_092_SquareDigitChains
{
    public static void main(String[] args)
    {
        ArrayList<Integer> endsIn89 = new ArrayList<>();
        ArrayList<Integer> opt = new ArrayList<>();
        int constant;
        boolean b = true;

        for(int i = 1; i < 10000000; i++) {
            System.out.println(i);
            constant = i;

            while (b) {
                i = squareDigitChain(i);
                //System.out.println(i);
                if(opt.contains(i))
                {
                    endsIn89.add(constant);
                    i = constant; b = true;
                    break;
                }
                if(i == 89 || i == 1)
                    b = false;
            }
            if(i == 89) {
                endsIn89.add(constant);
                if(!opt.contains(constant))
                    opt.add(constant);
            }

            i = constant; b = true;
        }

        System.out.println(endsIn89.size());
    }
}
